class Avenger{
    void attack(){
        System.out.println("Avengers on Attack");
    }
}
class AntMan extends Avenger{
    void attack(){
        System.out.println("AntMan on Attack");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Avenger a=new Avenger();
        a.attack();
        AntMan an=new AntMan();
        an.attack();
        
    }
    
}
