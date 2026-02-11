import java.util.Scanner;
public class UserTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number to Multiply");
        int table=sc.nextInt();
        for(int i=1;i<=10;i++){
System.out.println(table+"*"+i+"="+(table*i));
        }

    }
    
}
