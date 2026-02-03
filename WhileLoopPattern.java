public class WhileLoopPattern {
    public static void main(String[] args) {
        System.out.println("------Pattern------");
        int n=5;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
i++;
System.out.println();
        }
        System.out.println("---Another-------");
        int i1=1;
        while(i1<=n){
            int j=1;
            while(j<=i1){
                System.out.print(i1);
                
                j++;
            }
              System.out.println();
           
              i1++;
             
        }
          System.out.println("---Another-------");
         i1=1;
        while(i1<=n){
            int j=1;
            while(j<=i1){
                System.out.print(j);
                
                j++;
            }
              System.out.println();
           
              i1++;
             
        }


        System.out.println("---Another-------");
        i=n;
        n=5;
        while(i<=1){
            int j=1;
            while(j<=i){
                System.out.print(" ");
                int k=1;
                while(k<=j){
                    System.out.print("*");
                    k++;
                }
             
               
               
                j++;
            }
           
        } System.out.println();
            i--;



            System.out.println("---Another-------");
            i=5;
            n=5;
            while(i>=1){
                int j=1;
                while (j<=n-i) { 
                    System.out.print(" ");
                    int k=1;
                    while(k<=i){
                        System.out.print("*");
                        k++;
                    }
                  j++;  
                }
                System.out.println();
                i--;
            }
            
            
    }
    
}
