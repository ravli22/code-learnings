package com.learning.datastructures.arrays;

public class CirculateTheArray {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7} ;
        System.out.println("printing the initial Array");
        printTheArray(intArray);

        circulateTheArrayNpostions(intArray, intArray.length,8);

        System.out.println("printing the rotated Array");
        printTheArray(intArray);

    }
    private static void circulateTheArrayNpostions(int[] intArray,int size,int numOfPositions) {
        numOfPositions = numOfPositions % size;
        for(int i=1;i<=numOfPositions;i++) {
            rotateArray(intArray,size);
        }

    }

    private  static void rotateArray(int[] intArray,int size) {
        //eg..{1,2,3,4,5,6,7}
        //  take index 0th element and put it in temp
        int temp = intArray[0];
        for(int i=0;i<size;i++) {
            if(i==size-1) { //reaches the end of the array - put the temp
                intArray[i] = temp;
            } else {
                intArray[i] = intArray[i+1];
            }
        }
    }

    private static void printTheArray(int[] integerArray) {
        for(int i : integerArray) {
            System.out.print(i+" ");
        }
    }
}
