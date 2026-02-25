package Array;

import java.util.Scanner;

public class CharacterTwoD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many Character to be Entered in Column");
        int size = sc.nextInt();
         System.out.println("Enter How many Character to be Entered in Row");
        int size1 = sc.nextInt();
        
        System.out.println("Enter the Character to be entered ");
        char[][] x = new char[size][size1];
       
         for(int i=0;i<size;i++){
            for(int j=0;j<size1;j++){
            x[i][j]=sc.next().charAt(0);
         }
      System.out.println();
   }
         for(int i=0;i<size;i++){
            for(int j=0;j<size1;j++){
            System.out.print(x[i][j]+" ");

         }
      System.out.println();}

    }
}

