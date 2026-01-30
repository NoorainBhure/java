

public class ForLoop{
    public static void main(String[] args) {
        for(int i =0;i<3;i++){
            System.out.println("Inner Loop");
            for(int j=0;j<3;j++){
                System.out.println("Outer Loop");
                for(int k=1;k<3;k++){
                    System.out.println("Inside k Loop");
                }
            }
            System.out.println("Another Loop started");
        }
    System.out.println("Loop Begins");
    }

}