//Static Variable 
    class Model1{
        String model1="Ford";
        static int year=1934;
        void carInfo(){
            System.out.println("Model1 of the Car is :"+model1+"  Launch Date :"+year);

        }
    }
        class Car1 {
            public static void main(String[] args) {
             Model1 m=new Model1();
             Model1 m1=new Model1();
             Model1 m2=new Model1();
             Model1 m3=new Model1();

              m.model1="Ferrari";
              m.year=2000;
              
              m1.model1="BMW";
              m1.year=3000;
              
               m2.model1="Lambo";
              m2.year=4000;

               m3.model1="TATA";
              
              m.carInfo();
              m1.carInfo();
              m2.carInfo();
              m3.year=25000;
              m3.carInfo();
             

        }
    }
    

