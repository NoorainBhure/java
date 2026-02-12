//Every class is with capital letter and and method with small letter
//method ko run krne ke liye object lagega
//


    class Enemy{
         int power=1000;
         void showpower(){
            System.out.println("Enemy Power is "+power);
         }
        
    }
    public class CreatingObject {
     public static void main(String[] args) {
             System.out.println("Hello");
             Enemy e=new Enemy();
             System.out.println(e.power);
             e.showpower();
         }
}
