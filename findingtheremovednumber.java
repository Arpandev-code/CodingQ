/*
 Suppose you have been given an array that contains numbers 1-10,a random number is removed 
 from the array, write a code to find the removed element
 */

public class findingtheremovednumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int N = arr.length;
        int totalSum = (N + 1) * (N + 2) / 2;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int missingNumber = totalSum - sum;
        System.out.println("The removed number is: " + missingNumber);
    }
}

