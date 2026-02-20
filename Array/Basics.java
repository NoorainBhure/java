package Array;
public class Basics {
    public static void main(String[] args) {
        
    
    int[] x;//declaration
    x=new int[5];//initialization
    // int[] x=new int[5];//Both
    // int[] x={10,20,30,40,50};
    x[0]=100;
    x[1]=200;
    x[2]=300;
     x[3]=400;
      x[4]=500;//in this assigning value and it is mutable

    for(int i=0;i<x.length;i++){
        System.out.println(x[i]);
        
    }
    


    }
}
