import java.util.Arrays;

/*
 * This class implements an array based Bag class.
 * This is a variation of the Bag class found in:
 * 
 * "Data Structures and Abstractions with JAVA"
 * by Frank Carrano and Timothy Henry
 * 
 * This must be a generic class, which instantiates the bag interface
 * with the same type.
 */

public class ArrayBag2023 <T> implements BagInterface<T>{

	/*
	 * The bag itself has data members and constructors
	 */
	 
	 private T[] elements; // These are the elements the Bag contains
	 private int currentSize;
	 private int maxSize;
	 private static final int DEFAULTSIZE = 10;
	 
	/*
	 * Default Constructor: sets the size of the Bag to DEFAULTSIZE
	 */
	 
	 public ArrayBag2023(){
		 
		 /* We MUST instantiate the elements array.  HOWEVER you can not 
		  * instantiate an array of a generic type, so we MUST use type object instead
		  * and cast
		  */  
		
		  this(DEFAULTSIZE); // Calls the non-default constructor
		  
	 }
	 
	 public ArrayBag2023(int capacity){
	  
	  //  ERROR checking?
	  
		 if ( capacity <= 0) {
			 throw new RuntimeException("You can not create a bag of capacity <= 0");
		 }
	
		 currentSize =0;
		 maxSize = capacity;
		 elements = (T[]) new Object[maxSize]; // This is how you instantiate an array of generic objects
	 }
	 
	 @Override
	 public int getCurrentSize() {
	  return currentSize;
	 }
	
	 public int getMaxSize() {
	  return maxSize;
	 }
	 
	 @Override
	 public boolean isEmpty() {
	  return (currentSize == 0); // Compares currentSize to 0 and returns true if currentSize = 0
	 }
	
	  @Override
	 public boolean isFull() {
	  return ( currentSize == maxSize); // Same idea
	 }
	 
	 @Override
	 public void add(T newEntry) {
		 /*
		  * How do we want add to work? What element? What position?
		  * 
		  * Our bag in unordered so we're not putting the element in at any certain index number.
		  * 
		  * For this implementation we want to add in the new element
		  * 
		  */
		 
		 if (this.isFull()) {
			 throw new RuntimeException("You can't add a new value to a full bag.");
		 }
		 else {
			 this.elements[this.currentSize] = newEntry;
			 currentSize++;
		 }
		 
	  }
	
	 @Override
	 public T remove() {
	  // always return the LAST element
	   // test if empty?

		 T returnValue = null;
	     
	     if (this.isEmpty()) {
	    	 throw new RuntimeException("Cannot remove from an empty bag.");
	     }
	     else {
	    	 returnValue = this.elements[currentSize - 1];
	    	 this.elements[this.currentSize - 1] = null;
	    	 this.currentSize--;
	     }
	     
	     return returnValue;
		 
	 }
	
	 @Override
	 public boolean remove(T anEntry) {
	  // iterate through the elements looking for a match and then 
	   // deleting the elements
		 
		 boolean isThere = false;
	   
//		 if (this.isEmpty()) {
//	    	 throw new RuntimeException("Cannot remove from an empty bag.");
//	     }
//	     else {
//
//	    	 for (int i = 0; i < currentSize - 1; ) {
//	    		 if (this.elements[i].equals(anEntry)) {
//	    			 this.elements[i] = this.elements[currentSize - 1];
//	    			 this.elements[currentSize - 1] = null;
//	    			 isThere = true;
//	    		 }
//	    		 else {
//	    			 i++;
//	    		 }
//	    	 }
//	    	 
//	     }
		 
		 return isThere;
	 }
	
	 @Override
	 public void clear() {
	  // TODO Auto-generated method stub
	  Arrays.fill( elements, null);
	  currentSize =0;	  
	 }
	
	 @Override
	 public int getCountOf(T anEntry) {
	  // TODO Auto-generated method stub
	  // counts the number of times an item is in the bag
	  int count = 0; 
	  
	  for (int i = 0; i < this.currentSize; i++) {
		  if (this.elements[i].equals(anEntry)) {
			  count++;
		  }
	  }
	
	  return count;
	 }
	
	 @Override
	 public boolean contains(T anEntry) {
	  // iterate throu the bag & return true if the "bag" contains the value "anEntry"
	   boolean isThere = false;
	   
	   for (int i = 0; i < this.currentSize; i++) {
			  if (this.elements[i].equals(anEntry)) {
				  isThere = true;
			  }
		  }
	 
	  return isThere;
	 }
	 
	 
	 @Override
	 public T[] toArray(){
	   T[] result = (T[]) new Object[this.currentSize];
	   
	   for (int i = 0; i < this.currentSize; i++) {
		   result[i] = this.elements[i];
	   }

	   
	   
	   return result;
	
	}
	
	 @Override
	 public String toString(){
	     String result ="";
	     // how do I go thourgh every thing in the bag?????
	     for( int i=0;  i < currentSize; i++){// iterate through the array elements???
	       
	      //retrieve an element
	       result += this.elements[i].toString() + " ";
	       // add a copy to the string
	     }
	     
	     return result;
	     
	   }

}
 
