package com.PriorityQueue.Grecia;

public class PriorityQueueTest {

	public static void main(String[] args) 
	{
		System.out.println("-----------------------------");

		BinaryHeapPQ<String, Integer> pqArray = new BinaryHeapPQ<>(10);
		System.out.println(pqArray.getClass());


		pqArray.insert("first", 1);
		pqArray.insert("last", 10);
		pqArray.insert("middle", 7);
		pqArray.insert("middle", 3);
		pqArray.insert("midl", 4);
		pqArray.insert("mid", 5);

		pqArray.asString();

		String pop = pqArray.remove();
		System.out.println(pop);
		System.out.println("***");

		pqArray.asString();
		System.out.println("***");
		System.out.println("#####");
		System.out.println(pqArray.min());
		System.out.println("#####");


		System.out.println("-----------------------------");





	//	testPriorityQueueWithKeyIntegers();
	    System.out.println();
	}
	    
	public static void testPriorityQueueWithKeyIntegers() 
	{
		PriorityQueue<String, Integer> myPQ = new BinaryHeapPQ<String, Integer>(20);
	    
		/* Testing the insert(el, key) */
		myPQ.insert("Element 20", 20);
		myPQ.insert("Element 18", 18);
		myPQ.insert("Element 44", 44);
		myPQ.insert("Element 3", 3);
		myPQ.insert("Element 13", 13);
		myPQ.insert("Element 9", 9);
		
		System.out.println(myPQ);
	    
		/* Output: 
		[Element = Element 3 , Key = 3, Element = Element 13 , Key = 13, Element = Element 9 , Key = 9, 
		Element = Element 20 , Key = 20, Element = Element 18 , Key = 18, Element = Element 44 , Key = 44, 
		null, null, null, null, null, null, null, null, null, null, null, null, null, null]
		*/
			
		/* Testing the remove() method. */
		System.out.println(myPQ.remove());
		/* Output: Element 3 */

		/* While the Priority Queue is not empty, remove and return the element with the smallest key. */
	    while (!myPQ.isEmpty()) 
	    {
	    	System.out.println(myPQ.remove());               
	        System.out.println(myPQ);
	    }
	    
	    /* Output:		
	    Element 9
	    [Element = Element 13 , Key = 13, Element = Element 18 , Key = 18, Element = Element 44 , Key = 44, Element = Element 20 , Key = 20, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
	    Element 13
	    [Element = Element 18 , Key = 18, Element = Element 20 , Key = 20, Element = Element 44 , Key = 44, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
	    Element 18
	    [Element = Element 20 , Key = 20, Element = Element 44 , Key = 44, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
	    Element 20
	    [Element = Element 44 , Key = 44, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
	    Element 44
	    [null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
	    */
	    
	    myPQ.insert("Toyota", 2);
	    myPQ.insert("Mercedes", 5);
	    myPQ.insert("Audi", 1);
	    
	    /* Testing the min() method. */
	    System.out.println(myPQ.min());
	    
	    /* Output:
	    Audi 
	    */
	}
}