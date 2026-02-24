package Array;

import java.util.Scanner;

public class StudentRecordTwoD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How many Students are there ");
        int size=sc.nextInt();
        
        System.out.println("Enter how many Subject are there ");
        int size1=sc.nextInt();
        int[][] arr=new int[size][size1];

        for(int i=0;i<size;i++){
            for(int j=0;j<size1;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Students & Marks");
          for(int i=0;i<size;i++){
            for(int j=0;j<size1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
          }
         
          
          for(int i=0;i<size;i++){
            int add=0;
            for(int j=0;j<size1;j++){
                add=add+arr[i][j];
                
            }
            System.out.println("Addition of Marks "+i);
            
            System.out.println(add);
    }
    int max=arr[0][0];
    for(int i=0;i<size;i++){
        for(int j=0;j<size1;j++){
        if(arr[i][j]>max){
           max=arr[i][j];
        }
        
    }}
    System.out.println("Maximum Marks");
     System.out.println(max);
     

    
   
    for(int i=0;i<size;i++){
        int max1=arr[0][0];
        for(int j=0;j<size1;j++){
        if(arr[i][j]>max1){
           max1=arr[i][j];
        }
        
    }
    System.out.println("Maximum Marks of Each Student");
     System.out.println(max1);}
}
}