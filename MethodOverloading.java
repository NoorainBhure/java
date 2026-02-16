public class MethodOverloading {
    void area(){
        System.out.println("Printing Area");
    }
    void area(float r){
        double n=3.14*r*r;
        System.out.println("Area of Circle :"+n);

    }
    void area(int r){
        int n=r*r;
        System.out.println("Area of Square is :"+n);
    }
    void area(int x ,int y){
        int n=x*y;
        System.out.println("Area of Rectangle :"+n);
    }
    void area(int x,int y,int z){
        int n=x*y*z;
        System.out.println("Area of Cuboid :"+n);

    }

public static void main(String[] args) {
    MethodOverloading a =new MethodOverloading(); 
    a.area();
    a.area(12.5f);
    a.area(20);
    a.area(10,20);
    a.area(10,20,3);

}
    
}
