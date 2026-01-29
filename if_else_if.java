public class if_else_if {
    public static void main(String[] args) {
        System.out.println("If else if");

        if (5<4) {
            System.out.println("5 is greater");
            
        }else if(4<3){
            System.out.println("4 is greater");
        }else if(6>7){
            System.out.println("6 is smaller");
        }
        else{
            System.out.println("7 is greater");
        }




        System.out.println();
        int grade=75;
        if(grade>85){
            System.out.println("O grade");
        }else if(grade>75){
            System.out.println("A grade");
        }
        else if(grade>65){
            System.out.println("B grade");
        }
        else if(grade>55){
            System.out.println("C grade");
        }
        else if(grade>45){
            System.out.println("D grade");
        }else if(grade>40){
            System.out.println("E grade");
        }else{
            System.out.println("Failed");
        }



        System.out.println("---------Even and Odd---------");
        int a=31;
        if(a%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }

        System.out.println("---------Divisible by 3 & 5");
        int x=15;

         if(x%3==0 && x%5==0){
            System.out.println("Divisible by Both");
        }
        else if(x%3==0){
            System.out.println("Divisible by 3");
        }else if(x%5==0){
            System.out.println("Divisible by 5");
        }else{
            System.out.println("Divisible by None");
        }





        System.out.println("------");
    }
    
}
