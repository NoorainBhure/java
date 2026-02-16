


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

    class GrandChild extends Child{
    void grandChildProperty(){
        System.out.println("Im grand Child");
    }}



public class MultilevelInheritance {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.parentProperty();
        Child c=new Child();
        c.childProperty();
        c.parentProperty();
         GrandChild g=new GrandChild();
        g.childProperty();
        g.grandChildProperty();
        g.parentProperty();
        
    }
    
}



