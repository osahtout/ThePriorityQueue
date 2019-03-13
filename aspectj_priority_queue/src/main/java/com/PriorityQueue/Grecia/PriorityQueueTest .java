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
		System.out.println("-----------------------------");

		BinaryHeapPQ<String, Integer> pqArray = new BinaryHeapPQ<>(10);
		
		System.out.println(pqArray.getClass());
		System.out.println();
		
		pqArray.insert("first", 1);
		pqArray.insert("last", 10);
		pqArray.insert("middle", 7);
		pqArray.insert("middle", 3);
		pqArray.insert("middle", 4);
		pqArray.insert("middle", 5);

		pqArray.asString();

		String pop = pqArray.remove();
		System.out.println();
		System.out.println(pop);
		System.out.println();

		pqArray.asString();
		
		System.out.println();
		System.out.println(pqArray.min());
		System.out.println();

		System.out.println("-----------------------------");

		System.out.println();
		
		PriorityQueue<String, Integer> myPQ = new BinaryHeapPQ<String, Integer>(10);
	    
		/* Testing the insert(el, key) */
		myPQ.insert("Element 20", 20);
		myPQ.insert("Element 18", 18);
		myPQ.insert("Element 44", 44);
		myPQ.insert("Element 3", 3);
		myPQ.insert("Element 13", 13);
		myPQ.insert("Element 9", 9);
		
		myPQ.asString();
		System.out.println();
			
		/* Testing the remove() method. */
		System.out.println(myPQ.remove());
		System.out.println();
		/* Output: Element 3 */

		/* While the Priority Queue is not empty, remove and return the element with the smallest key. */
	    while (!myPQ.isEmpty()) 
	    {
	    	System.out.println(myPQ.remove());               
	    	myPQ.asString();
	    	System.out.println();  
	    }
	        
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
