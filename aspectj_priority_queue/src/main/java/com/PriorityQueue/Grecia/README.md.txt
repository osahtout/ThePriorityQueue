# SOEN 331 - Assignment 3: Contract Programming
This project uses a Binary Heap for the implementation of the Priority Queue ADT in Java. Both the heap and the priority queue have been defined from scratch. 

The interface of the Priority Queue ADT contains the following main functionality: 
**insert(ElementType el, KeyType key)** which inserts the pair (el, key) into the priority queue. 
**remove()** which removes and returns the element with the smallest key. 
**min()** which returns but does not remove the element with the smallest key.

Functions **remove()** and **min()** follow the rules of 3 a regular queue in the case where the collection contains more than one entry with the same key. 

Contractual specifications have been provided through third party support (adbc in Java).

# Getting Started
Adbc is a tool that supports contract programming in AspectJ. As AspectJ is a superset of Java, this implies that any valid Java program is also a valid AspectJ program. These instructions will allow the reader to deploy adbc to an existing Java project.

## Prerequisites
Have a Java IDE installed, such as Eclipse 4.7 (OXYGEN).

## Installing the AspectJ Plugin
AspectJ is provided as a plugin to Eclipse and it is available here for different versions of Eclipse:
https://www.eclipse.org/ajdt/downloads/

To install the development builds for Eclipse 4.7:
1. Open the Eclipse IDE.
2. From the menu bar select Help > Install New Software...
3. Click on Add...
4. In the Add Repository window include:
**Name**: ajdt 4.7
**Location**: http://download.eclipse.org/tools/ajdt/47/dev/update
5. Click on OK.
6. In the Install window, make sure to check the boxes next to: 
**AspectJ Development Tools (Required)**
**AspectJ Development Tools Source (Optional)**
**Other AJDT Tools (Optional)**
7. Click on Next.
8. Review the items to be installed and click on Next.
9. Review the licenses, accept the terms and click on Finish.
10. Restart Eclipse for the changes to take effect.

## Converting a Java Project Into an AspectJ Project
1. From the menu bar, select Navigate >  Show In >  Package Explorer. If the  Package Explorer is not already open, then it opens in the current perspective. 
2. Right-click on the project name in Package Explorer and go to Configure > Convert to AspectJ Project.

## Downloading adbc 
Adbc is a small library that adds support for design by contract to the AspectJ programming language.

Use the following adbc library: https://github.com/timmolderez/adbc 
1. Download the most recent version: adbc-0.3.1.zip (March 7 2014) 
2. Unzip the file and place the jar file directly in your Eclipse workspace folder.

## Installing adbc 
To install adbc,  include the jar file on the build path of your AspectJ project. 
1. Right-click on the name of your AspectJ project and go to Properties. 
2. Go to AspectJ Build > Inpath.
3. Click on Add External JARs... and navigate through your folder structure to select the appropriate jar file.
4. Click OK to confirm the changes and close the Properties window. 

From this point on, it should be possible to start writing contracts using the annotations available in the be.ac.ua.ansymo.adbc.annotations package.

# Running the Code
To test the constracts:
1. Open Eclipse.
2. Run PriorityQueueTest.java as an AspectJ/Java Application. 

The test include successful contract implementation, whereas as failed contracts are commented out. 

The format is as follows:
// Test #Number: Description
// Successful Output

// Test #Number: Description
// Unsuccessful Output including information for any broken preconditions and postconditions.

An example:
BinaryHeapPQ<String, Integer> myHeap = new BinaryHeapPQ<>(10);
// Output: 10
System.out.println(myHeap.getCapacity());
				
// Test #2: Creating a Heap with a capacity of 0.
// BinaryHeapPQ<String, Integer> myHeap = new BinaryHeapPQ<>(0);
// Output: 
// Precondition broken!
// Contract: capacity > 0
// Where: public BinaryHeapPQ(int)

# Authors
List of contributors who participated in this project:
- Grecia Olano O'Brien ID: 25372232
- Moataz Fawzy ID: 27673817
- Omnia Gomaa ID: 40017116
- Omar Sahtout ID: 40018126