package Array;

public class Vowel {
    public static void main(String[] args) {
        char[] x={'p','r','o','g','r','a','m','m','i','n','g'};
           int count=0;
           int countCons=0;
          
        for(int i=0;i<x.length;i++){
           
            
            char c=x[i];
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                 count++;
                System.out.println("Volwels are :"+c);
               

            }else{
                countCons++;
                System.out.println("Consonant are :"+c);
            }
           
        } System.out.println("Total Vowels Are :"+count);
        System.out.println("Total Consonants are:"+countCons);
        
    }
    
}
