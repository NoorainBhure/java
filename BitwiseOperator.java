public class BitwiseOperator {
    public static void main(String[] args) {
        int x=12;
        int y=9;
        int resultAnd=x&y;
        System.out.println("Bitwise And :"+resultAnd);
        
        int resultOr=x|y;
        System.out.println("Bitwise Or :"+resultOr);
        

        int resultXor = x^y;
        System.out.println("Bitwise Xor :"+resultXor);

        x=5;//5=-5-1=-6
        int resultNotX= ~x; 
        System.out.println("Bitwise Not :"+resultNotX);
        
        x=12;
        int resultLesfShift=x<<2;
        System.out.println("Left Shift :"+resultLesfShift);

        int resultRightShift=x>>2;
        System.out.println("Right Shift "+resultRightShift);


        
        
        
    }
    
}
