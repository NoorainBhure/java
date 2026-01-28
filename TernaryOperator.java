public class TernaryOperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
         int maxIfElse;
         if(a>b){
            maxIfElse=a;

         }else{
            maxIfElse=b;
         }
         System.out.println("Using If Else : The maximum numb is :"+maxIfElse);

         //using ternary operator
         int maxTernary =(a>b)?a:b;
         System.out.println("Using Ternary :The Maximum Value is "+maxTernary);
    }
}
