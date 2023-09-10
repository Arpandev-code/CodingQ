import java.util.Scanner;

class Maximum_Sum_Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N=sc.nextInt();
        int [] a=new int[N];
        System.out.println("Enter the Eliments in the array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        int sum=0;
        int max=0;
        int count=0;
        for(int j=0;j<N;j++){
            if(a[j]>0){
                sum +=a[j];
                count++;
            }else if (a[j]>max || max==0) {
                max=a[j];
            }
        }
        if(sum==0)
        {
                sum=max;
                count=1;
        }
        System.out.println(sum+" "+count);
    }
}