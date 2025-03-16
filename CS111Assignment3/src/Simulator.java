/*
 * @author Austin Driggs
 * CS 111 Section 002
 * Lab Assignment 3
 * Jakob Kaivo
 * Due 4/10/23
 * Purpose: Simulate a multiprogramming operating system dispatching processes
 */

// C:\Users\austi\OneDrive\Documents\CS111\input.txt

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Simulator {
	
	/*
	 * Class Name: Simulator
	 * Purpose: A Simulator class of static methods to simulate the execution of the set of processes
	 * Exceptions: None
	 */
	
	public static PriorityQueue enqueueProcesses(String filename, boolean priority) {
		
		/*
		 * Method Name: enqueueProcesses
		 * Purpose: Creates a new instance of PriorityQueue and enqueues instances of Processes from a file
		 * 		Opens filename for reading parses its contents, creating a PriorityQueue of Process objects. If the priority flag is 
		 * 		true, Processes are placed in the queue in priority order (using priorityEnqueue()); otherwise, Processes are place in 
		 * 		the queue in FIFO order (using enqueue()). Each line of the provided data file consists of two values: A process ID (a String), 
		 * 		and the burst time (in seconds as an integer). Create one Process object per line in the file, enqueue it using the appropriate 
		 * 		method, and return the queue when the data file has been completely read.
		 * Parameters: String filename and boolean priority
		 * Preconditions: valid filepath
		 * Postconditions: creates a new queue with all of the processes
		 * Exceptions: IOException e: invalid filepath
		 */
		
		PriorityQueue myQueue = new PriorityQueue();
		
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(new FileReader(filename));
		} catch (IOException e) {
			System.out.println("\nInvalid file path: " + filename + "\nPlease try again.\n");
		}
		
		while (inputFile.hasNext()) {
			
			String myID = inputFile.next();
			int myBurstTime = inputFile.nextInt() * 1000; // seconds to milliseconds
			
			Process myProcess = new Process(myID, myBurstTime);
			
			if (priority) {
				myQueue.priorityEnqueue(myProcess);
			}
			else {
				myQueue.enqueue(myProcess);
			}
			
		}
		
		return myQueue;
	}

	public static void simulate(PriorityQueue queue) {
		
		/*
		 * Method Name: simulate
		 * Purpose: Simulates the execution of processes in the system until all processes have completed
		 * Parameters: PriorityQueue queue
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: None
		 * 
		 * Extra Info:
		 * i.	There is no easy way to measure elapsed time, so we will simulate a clock using a loop that executes until there are no 
		 * 			more processes in the queue.  Each time a process executes it will run for its full time slice, or until it finishes 
		 * 			if it needs less than a full time slice.  You will need a variable that stores the current wall clock time:  After 
		 * 			loading processes, the simulation begins at time 0. This “clock” will advance as processes execute, by adding the 
		 * 			time a process executes to the time in the clock (i.e. the “clock” will increase by one time slice (in milliseconds) 
		 * 			every pass through the loop).
		 * ii.	The each iteration of the simulation should proceed as:
		 * 	1.	Dequeue the first process and simulate its execution by calling its execute() method. Print out a statement that that 
		 * 			the process was executed, showing the process ID and burst time remaining.  
		 * 	2.	If the process is not complete, add it back to the end of the queue (using enqueue(), not priorityEnqueue()).
		 * 	3.	If the process is complete, print out an additional line stating the process finished, its id, its total waiting time, 
		 * 			and its turnaround time.
		 * 		a. The turnaround time of a process is the total amount of time it spends in the system before completing it’s work.  It is the 
		 * 			total of all the time a process spends waiting and executing.  All processes enter the system at time zero.  This 
		 * 			should be in minutes and seconds.
		 * 		b. The wait time of a process is the total amount of time it spends waiting in the ready queue, it is the difference between the 
		 * 			current time, and the time that is last finished executing.  This should be in minutes and seconds
		 * iii.	For the entire set of processes you will ALSO calculate the average waiting time and the average turnaround time.  In theory, 
		 * 			executing the processes in order based on their burst time should produce a shorter average wait time.
		 * iv.	At the end of the simulation, you should print out the total elapsed time between when the simulation started (time zero) 
		 * 			and all processes finished.
		 */
		
		final int TIME_SLICE = 100; // milliseconds
		int currentTime = 0; // this acts as the clock
		
		int totalProcesses = 0;
		int totalWaitTime = 0;
		int totalTurnTime = 0;
		
		System.out.println();
		
		while (!queue.isEmpty()) {
			
			Process currentProcess = queue.dequeue();
			currentProcess.execute(currentTime);
			
			System.out.printf("%s executed; %s remaining. \n", currentProcess.getID(), timeToString(currentProcess.getBurst())); 
			// ProcA executed; 0:09.90 remaining.
			
			currentTime += TIME_SLICE;
			
			if (currentProcess.isComplete()) {
				
				System.out.println(currentProcess.getID() + " finished; " + timeToString(currentProcess.getWaitTime())
						+ " total wait time; " + timeToString(currentTime) + " turnaround time.");
				// ProcE finished; 00:47.00 total wait time; 01:01.00 turnaround time.
				
				totalWaitTime += currentProcess.getWaitTime();
				totalTurnTime += currentTime;
				totalProcesses++;
				
			}
			else {
				queue.enqueue(currentProcess);
			}
			
		}
		
		System.out.println(totalProcesses + " processes; " 
				+ timeToString(totalWaitTime / totalProcesses) + " average wait time; "
				+ timeToString(totalTurnTime / totalProcesses) + " average turnaround time; "
				+ "Total time elapsed: " + timeToString(totalTurnTime) );
		
		// 7 processes; 00:37.70 average wait time; 00:46.41 average turnaround time; Total time elapsed: 05:24.90
		
		// NOTE: I'm not sure why the total time elapsed is calculated this way and isn't just 
		// 	currentTime but this matches the word doc???
		
	}

	public static String timeToString(int total) {
	
		/*
		 * Method Name: timeToString
		 * Purpose: convert milliseconds into a more readible format for the console output
		 * Parameters: int total
		 * Preconditions: None
		 * Postconditions: returns a string for minutes:seconds.decimal or MM:SS:DD
		 * Exceptions: None
		 */
		
		int minutes = total / 60000;
		int seconds = (total % 60000) / 1000;
		int decimal = (total % 1000) / 10;
		String format = String.format("%02d", minutes) + ":" + String.format("%02d", seconds) + "." + String.format("%02d", decimal);
		
		return format;
		
	}
	
	public static void main(String[] args) {

		/*
		 * Method Name: 
		 * Purpose: main method that was provided to simulate the execution of processes, comparing priority queuing and FIFO queuing
		 * Parameters: String[] args
		 * Preconditions: Valid filepath
		 * Postconditions: None
		 * Exceptions: IOException e: invalid filepath
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter file name: "); // Prompt the user for the name of a data file
		String filename = scan.nextLine();
		scan.close();

		PriorityQueue fifo = enqueueProcesses(filename, false); // Creates a queue in FIFO order using enqueueProcesses()
		simulate(fifo); // simulate execution of that queue

		PriorityQueue priority = enqueueProcesses(filename, true); // Creates a queue in priority order using enqueueProcesses() 
		simulate(priority); // simulate execution of that queue
		
	}
	
}