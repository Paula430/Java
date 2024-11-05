/*
* UserInfoSort
*
* Version 1.0 - 2024-10-30
*
* Description:
* This is a console application that prints information about
* the user.
* User information is passed as a parameter to the main method.
* Additionally demonstrates a sorting algorithm - bubbleSort.
*
* Copyright notice: Copyright (c) 2024 Kawalec Paula. All rights reserved.
*/

/**
* The UserInfoSort class implements an application that sorts array, prints "Hello" and
* the passed argument.
*/
public class UserInfoSort {

    /**
    *Bubble sort method
    *@param arr- array to sort
    *@param n- array length 
    */
    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    /*Swap arr[j] and arr[j+1]*/
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            /*
	    *If no two elements were
            * swapped by inner loop, then break
	    */
            if (swapped == false)
                break;
        }
    }


    /**
    *Function to print array
    *@param arr- array to print
    *@param size- array size 
    */
    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public final static void main(String[] args) {
	System.out.println("Hello" + " " + args[0]);

	int[] array={5,7,2,9,3};
	int n= array.length;
	
	System.out.println("\nArray before sorting:");
	printArray(array,n);
	bubbleSort(array,n);
	System.out.println("\nSorted array: ");
	printArray(array,n);
    }

}

