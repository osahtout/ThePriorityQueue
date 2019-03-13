/*******************************************************************************
 * SOEN 331
 * Assignment #3
 * Group Members: Grecia Olano O'Brien ID: 25372232, Moataz Fawzy ID: 27673817,
 * Omnia Gomaa ID: 40017116, Omar Sahtout ID: 40018126
 ******************************************************************************/

import java.util.*;

import be.ac.ua.ansymo.adbc.annotations.ensures;
import be.ac.ua.ansymo.adbc.annotations.requires;

/* The BinaryHeapPQ class is a Min-Heap implementation.*/
public class BinaryHeapPQ<ElementType, KeyType extends Comparable<KeyType>> implements PriorityQueue<ElementType, KeyType>
{	
	/* Attributes */
	private int numberOfElements;
	private final int capacity;
	private Pair<ElementType, KeyType>[] elements;
	
	/* Constructs a new Binary Heap. */
	@SuppressWarnings("unchecked")
	@requires ({"capacity > 0"})
	public BinaryHeapPQ(int capacity)
	{
		/* Sets the max. capacity. */
		this.capacity = capacity;
		/* Sets the numberOfElements of the elements array to max. capacity. */
		elements = new Pair[capacity];
		/* Sets the numberOfElements of the heap to 0 */
		numberOfElements = 0;
	}		
	
	/* Returns the position of the left child of a node. */
	private int leftChild(int i) 
	{
		return 2 * i + 1;
	}
	
	/* Returns the position of the right child of a node. */
	private int rightChild(int i) 
	{
		return 2 * i + 2;
	}
	
	/* Returns the position of the parent of a node. */
	private int parent(int i) 
	{
		return (i - 1) /2;
	}
	
	/* Returns the numberOfElements of the heap. */
	public int getNumberOfElements() 
	{
		return numberOfElements;
	}
	
	/* Returns the max. capacity */
	public int getCapacity()
	{
		return capacity;
	}
	
	/* Returns true if the heap has no elements, otherwise it returns false. */
	public boolean isEmpty() 
	{
		return numberOfElements == 0;
	}
	
	/* Returns true if the size of the heap is equal to maxSize, otherwise it returns false. */
	public boolean isFull() 
	{
		return numberOfElements == capacity;
	}
	/* The swap() method swaps the value of two indexes. */
	public void swap(int i, int j)
	{
		/* Stores the contents of elements[i] in temp, a variable of type MyPair<ElementType, KeyType */
		Pair<ElementType, KeyType> temp = elements[i];
		
		/* Performs actual the swapping operation */
		elements[i] = elements[j];
		elements[j] = temp;
	}
	
	/* The heapifyDown() method ensures min-heap is respected. */
	public void heapifyDown(int i)
	{
		/* Stores the position of the leftChild in the variable left */
		int left = leftChild(i);
		
		/* Stores the position of the rightChild in variable right */
		int right = rightChild(i);
		
		/* Stores the current position as min. */
		int min = i;
	
		/* Compares the key of the left child with the key of the parent, 
		if the key of the left child comes before the key of the parent,
		then the key of the left child becomes the min. */ 
		if (left <= numberOfElements - 1 && elements[left].getKey().compareTo(elements[i].getKey()) < 0)
			min = left;
		
		/* Compares the key of the right child with the key of the parent,
		if the key of the right child comes before the key of the parent,
		then the key of the right child becomes the min. */
		if (right <= numberOfElements - 1 && elements[right].getKey().compareTo(elements[min].getKey()) < 0)
			min = right;
		
		/* If the min does not equal the original parent, then the swap() method is invoked,
		and a recursive call to the heapifyDown() method is made. */
		if (min != i)
		{
			swap(min, i);
			heapifyDown(min);
		}
	}
	
	/* The heapifyUp() method ensures min-heap is respected. */
	public void heapifyUp(int i)
	{
		/* If the key of the element comes before the key of it parent,
		then the swap() method is invoked to change the indexes and
		a recursive call to the heapifyUp() method is made. */
		if (i > 0 && elements[i].getKey().compareTo(elements[parent(i)].getKey()) < 0) 
		{
			swap(i, parent(i));
			heapifyUp(parent(i));
		}
	}
	
	/* Implementing methods from the Priority Queue Interface */
	/* The insert(ElementType el, KeyType key) method inserts the pair (el, key). */
	@requires 
	({ 
		"el != null", 
		"key > 0", 
		"$this.isFull() == false"
	})
	@ensures 
	({ 
		"$this.contains(el)",
		"$this.getNumberOfElements() == $old($this.getNumberOfElements()) + 1"
	})
	public void insert(ElementType el, KeyType key) 
	{
		/* Stores the new pair at the bottom of the heap. */ 
		elements[numberOfElements]= new Pair<ElementType, KeyType>(el, key);
		
		/* Calls the heapifyUp() method. */
		heapifyUp(numberOfElements);
		
		/* Increases the heap size */
		numberOfElements++;
	}
	
	/* The remove() method removes and returns the element with the smallest key. */
	@requires 
	({
		"$this.isEmpty() == false"
	})
	@ensures 
	({
		"$result != null",
		"$this.getNumberOfElements() == $old($this.getNumberOfElements()) - 1"
	})
	public ElementType remove()
	{
		/* Calls the swap() method to swap the top of the heap with the element at the bottom of the heap. */ 
		swap(0, numberOfElements - 1);
		
		/* Stores the content of the element at the bottom of the heap (which has already been swapped). */
		Pair<ElementType, KeyType> temp = elements[numberOfElements-1];
		
		/* Removes the element from the array. */
		elements[numberOfElements - 1] = null;
		
		/* Decreases the heap size. */
		numberOfElements--;
		
		/* Calls the heapifyDown() method to maintain min-heap property. */
		heapifyDown(0);
		
		/* Returns the element with the smallest key which was previously stored in the temp variable. */
		return temp.getElement();
	}
	
	/* The min() method returns but does not remove the element with the smallest key. */
	public ElementType min()
	{
		/* Returns the element at the top of the heap. */
		return elements[0].getElement();
	}
		
	/* The contains() method return true if an element is included in the elements array. */
	@requires 
	({
		"el != null"
	})
	public boolean contains(ElementType el)
	{
		int count = numberOfElements;
		boolean result = false;
		
		for(int i = 0 ; i < count; i++)
		{
			if(el == elements[i].getElement())
			{
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	/* The asString() method returns a String representation of the elements array. */
	public void asString()
	{
		for(int i = 0; i < elements.length; i++)
			System.out.println(elements[i]);
	}
	
	public String toString() {
        return Arrays.toString(elements);
	}
	
}