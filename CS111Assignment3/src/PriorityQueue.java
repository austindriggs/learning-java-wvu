/*
 * @author Austin Driggs
 * CS 111 Section 002
 * Lab Assignment 3
 * Jakob Kaivo
 * Due 4/10/23
 * Purpose: Simulate a multiprogramming operating system dispatching processes
 */

public class PriorityQueue {

	/*
	 * Class Name: PriorityQueue
	 * Purpose: elements are added after elements of higher priority, but before elements of lower priority, rather than just at the end 
	 * 	of the queue. this is determined by the burst times of the processes.
	 * Exceptions: QueueException for removing from an empty queue
	 */
	
	private Node head;
	private Node tail;
	private int currentSize;
	
	public class QueueException extends RuntimeException {
		
		/*
		 * Class Name: QueueException
		 * Purpose: throws an exception if you try to remove from an empty queue
		 * Exceptions: QueueException as RuntimeException
		 */
		
		public QueueException(String message) {
			
			/*
			 * Method Name: QueueException
			 * Purpose: throws an exception if you try to remove from an empty queue
			 * Parameters: String message
			 * Preconditions: None
			 * Postconditions: throws error
			 * Exceptions: QueueException as RuntimeException
			 */
			
			super(message);
		}
	} // END QUEUEEXCEPTION CLASS
	
	public class Node {
		
		/*
		 * Class Name: Node
		 * Purpose: used to create a linked queue
		 * Exceptions: None
		 */
		
		private Process myNode;
		private Node next;
		
		public Node(Process data, Node next) {
			
			/*
			 * Method Name: Node
			 * Purpose: constructor
			 * Parameters: Process data and Node next
			 * Preconditions: None
			 * Postconditions: creates a new instance of a Node
			 * Exceptions: None
			 */
			
			this.myNode = data;
			this.next = next;
			
		}
		
		public Process getData() {
			
			/*
			 * Method Name: getData
			 * Purpose: returns a reference to the data object stored in this node
			 * Parameters: None
			 * Preconditions: None
			 * Postconditions: None
			 * Exceptions: returns a reference to the data object stored in this node
			 */
			
			return this.myNode;
			
		}
		
		public void setData(Process proc) {
			
			/*
			 * Method Name: setData
			 * Purpose: updates the node to reference a new data object
			 * Parameters: Process proc
			 * Preconditions: None
			 * Postconditions: sets this Nodes data to proc
			 * Exceptions: None
			 */
			
			this.myNode = proc;
			
		}

		public Node getNext() {
			
			/*
			 * Method Name: getNext
			 * Purpose: returns a reference to the next node in the list
			 * Parameters: None
			 * Preconditions: None
			 * Postconditions: returns the next node in the list
			 * Exceptions: None
			 */
			
			return this.next;
		}

		public void setNext(Node node) {
			
			/*
			 * Method Name: setNext
			 * Purpose: updates the node to change what the next node refers to
			 * Parameters: Node node
			 * Preconditions: None
			 * Postconditions: updates the node to change what the next node refers to
			 * Exceptions: None
			 */
			
			this.next = node;
			
		}
		
	} // END NODE CLASS
	
	public PriorityQueue() {
		
		/*
		 * Method Name: PriorityQueue
		 * Purpose: Constructor
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: creates a new instance of Priority Queue
		 * Exceptions: None
		 */
		
		this.head = null;
		this.tail = null;
		this.currentSize = 0;
		
	}

	public void priorityEnqueue(Process proc) {
		
		/*
		 * Method Name: priorityEnqueue
		 * Purpose: adds a new Process to the queue, based on the burst time of the process.
		 * 		Processes with the shortest burst time should be at the front of the queue.  If an existing process in the queue 
		 * 		has the same burst time as the new one, the new process goes after the existing process.
		 * Parameters: Process proc
		 * Preconditions: None
		 * Postconditions: adds the new Process to the queue where it should be in order of burst times
		 * Exceptions: None
		 */
		
		Node inchWorm = this.head;
		Node newNode = new Node(proc, null);
		Node prevNode = inchWorm;
		int startCurrentSize = this.currentSize;
		
		for (int i = 0; i < this.currentSize; i++) {
			
			if (newNode.getData().getBurst() < inchWorm.getData().getBurst()) {
				if (this.currentSize == 0) {
					enqueue(proc);
				}
				else if (this.currentSize == 1) {
					newNode.setNext(this.head);
					this.head = newNode;
				}
				else {
					prevNode.setNext(newNode);
					newNode.setNext(inchWorm);
				}
				this.currentSize++;
				break;
			}
			
			prevNode = inchWorm;
			inchWorm = inchWorm.getNext();
			
		}
		
		if (this.currentSize == startCurrentSize) {
			enqueue(proc);
		}
		
	}

	public void enqueue(Process proc) {
		
		/*
		 * Method Name: enqueue
		 * Purpose: takes a Process and adds it to the end of the queue (this method does not take priority into account)
		 * Parameters: Process proc
		 * Preconditions: None
		 * Postconditions: adds the new Process to the queue
		 * Exceptions: None
		 */
		
		Node newNode = new Node(proc, null);
		
		if (this.isEmpty()) {
			this.head = newNode;
			this.tail = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
		
		this.currentSize++;
		
	}

	public Process dequeue() {
		
		/*
		 * Method Name: dequeue
		 * Purpose: returns the first Process in the queue after removing if from the queue
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: removes and returns the dequeued Process
		 * Exceptions: QueueException if the queue is empty
		 */
		
		if (this.currentSize == 0) {
			throw new QueueException("The queue is empty so there is nothing to be dequeued.");
		}
		
		Node oldHead = this.head;
		
		if (this.currentSize == 1) {
			this.head = null;
			this.tail = null;
		}
		else if (this.currentSize == 2) {
			this.head = this.tail;
		}
		else {
			this.head = oldHead.getNext();
		}
		
		this.currentSize--;
		
		return oldHead.getData();
		
	}

	public boolean isEmpty() {

		/*
		 * Method Name: isEmpty
		 * Purpose: check if the queue is empty
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns true if the queue is empty and false if not
		 * Exceptions: None
		 */
		
		return (this.currentSize == 0);
		
	}
	
}