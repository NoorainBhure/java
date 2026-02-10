public class Fibonoci {
    public static void main(String[] args) {
        int x0=0;
        int x1=1;
        int n=5;
        for(int i=0;i<n;i++){
            int x2 = x0+x1;
            x0=x1;
            x1=x2;
            // System.out.print(x2 +" ");
        }
        System.out.println(x1);
    }
}
