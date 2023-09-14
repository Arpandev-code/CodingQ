/*
Write an algorithm to output 1 if the word2 is a right rotation of word1 otherwise output-1
Input
The first line of the input consists of a string word1, representing the first word.
The second line consists of a string word2,
representing the second word.
Output
Print 1 if the word1 is a right rotation of word2 otherwise point -1
 */


public class Amcat20222 {
    public static void main(String[] args) {
        String word1="Arpandev";
        String word2="vednaprA";
        String temp="";
        for(int i=1;i<word1.length();i++)
       {
        temp=rightRotate(word1, i);
       }
       if(temp==word2)
       {
        System.out.println("1");
       }
        
    }
    public static String rightRotate(String str, int n) {
        int length = str.length();
        String part1 = str.substring(length - n);
        String part2 = str.substring(0, length - n);

        return part1 + part2;
    }
}
