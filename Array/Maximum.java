
import java.util.Scanner;

public class Maximum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size on an Array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Elements Are"+size);
    
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();

    }
    int max=arr[0];
    for(int i=0;i<size;i++){
        if(arr[i]>arr[0]){
            max=arr[i];
        }
    }
    System.out.println("Maximum number is "+max);
    }}