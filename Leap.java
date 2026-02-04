public class Leap {
    public static void main(String[] args) {
        int year=300;
        if(year%4==0 &&(year%400==0 && year%100!=0)){
            System.out.println("It is a Leap Year");

        }else{
            System.out.println("Not a Leap Year");
        }
        
    }
    
}
