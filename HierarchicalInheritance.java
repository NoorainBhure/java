




class Parent{

    void parentProperty(){
    System.out.println("Im a Parent");
    }

}
    class Brother extends Parent{

    void brother(){
    System.out.println("Im a Brother");
    }
}

    class Sister extends Parent{
    void sister(){
        System.out.println("Im Sister");
    }}



public class HierarchicalInheritance{
    public static void main(String[] args) {
        Parent p=new Parent();
        p.parentProperty();
        Brother c=new Brother();
        c.brother();
        c.parentProperty();
        Sister g=new Sister();
        g.sister();
        g.parentProperty();
      
        
    }
    
}






