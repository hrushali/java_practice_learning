import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;

public class arr_leftrev {
    public static void main(String[] args) {

        int n = 3; // number of left rotations
        int[] arr = new int[] {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) { // Correct the condition
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Move to a new line after printing original array

        // Perform n left rotations
        for (int i = 0; i < n; i++) {
            int first, j;
            first = arr[0];
            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = first;
        }

        System.out.println("Array after left rotations:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
