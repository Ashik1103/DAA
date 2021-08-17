// 4.	Sort a given set of n integer elements using Quick Sort method and compute its time complexity. Run the program for varied values of n > 5000 and record the time taken to sort. Plot a graph of the time taken versus n on graph sheet. The elements can be read from a file or can be generated using the random number generator. Demonstrate using Java how the divide-and-conquer method works along with its time complexity analysis: worst case, average case and best case.

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class QuickSortComplexity {
	static final int MAX = 200000;
	static int[] a = new int[MAX];
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Max array size: ");
		int n = input.nextInt();
		Random random = new Random();
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++)
			// a[i] = input.nextInt();   // for keyboard entry
			a[i] = random.nextInt(10000); // generate 
      // random numbers ñ uniform distribution
		
		// a = Arrays.copyOf(a, n); // keep only non zero elements
		// Arrays.sort(a); // for worst-case time complexity

		System.out.println("Input Array:");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		// set start time
		long startTime = System.nanoTime();
		QuickSortAlgorithm(0, n - 1);
		long stopTime = System.nanoTime();
		long elapsedTime = stopTime - startTime;
		System.out.println("\nSorted Array:");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		System.out.println("Time Complexity in ms for 
                     n=" + n + " is: " + (double) elapsedTime / 1000000);
	}

	public static void QuickSortAlgorithm(int p, int r) {
		int i, j, temp, pivot;
		if (p < r) {
			i = p;
			j = r + 1;
			pivot = a[p]; // mark first element as pivot
			while (true) {
				i++;
				while (a[i] < pivot && i < r)
					i++;
				j--;
				while (a[j] > pivot)
					j--;
				if (i < j) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				} else
					break; // partition is over
			}
			a[p] = a[j];
			a[j] = pivot;
			QuickSortAlgorithm(p, j - 1);
			QuickSortAlgorithm(j + 1, r);
		}
	}
}

Output
Enter Max array size: 20
Enter the array elements: 
Input Array:
326 719 983 701 490 230 595 474 341 75 916 173 324 852 728 434 758 445 303 566 
Sorted Array:
75 173 230 303 324 326 341 434 445 474 490 566 595 701 719 728 758 852 916 983 
Time Complexity in ms for n=20 is: 0.023225

Enter Max array size: 20000
Enter the array elements: 
Input Array:
Sorted Array:
Time Complexity in ms for n=20000 is: 4.953809

Enter Max array size: 30000
Enter the array elements: 
Input Array:
Sorted Array:
Time Complexity in ms for n=30000 is: 7.141865

Enter Max array size: 40000
Enter the array elements: 
Input Array:
Sorted Array:
Time Complexity in ms for n=40000 is: 8.698231

Enter Max array size: 50000
Enter the array elements: 
Input Array:
Sorted Array:
Time Complexity in ms for n=50000 is: 9.103897

Enter Max array size: 60000
Enter the array elements: 
Input Array:
Sorted Array:
Time Complexity in ms for n=60000 is: 12.380137

Enter Max array size: 70000
Enter the array elements: 
Input Array:
Sorted Array:
Time Complexity in ms for n=70000 is: 24.719828

Enter Max array size: 80000
Enter the array elements: 
Input Array:
Sorted Array:
Time Complexity in ms for n=80000 is: 21.150887

Enter Max array size: 90000
Enter the array elements: 
Input Array:
Sorted Array:
Time Complexity in ms for n=90000 is: 35.894418

Enter Max array size: 100000
Enter the array elements: 
Input Array:
Sorted Array:
Time Complexity in ms for n=100000 is: 31.430762


Enter Max array size: 200000
Enter the array elements: 
Input Array:
Sorted Array:
Time Complexity in ms for n=200000 is: 47.498161


Plot Graph: time taken versus n on graph sheet

Time Complexity Analysis:
Quick Sort Algorithm
Average performance O(n log n)
 
