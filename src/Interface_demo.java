
    interface Bycycle{
        int a=45;
        void applyBreaks(int decrement);
        void speedUp(int increment);
    }
    interface blowHorn{
    void demo1();
    void demo2();
    }
    class AvonCycle implements Bycycle,blowHorn{
void BlowHorn(){
    System.out.println("pppp");
}
public void applyBreaks(int decrement){
    System.out.println("applying breaks");
}
public void speedUp(int increment){
    System.out.println("speeding up....");
}
public void demo1(){
    System.out.println("this is demo1");
}
public void demo2(){
    System.out.println("this is demo2");
}
    }

 class  cwh_interface{
    public static void main(String[] args) {
        int a=5;
        AvonCycle nan=new AvonCycle();
        nan.applyBreaks(5);
        //you can create properties in interface.
        System.out.println(nan.a);
        //you cannot modify properties in interface
      //  nan.a=90;//error
       nan.demo1();
       nan.demo2();
        //System.out.println(nan.a);
    }
}