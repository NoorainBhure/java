public class Pattern {
    public static void main(String[] args) {
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n1=4;
        // for(int i=1;i<=n1;i++){
        //     for(int j=1;j<=i;j++){
        //     System.out.print(j);}
        //     System.out.println();
        // }
        // int n2=4;
        // for(int i=1;i<=n2;i++){
        //     for(int j=1;j<=i;j++){
        //     System.out.print(i);}
        //     System.out.println();
        // }

       
        System.out.println();

          System.out.println("----Solid Rectangle----");
          for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
          }
          System.out.println("-------Hollow rectangle----");
          int n3=4;
          for(int i=1;i<=n3;i++){
            for(int j=1;j<=5;j++){
                if(i==1||j==1||i==n3||j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
          System.out.println();  
          }
          System.out.println("------HAlf pyramid-------");
          int n4=4;
          for(int i=1;i<=n4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
          }

          
          System.out.println("--inverted pyramid---");
          int n5=5;
          for(int i=n5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
          }

          System.out.println("=------Other incerted pyramid----");
          for(int i=1;i<=n5;i++){
            for(int j=1;j<=n5-i;j++){
                System.out.print(" ");
            }for(int k=1;k<=i;k++){
            System.out.print("*");
          }
          System.out.println();
          }




           System.out.println("=------Other incerted pyramid----");
          for(int i=n5;i>=1;i--){
            for(int j=1;j<=n5-i;j++){
                System.out.print(" ");
            }for(int k=1;k<=i;k++){
            System.out.print("*");
          }
          System.out.println();
          }


          System.out.println("-------Floyds triangle----");
          int num=1;
          for(int i=1;i<=n5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();

          }
          System.out.println("------0 1 triangle---");
          for(int i=1;i<=n5;i++){
            for(int j=1;j<=i;j++){
                 int sum=i+j;
                if(sum %2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }System.out.println();
          }
          for(int i=1;i<=n5;i++){
            for(int j=1;j<=n5-i+1;j++){
                System.out.print(j);

            }System.out.println();
          }
          System.out.println("=------Other incerted pyramid----");
          int n=5;
          for(int i =1;i<=n;i++){
            for(int j=i;j<=n;j++){
              System.out.print("*");
            }
            System.out.println();
          }
          
 System.out.println("=------Pyramid----");
 n=5;
 for(int i=1;i<=n;i++){
  for(int j=1;j<=n-i;j++){
    System.out.print(" ");
  } 
 for(int k=1;k<=i;k++){
  System.out.print(" *");
 }System.out.println();
 }
 System.out.println("=------Inverted Pyramid----");
 n=5;
 for(int i=n;i>=1;i--){
  for(int j=1;j<=n-i;j++){
    System.out.print(" ");
    
    }for(int k=1;k<=i;k++){
      System.out.print(" * ");
  } 

 System.out.println();
 }


 System.out.println("=------Rhombus----");

 for(int i=1;i<=n;i++){
  for(int j=1;j<=n-i;j++){
    System.out.print(" ");}
  int j=1;
  for(int k=1;k<=n;k++){
     System.out.print(" *");
  }
  System.out.println();
  } 
  
 System.out.println("=------Hollow Pyramid----");

 for(int i=1;i<=n;i++){
  for(int j=1;j<=n-i;j++){
    System.out.print(" ");}
  int j=1;
  for(int k=1;k<=i;k++){
    if(i==1||i==n){
     System.out.print(" *");}
     else{
      for(int l=1;l<=n-j;l++){
        System.out.print("u");
      }
     }
  }
  System.out.println();
  } 
 }
 

    }
    

