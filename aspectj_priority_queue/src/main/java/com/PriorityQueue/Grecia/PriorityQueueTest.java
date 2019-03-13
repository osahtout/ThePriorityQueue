/*******************************************************************************
 * SOEN 331
 * Assignment #3
 * Group Members: Grecia Olano O'Brien ID: 25372232, Moataz Fawzy ID: 27673817,
 * Omnia Gomaa ID: 40017116, Omar Sahtout ID: 40018126
 ******************************************************************************/

public class PriorityQueueTest 
{
	public static void main(String[] args) 
	{
		// Failed contracts are commented out. //
		
				// Test #1: Creating a Heap with a capacity of 10.
				BinaryHeapPQ<String, Integer> myHeap = new BinaryHeapPQ<>(10);
				// Output: 10
				System.out.println(myHeap.getCapacity());
				
				// Test #2: Creating a Heap with a capacity of 0.
				// BinaryHeapPQ<String, Integer> myHeap = new BinaryHeapPQ<>(0);
				// Output: 
				// Precondition broken!
				// Contract: capacity > 0
				// Where: public BinaryHeapPQ(int)
						
				System.out.println();
				
				// Test #3: Inserting elements into the Priority Queue, using a pair of type String, Integer. 
				BinaryHeapPQ<String, Integer> myPQ1 = new BinaryHeapPQ<>(10);
				myPQ1.insert("first", 2);
				myPQ1.insert("last", 10);
				myPQ1.insert("middle", 7);
				myPQ1.insert("middle", 3);
				myPQ1.insert("middle", 4);
				myPQ1.insert("middle", 5);
					
				System.out.println(myPQ1.min());	
				System.out.println(myPQ1.isEmpty());	
				System.out.println(myPQ1.isFull());
				
				System.out.println(myPQ1.contains("last"));
				System.out.println(myPQ1.contains("tomato"));
				
				// Test #4: Inserting elements into the Priority Queue, leaving the first member of the pair (of String type), empty.
				// BinaryHeapPQ<String, Integer> myPQ2 = new BinaryHeapPQ<>(2);
				// myPQ2.insert(null, 1);
				// Output:
				// Precondition broken!
				// Contract: el != null
				// Where: public void BinaryHeapPQ.insert(java.lang.Object, java.lang.Comparable)
				// Blame: PriorityQueueTest.main

				// Test #5: Inserting elements into the Priority Queue, entering a key of value.
				// BinaryHeapPQ<String, Integer> myPQ3 = new BinaryHeapPQ<>(2);
				// myPQ3.insert("first", 0);
				// Output:
				// Precondition broken!
				// Contract: key > 0
				// Where: public void BinaryHeapPQ.insert(java.lang.Object, java.lang.Comparable)
				// Blame: PriorityQueueTest.main
								
				// Test #6:  
				// System.out.println(myPQ1.contains(null));
				// Precondition broken!
				// Contract:	el != null
				// Where:		public boolean BinaryHeapPQ.contains(java.lang.Object)
				// Blame:		PriorityQueueTest.main		

				//pqArray.asString();
				
				/*
				PriorityQueue<String, Integer> myPQ = new BinaryHeapPQ<String, Integer>(10);
			    
				/* Testing the insert(el, key) 
				myPQ.insert("Element 20", 20);
				myPQ.insert("Element 18", 18);
				myPQ.insert("Element 44", 44);
				myPQ.insert("Element 3", 3);
				myPQ.insert("Element 13", 13);
				myPQ.insert("Element 9", 9);
				
				myPQ.asString();
				System.out.println();
					
				/* Testing the remove() method. 
				System.out.println(myPQ.remove());
				System.out.println();
				/* Output: Element 3 */

				/* While the Priority Queue is not empty, remove and return the element with the smallest key. 
			    while (!myPQ.isEmpty()) 
			    {
			    	System.out.println(myPQ.remove());               
			    	myPQ.asString();
			    	System.out.println();  
			    }
			        
			    myPQ.insert("Toyota", 2);
			    myPQ.insert("Mercedes", 5);
			    myPQ.insert("Audi", 1);
			    
			    /* Testing the min() method. 
			    System.out.println(myPQ.min());
			    
			    /* Output:
			    Audi 
			    */
	}
}