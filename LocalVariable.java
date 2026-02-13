
class LocalVariable{
    String instanceVariable="I am an instance Variable";
    void myMethod(){
        String LocalVariable="I am a local Variable";
        System.out.println(LocalVariable);
        System.out.println(instanceVariable);
    }


    public static void main(String[] args) {
        LocalVariable lv=new LocalVariable();
        lv.myMethod();
        System.out.println(lv.instanceVariable);
        // System.out.println(lv.LocalVariable);
    }     
    
}
