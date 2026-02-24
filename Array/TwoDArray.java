package Array;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the column Required");
                int size1=sc.nextInt();
         System.out.println("Enter the row Required");
        int size2=sc.nextInt();
        int [][] arr=new int[size1][size2];
        System.out.println("This elements are there in First Array "+size1);
         System.out.println("This elements are there in Second Array "+size2);
         for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                arr[i][j]=sc.nextInt();

            }
            System.out.println("Next row");
         }
         System.out.println("The Elements Are :");
         for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
         }
    }
    
}
