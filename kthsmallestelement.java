/*
 Given an array arr[] and an integer K where K is smaller than size of array, 
 the task is to find the Kth smallest element in the given array. 
 It is given that all array elements are distinct
 Example 1:
Input:
N = 6
arr[]= 7 10 43 20 15
K=3
Output: 7
Example 2:
Input:
N = 5
arr[]= 7 10 4 20 15
K = 4
Output: 15
Expected Time Complexity: O(n)
 */
// Java code for Kth smallest element
// in an array
import java.util.Arrays;

class kthsmallestelement {
	public static int kthSmallest1(int[] arr, int K)
	{
		Arrays.sort(arr);

		
		return arr[K - 1];
	}

	
	public static void main(String[] args)
	{
		int arr[]={7,10,4,3,20,15};
		int K = 3;

		// Function call
		System.out.print("K'th smallest element is "
						+ kthSmallest1(arr, K));
	}
}

// This code is contributed by Chhavi
