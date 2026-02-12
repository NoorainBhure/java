//Instance Variable 
    class Model{
        String model="Ford";
        int year=1934;
        void carInfo(){
            System.out.println("Model of the Car is :"+model+"  Launch Date :"+year);

        }
    }
        class Car {
            public static void main(String[] args) {
             Model m=new Model();
             Model m1=new Model();
             Model m2=new Model();
             Model m3=new Model();

              m.model="Ferrari";
              m.year=2000;
              
              m1.model="BMW";
              m1.year=3000;
              
               m2.model="Lambo";
              m2.year=4000;

               m3.model="TATA";
              m3.year=5000;


              m.carInfo();
              m1.carInfo();
              m2.carInfo();
              m3.carInfo();

        }
    }
    

