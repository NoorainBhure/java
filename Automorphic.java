public class Automorphic {
    public static void main(String[] args) {
        int n=25;
        int sum=0;
        int temp=n;
        int count=0;
        
    
        while(temp>0){
            count++;
            temp=temp/10;
        }
                temp=n;
                sum=n*n;
                sum=sum% (int)Math.pow(10, count);
            
     if(n==sum){
            System.out.println("Automorphic Number");
        }else{
            System.out.println("Not a Automorphic Number");
        }
    
        
    }}
    

