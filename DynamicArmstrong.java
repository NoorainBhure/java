public class DynamicArmstrong {
    public static void main(String[] args) {
        int n=1634;
        int sum=0;
        int temp=n;
        int digits=n;
        int count=0;
        while(digits>0){
            count++;
            digits=digits/10;
            
        }
        while(n>0){
            int r=n%10;
            sum=(int) (sum+Math.pow(r, count));
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not a Armstrong Number");
        }
    }
    
}
