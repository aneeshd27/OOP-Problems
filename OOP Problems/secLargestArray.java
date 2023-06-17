package xam;
import java.util.*;
public class secLargestArray {
	public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 8, 3};

        // Sort the array in non-descending order
        Arrays.sort(arr);

        // Return the second last element of the sorted array
        System.out.println("Second largest element: " + arr[arr.length - 2]);
    }

}
