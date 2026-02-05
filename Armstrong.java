public class Armstrong {
    public static void main(String[] args) {
        int n=153;
        int sum=0;
        int temp=n;
        while(n>0){
            int r=n%10;
            n=n/10;
            sum=sum+(r*r*r);
           
        } if(sum==temp){
                System.out.println("Armstrong Number");
            }else{
                System.out.println("Not a Armstrong Number");
            }
    }
    
}
