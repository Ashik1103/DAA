// 5.	Sort a given set of n integer elements using Merge Sort method and compute its time complexity. Run the program for varied values of n > 5000, and record the time taken to sort. Plot a graph of the time taken versus n on graph sheet. The elements can be read from a file or can be generated using the random number generator. Demonstrate using Java how the divide-and-conquer method works along with its time complexity analysis: worst case, average case and best case. 
import java.util.Random;
import java.util.Scanner;

public class MergeSort{
	static final int MAX = 200000;
	static int[] a = new int[MAX];

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Max array size: ");
		int n = input.nextInt();
		Random random = new Random();
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++)
	{
		//	a[i] = input.nextInt(); // for keyboard entry
		 a[i] = random.nextInt(100000); 
                    System.out.print(a[i] + " ");
	}
		long startTime = System.nanoTime();
		MergeSortAlgorithm(0, n - 1);
		long stopTime = System.nanoTime();
		long elapsedTime = stopTime - startTime;
		System.out.println("Time Complexity (ms) for n = " + 
n + " is : " + (double) elapsedTime / 1000000); 
		System.out.println("Sorted Array (Merge Sort):");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		input.close();
	}

	public static void MergeSortAlgorithm(int low, int high) {
		int mid;
		if (low < high) {
			mid = (low + high) / 2;
			MergeSortAlgorithm(low, mid);
			MergeSortAlgorithm(mid + 1, high);
			Merge(low, mid, high);
		}
	}

	public static void Merge(int low, int mid, int high) {
		int[] b = new int[MAX];
		int i, h, j, k;
		h = i = low;
		j = mid + 1;
		while ((h <= mid) && (j <= high))
			if (a[h] < a[j])
				b[i++] = a[h++];
			else
				b[i++] = a[j++];

		if (h > mid)
			for (k = j; k <= high; k++)
				b[i++] = a[k];
		else
			for (k = h; k <= mid; k++)
				b[i++] = a[k];

		for (k = low; k <= high; k++)
			a[k] = b[k];
	}
}

Output
Enter Max array size: 5
Enter the array elements: 
856 604 528 287 321 Time Complexity (ms) for n = 5 is : 0.090071
Sorted Array (Merge Sort):
287 321 528 604 856

Enter Max array size: 10000
Enter the array elements: 
Time Complexity (ms) for n = 10000 is : 1194.135767
Sorted Array (Merge Sort):

Enter Max array size: 20000
Enter the array elements:
Time Complexity (ms) for n = 20000 is : 2040.96632
Sorted Array (Merge Sort):

Enter Max array size: 30000
Enter the array elements: 
Time Complexity (ms) for n = 30000 is : 3098.642188
Sorted Array (Merge Sort):

Enter Max array size: 40000
Enter the array elements: 
Time Complexity (ms) for n = 40000 is : 3914.650313
Sorted Array (Merge Sort):

Enter Max array size: 50000
Enter the array elements: 
Time Complexity (ms) for n = 50000 is : 4700.729745
Sorted Array (Merge Sort):

Enter Max array size: 60000
Enter the array elements: 
Time Complexity (ms) for n = 60000 is : 5457.318457
Sorted Array (Merge Sort):

Enter Max array size: 70000
Enter the array elements: 
Time Complexity (ms) for n = 70000 is : 6630.648568
Sorted Array (Merge Sort):

Enter Max array size: 80000
Enter the array elements: 
Time Complexity (ms) for n = 80000 is : 7419.150889
Sorted Array (Merge Sort):

Enter Max array size: 90000
Enter the array elements: 
Time Complexity (ms) for n = 90000 is : 8119.913672
Sorted Array (Merge Sort):

Enter Max array size: 100000
Enter the array elements: 
Time Complexity (ms) for n = 100000 is : 8865.6302
Sorted Array (Merge Sort):

Plot Graph: time taken versus n on graph sheet

Time Complexity Analysis: 
Merge Sort Algorithm 
Average performance O(n log n) 
