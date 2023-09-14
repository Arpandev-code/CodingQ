//check if the two string is anagram or not

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1="Race";
        String str2="Care";
        String str3=str1.toLowerCase();
        String str4=str2.toLowerCase();
        char ch[]=str3.toCharArray();
        char ch1[]=str4.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        boolean isAnagram=Arrays.equals(ch, ch1);
        System.out.println(isAnagram);
    }
}
