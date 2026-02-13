class AvengerStatic{
    public static void main(String[] args) {
        AvengerStatic ironMan=new AvengerStatic();
              ironMan.showPower();
              
    }
    static void showName(){
        System.out.println("i am an IronMan");
    }
    void showPower(){
        System.out.println("Showing Avengers power");
        showName();
        showTeam();
    }
    void showTeam(){
        System.out.println("We are Avengers");
        showName();
    }
}
