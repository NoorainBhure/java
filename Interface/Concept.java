package Interface;

import A;
import Demo;

interface A{
    int value=100;
}
class Demo implements A{
    void show(){
        System.out.println("Value ="+value);
    }
}
public class Concept {
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.show();
    }
    
}
