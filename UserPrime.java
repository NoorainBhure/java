import java.util.Scanner;
public class UserPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int prime=sc.nextInt();
       
        boolean isPrime=true;
        for(int i=2;i<prime;i++){
         if(prime%i==0){
             isPrime=false;
             break;
        }
        
    }
    if(isPrime){
        System.out.println("Its a Prime Number");
    }else{
        System.out.println("NOt a Prime");
    }
        }
        
    
}
