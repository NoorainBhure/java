
import javax.sound.sampled.SourceDataLine;

public class Switch {
    public static void main(String[] args) {
        String fruit ="apple";
        switch(fruit){
            case "banana":
            System.err.println("Banana is Yellow");
            break;
            case "apple":
            System.err.println("Apple is Red");
            break;
            case "orange":
            System.err.println("orange is Orange");
            break;
            default:
            System.out.println("I dont know the color of the friuts");
        }
    }
    
}
