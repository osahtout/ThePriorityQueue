package com.PriorityQueue.Omar;
import java.util.*;

import java.util.Arrays;

public class BinaryHeap {

    private static int numberOfelements = 0;
    private int[] heapArray;
    private int maxSizeOfHeap;

    public BinaryHeap(int maxSizeOfHeap)
    {
        this.maxSizeOfHeap = maxSizeOfHeap;
        this.heapArray = new int[this.maxSizeOfHeap];
    }


    public int pop()
    {
        if(numberOfelements == 0)
            throw new NullPointerException("nothing in the heap");
        else{
            int pop = heapArray[0];
            heapArray[0] = heapArray[numberOfelements - 1];
            heapify(heapArray, 0);
            numberOfelements--;
            return pop;
        }
    }

    public boolean heapify(int[] heap, int index)
    {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largest = index;

        if( left < heap.length && heap[ left ] > heap[ largest ] )
            largest = left;
        if( right < heap.length && heap[ right ] > heap[ largest ] )
            largest = right;
        if( largest != index )
        {
            int temp = heap[ index ];
            heap[ index ] = heap[ largest ];
            heap[ largest ] = temp;
            heapify( heap, largest );
        }

        return true;
    }

        public boolean add(int toAdd)
        {
            if(numberOfelements != maxSizeOfHeap)
            {
                heapArray[numberOfelements-1] = toAdd;
                numberOfelements++;
                return true;
            }else return false;
        }



//    public void heapAtIndex(int index)
//    {
//
//        int largestChild;
//        int root = heapArray[index];
//
//        while (index < numberOfelements / 2)
//        {
//
//            int leftChild = 2 * index + 1; // Get the index for the leftChild
//            int rightChild = leftChild + 1; // Get the index for the rightChild
//
//            // If leftChild is less then rightChild save rightChild in largestChild
//            if (rightChild < numberOfelements && heapArray[leftChild] < heapArray[rightChild])
//            {
//                System.out.println("Put Value " + heapArray[rightChild] + " in largestChild");
//                largestChild = rightChild;
//            } else
//                {
//                    System.out.println("Put Value " + heapArray[leftChild] + " in largestChild");
//                    largestChild = leftChild; // Otherwise save leftChild in largestChild
//                 }
//
//            // If root is greater then the largestChild jump out of while
//            if (root >= heapArray[largestChild])
//            break;
//
//            System.out.println("Put Index Value " + heapArray[largestChild] + " in Index " + index);
//
//            // Save the value in largest child into the top index
//            heapArray[index] = heapArray[largestChild];
//            index = largestChild;
//        }
//        heapArray[index] = root;
//    }

//        // Cycle through the array and pop off each so
//        // the array goes from smallest to largest
//    public void heapSort() {
//
//        for (int k = maxSizeOfHeap - 1; k >= 0; k--) {
//
//            int largestNode = pop();
//            add(k, largestNode);
//
//            System.out.println(Arrays.toString(heapArray));
//        }
//    }




}
