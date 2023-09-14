/*
 A company wishes to encode its data. The data is in the form of a string and is case sensitive. They wish to encode the data with respect to a specific character. They wish to count the number of times the character reoccurs in the given data so that they can encode the data accordingly..
write an algorithm to find the count of the specific character in the given data.
Input
The first line of the input consists of a string-data representing the data to be encoded. The second line consists of a character-coder representing the
character to be counted in the data.
Output
Print an integer representing the count of the specific character, if the required character is not found then print 0.
 */



public class Amcat2022 {
    public static void main(String[] args) {
        int count=0;
        String str="bcdef";
        char ch='a';
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch)
            {
                count++;
            }else{
                System.out.println(0);
            }
            
        }
        System.out.println(count);
    }
}
