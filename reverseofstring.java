import java.util.Scanner;

class reverseofstring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();

        String str []= new String[N];
        for(int j=0;j<N;j++){
            str[j]=sc.next();
        }
        for(int i=N-1;i>=0;i--){
            System.out.print(str[i]+" ");
        }
    }
}