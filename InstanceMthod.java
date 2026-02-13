class Avengers{
    int x=100;
    static int y=200;
    public static void main(String[] args) {
        Avengers io=new Avengers();
        io.showPower();
        }
        void showName(){
            System.out.println("I am a Iron Man");
            System.out.println("Value of x:"+x+"value of y "+y);
        }
        void showPower(){
            System.out.println("Showing Avengers Power");
            showName();
        }
}