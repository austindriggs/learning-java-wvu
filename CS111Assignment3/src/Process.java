/*
 * @author Austin Driggs
 * CS 111 Section 002
 * Lab Assignment 3
 * Jakob Kaivo
 * Due 4/10/23
 * Purpose: Simulate a multiprogramming operating system dispatching processes
 */

public class Process {
	
	/*
	 * Class Name: Process
	 * Purpose: tracks the execution of each process
	 * Exceptions: None
	 */
	
	private String id;
	private int burstTime;
	private int waitTime;
	private int lastTime;
	private final int TIME_SLICE = 100; // milliseconds
	
	public Process(String id, int burstTime) {
		
		/*
		 * Method Name: Process
		 * Purpose: Constructor
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: creates a new instance of Process
		 * Exceptions: None
		 */
		
		this.id = id;
		this.burstTime = burstTime;
		this.waitTime = 0;
		this.lastTime = 0;
		
	}

	public String getID() {

		/*
		 * Method Name: getID
		 * Purpose: returns the process ID
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns this process's ID
		 * Exceptions: None
		 */
		
		return this.id;
		
	}

	public int getBurst() {
		
		/*
		 * Method Name: getBurst
		 * Purpose: returns the burst time of the process in milliseconds
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns this burst time
		 * Exceptions: None
		 */
		
		return this.burstTime;
	}

	public int getWaitTime() {
		
		/*
		 * Method Name: getWaitTime
		 * Purpose: returns the total waiting time in milliseconds
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns this wait time
		 * Exceptions: None
		 */
		
		return this.waitTime;
	}

	public int getLastExecutionTime() {
		
		/*
		 * Method Name: getLastExecutionTime
		 * Purpose: returns the time since the beginning of simulation that the process was last execute in milliseconds
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns this last execution time
		 * Exceptions: None
		 */
		
		return this.lastTime;
	}

	public void execute(int currentTime) {

		/*
		 * Method Name: execute
		 * Purpose: Simulates the process consuming CPU time
		 * 		Calculate the time the process has been waiting for execution
		 * 		Update the last execution time to the end of the current time slice
		 * 		Reduce the process’s burst time by one time slice
		 * Parameters: int currentTime
		 * Preconditions: None
		 * Postconditions: updates all time variables
		 * Exceptions: None
		 */
		
		this.waitTime = (currentTime - this.lastTime) + this.waitTime;
		this.lastTime = currentTime + TIME_SLICE;
		this.burstTime -= TIME_SLICE;
		
	}

	public boolean isComplete() {

		/*
		 * Method Name: isComplete
		 * Purpose: returns if the process is complete or not
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns true if the process’s burst time is <= 0; otherwise returns false
		 * Exceptions: None
		 */
		
		boolean value = false;
		
		if (this.burstTime <= 0) {
			value = true;
		}
		
		return value;
		
	}
	
}