import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        //String (Whole Line)
        System.out.println("Enter Your Full Name");
        String fullname=sc.nextLine();
        //String (Single Word)
        System.out.println("Enter Your nickname");
        String nickname=sc.nextLine();
        sc.nextLine();


        System.out.println("Enter Your Age");
        int age=sc.nextInt();


          System.out.println("Enter Your Phone Number");
        long number=sc.nextLong();


      System.out.println("Enter Your Height in Meter");
        float height=sc.nextFloat();


          System.out.println("Enter Your CGPA");
        double cgpa=sc.nextDouble();


          System.out.println("Are you Student?(True/False)");
        boolean isStudent=sc.nextBoolean();


         System.out.println("Enter a small number");
        byte num=sc.nextByte();


          System.out.println("Enter a Medium Number");
        short mediumNumber=sc.nextShort();


          System.out.println("Enter Your Grade(A/B/C?D");
        char grade=sc.next().charAt(0);




        //output
        System.out.println("Output Summary");
        System.out.println("Fullname :"+fullname);
        System.out.println("Nick Name "+nickname);
        System.out.println("Your Age "+age);
        System.out.println("Your Mobile Number :"+number);
        System.out.println("Your Height :"+height);
        System.out.println("Your CGPA :"+cgpa);
        System.out.println("Student :"+isStudent);
        System.out.println("ENter Small Number :"+num);
        System.out.println("Medium Number :"+mediumNumber);
        System.out.println("Your Grade :"+grade);
        sc.close();//for closing from this data will not leak
    }
    
}
