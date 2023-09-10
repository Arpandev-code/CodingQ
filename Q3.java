/*
 Given 2 string a and b, return YES if a is a subsequence of b, or NO otherwise.
Example 1:
Input: s = "shr", t="sgfgfher5vbr"
Output: true
Example 2:
Input: s = "axc", += "ahbgdc"
Output: false
 */

import java.util.Scanner;

public class Q3 {
    static boolean isSubsequence(String a,String b){
        int curr=0;
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)==a.charAt(curr))
            curr++;
            if(curr==a.length())
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of a ");
       String a=sc.nextLine();
       System.out.println("Enter the value of b");
       String b=sc.nextLine();
       if(isSubsequence(a, b))
       {
        System.out.println("YES");
       }else{
        System.out.println("NO");
       }
    }
}
