/*
 * 2/8/23
 * 
 * 
 * 
 */

public class Notes {
	
/*
 * 
 * 
 * 
 * 
 * 
 */
	
/*
 * This is a variation of the BagInterface from the text:
 * "Data Structures and Abstractions with JAVA"
 * by Frank Carrano and Timothy Henry
 * 
 * This is a generic interface, the class which implements this  
 * interface, must be a generic container for values of any type
 * 
 * "T"  stands for some unknown class type
 */

public interface BagInterface <T>  {

/* 
 * getCurrentSize():   
 * This method returns the current number of items in the bag
 *  PreConditions: NONE
 *  PostConditions: NONE
 * 
 */
 public int getCurrentSize();

 /* 
  * isEmpty():  
  * This method returns true if the bag is empty
  *  PreConditions: NONE
  *  PostConditions:  returns TRUE if curretSize == 0
  * 
  */ 
public boolean isEmpty(); 

/* 
  * isFull():  
  * This method returns true if the bag is “full”
  *  PreConditions: NONE
  *  PostConditions:  returns TRUE if curretSize == maxSize
  * 
  */
public boolean isFull();

/*
  * add ( T newEntry):  
  *
  * This method adds a new entry into the Bag
  *
  *  PreConditions: isFull() == False
  *  PostConditions: elementList += newEntry, currentSize++
  *  Exceptions:  Throws BagException if  isFull() == TRUE
  * 
  */
 public void add(T newEntry);

/*
 * 
 * remove():  
 *
 * This removes a “random” item from the bag
 * 
 *  PreConditions: isEmpty() == False
 *  PostConditions: elementList -= newEntry, currentSize--
 *  Exceptions:  Throws BagException if  isEmpty() == TRUE
 * 
 */
 public T remove();

/*
  * 
  * remove (T anEntry):  
  *
  * This method returns true if the bag contains 
  * a specific entry, and that entry is successfully removed from 
  * the bag. 
  * 
  *
  *  PreConditions: isEmpty() == False, contains( T anEntry) == True;
  *  PostConditions: returns Ture if contains ( T anEntry) == true &&
  *  elementList -= newEntry
  *  if contains( T anEntry) == False, return False
  *  Exceptions:  Throws BagException if  isEmpty() == TRUE
  * 
  */
 public boolean remove(T anEntry);

/* 
  * 
  * clear():  
  * 
  *  Empties the Bag
  * 
  *  PreConditions: NONE
  *  PostConditions: elementList == NULL
  *  Exceptions:  NONE
  * 
  */
public void clear();

 /*
  * 
  * getCountOf(T anEntry):  
  *
  *  returns the number of times "anEntry" occurs in the Bag
  * 
  *
  *  PreConditions: NONE
  *  PostConditions: NONE
  *  Exceptions:  NONE
  * 
  */
public int getCountOf(T anEntry);

/*
  * 
  * contains(T anEntry):  
  *
  *  returns true if the Bag contains "anEntry"
  * 
  *
  *  PreConditions: NONE
  *  PostConditions: None
  *  Exceptions:  NONE
  * 
  */
 public boolean contains(T anEntry);
 /*
  * 
  * toArray():  
  * 
  * Returns an array containing the contents of the bag, returns NULL 
  * if the bag is empty
  * 
  */
 public T[] toArray();
  /*
  * 
  * toString():  
  *
  * Overrides inherited method from class Object,
  * returns a String containing the contents of the bag
  * 
  */
 public String toString();
 
}

/* 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
