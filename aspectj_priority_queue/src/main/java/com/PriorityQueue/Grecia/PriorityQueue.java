/*******************************************************************************
 * SOEN 331
 * Assignment #3
 * Group Members: Grecia Olano O'Brien ID: 25372232, Moataz Fawzy ID: 27673817,
 * Omnia Gomaa ID: 40017116, Omar Sahtout ID: 40018126
 ******************************************************************************/

/* The Priority Queue Interface defines the operations for a Priority Queue ADT. It contains the main functionality 
   specified in the assignment requirements - the insert(el, key), remove() and min() methods. */
public interface PriorityQueue<ElementType, KeyType extends Comparable<KeyType>> 
{
	/* All the methods declared in this interface are by default abstract (only method signature, no body). */
	/* The method insert(ElementType el, KeyType key) inserts the pair (el, key) into the Priority Queue. */
	public void insert(ElementType el, KeyType key);
	
	/* The contains() method return true if an element is part of the PriorityQueue */
	public boolean contains(ElementType el);
	
	/* The remove() method removes and returns the element with the smallest key. */
	public ElementType remove();

	/* The min() method returns but does not remove the element with the smallest key. */
	public ElementType min();
	
	/* The isEmpty() method returns true if the PriorityQueue has no elements. */
	public boolean isEmpty();
	
	/* The isFull() method return true if the PriorityQueue is full. */
	public boolean isFull();
	
	/* The asString() method returns a String representation of the Priority Queue. */
	public void asString();
}