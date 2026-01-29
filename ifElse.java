public class ifElse {
    public static void main(String[] args) {
        
        System.out.println("Normal if else condition");
        if(5>4){
            System.out.println("5 is greater");

        }else{
            System.out.println("4 is smaller");
        }

        System.out.println();

        System.out.println("Nested if else");
        if(5>4){
            System.out.println("5 is greater");
            if(6<7){
                System.out.println("6 is smaller");
            }else{
                if(7>8){
                System.out.println("7 is smaller");
            }else{
                System.out.println("8 is greater");
            }}
        }



        System.out.println();


        System.out.println("Another if else conditions");
        int age=20;
        boolean license=false;
        if(age>=18){
            if(license){
            System.out.println("You are Eligible to drive");
        }else{
            System.out.println("You have a eligible age but you wont have a licence");
        }
        
    
    }
    else{
        System.out.println("You are too young to drive");
    }
}
    
}
