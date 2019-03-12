package com.PriorityQueue.Grecia;

/* MyPair provides a generic class for representing an Element and Key pair as per assignment specifications. */
public class Pair<ElementType, KeyType> 
{
	/* First member of the pair is the element. */
	private ElementType el;
	
	/* Second member of the pair is the key. */
 	private KeyType key;
	
	/* Constructor. */
	Pair(ElementType el, KeyType key)
	{
		this.el = el;
		this.key = key;
	}
	
	/* Setters have not been implemented to make el and key immutable. */
	
	/* Getters */ 
	/* Returns the element. */
    public ElementType getElement() 
    {
        return el;
    }

    /* Returns the key. */
    public KeyType getKey() 
    {
        return key;
    }	
    
    /* Returns the element and key information. */
    public String toString() 
    {
        return "Element = " + getElement() + " , Key = " + getKey();
    }   
}