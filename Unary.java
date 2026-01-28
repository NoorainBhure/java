public class Unary {
    public static void main(String[] args) {
        int a =5;
        //unary minus
        int negative =-a;
        System.out.println("Unary Minus(-a)"+negative);
        
        //unary plus
        int positive =a;
        System.out.println("Unary Minus(+a)"+positive);
//increment (prefixx & Suffix)
System.out.println("Original a:"+a);
System.out.println("Post increment (a++):"+(a++));
System.out.println("After post-increment ,a: "+a);
    
System.out.println("Pre-Increment (++a) :"+(++a));

//decrement prefix & suffix
System.out.println("Post decrement (a--):"+(a--));
System.out.println("After post-decrement ,a: "+a);
    
System.out.println("Pre-decrement(--a)) :"+(--a));


    }
    
}
