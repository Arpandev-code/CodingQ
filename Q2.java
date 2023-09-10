/*
Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.
Example 1:
Input:
N = 6, x = 16
Arr[] = {1, 4, 45, 6, 10, 8}
Output: Yes
Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
Example 2:
Input:
N = 5 x = 10
Arr[] = {1, 2, 4, 3, 6}
Output: Yes
Explanation: Arr[2] + Arr[4] = 4+6=10
 */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N=sc.nextInt();
        int a[]=new int[N];
        System.out.println("Enter ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the value of X");
        int X=sc.nextInt();
        //int sum=0;
        for(int j=0;j<N;j++){
            for(int k=j+1;k<N;k++){
                if(a[j]+a[k]==X){
                    System.out.println(a[j]+" "+a[k]);
                    break;
                }
            }
        }
    }
}
