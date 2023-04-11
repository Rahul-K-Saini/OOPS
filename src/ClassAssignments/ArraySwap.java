package ClassAssignments;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for (int i = 1; i <= 10; i++) {
            arr1[i-1] = 5*i; // Initializing arr1 with 10 multiples of 5
            arr2[i-1] = 7*i; // Initializing arr2 with 10 multiples of 7
        }
        // Printing arrays before Swapping them
        System.out.println("Array1 and Array2 before Swap: ");
        System.out.println("Array 1: "+Arrays.toString(arr1));
        System.out.println("Array 2: "+Arrays.toString(arr2));
        for (int i = 0; i < 10; i++) {
            int temp = arr1[i]; // Swapping array using temporary variables
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
        // Printing them after Swapping them
        System.out.println("Array1 and Array2 after Swap: ");
        System.out.println("Array 1: "+Arrays.toString(arr1));
        System.out.println("Array 2: "+Arrays.toString(arr2));

    }
}
