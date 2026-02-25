package Array;

import java.util.Scanner;


public class SumOfArray {

    public static void main(String[] args) {
 SumOfArray sa=new SumOfArray();
        sa.sum();
    } 
  void sum(){
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Elements");
        int  size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
      

    

          int sum=0;
          for(int i=0;i<size;i++){
            sum=sum+arr[i];
          }
          System.out.println("The sum of Numbers :"+sum);

          if(size==0){
            System.out.println("0");
          }

        
       }
}
