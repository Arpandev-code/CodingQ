/*
write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:
Input: strs = ["dog", "racecar","car"]
Output:
Explanation: There is no common prefix among the input strings.
 */


import java.util.Arrays;
import java.util.Scanner;

public class longest_common_prefix {
    static String longestCommonpref(String arr [],int N){
        if(N==0){
            return "-1";
        }else if(N==1){
            return arr[0];
        }
        Arrays.sort(arr);
        String first=arr[0];
        String last=arr[N-1];
        int j=0;
        for(j=0;j<first.length();j++){
            if(first.charAt(j)!=last.charAt(j))
            break;
        }
        if(j==0)
        return "-1";
        else
        return first.substring(0, j);
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int N=sc.nextInt();
        String arr[]=new String[N];
        System.out.println("Enter the eliment of the Array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        System.out.println(longestCommonpref(arr, N));
    }
}
