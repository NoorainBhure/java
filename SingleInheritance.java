


class Parent{

    void parentProperty(){
    System.out.println("Im a Parent");
    }

}
    class Child extends Parent{

    void childProperty(){
    System.out.println("Im a Child");
    }
}

    


public class SingleInheritance {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.parentProperty();
        Child c=new Child();
        c.childProperty();
        c.parentProperty();
        
        
    }
    
}



