package Array;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of the array");
        int size=sc.nextInt();
        int[] arr= new int[size];//create array of elements
        System.out.println("Enter "+size+" elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
           
           
        }
        System.out.println("Sum fo the Elements is :"+sum);
        sc.close();
    }
    
}
