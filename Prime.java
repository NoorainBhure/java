public class Prime {
    public static void main(String[] args) {
        int n=9;
        boolean prime=true;

        for(int i=2;i<n;i++){
            if(n%i==0){
                prime=false;
                
              
            }
                
               
               
            }if(prime){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }

            System.out.println("--------Gpt--");
            int n1=91;
            boolean isprime=true;
            if(n1<=1){
                isprime=false;

            }else{
                for(int i=2;i*i<=n1;i++){
                    if(n1%i==0){
                        isprime=false;
                        break;
                    }
                }
            }
            if(isprime){
                System.out.println("Its a Prime");
            }else{
                System.out.println("Not a Prime");
            }
        }
    }
    

