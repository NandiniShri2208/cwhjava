class Phone{
    public void name(){
        System.out.println("my name is java");
    }
    public void m1(){
        System.out.println("i am m1 method in phone");
    }
}
class smartphone extends Phone{
    @Override
    public void m1() {
        System.out.println("i am smartphone");
    }
    public void m2(){
        System.out.println("i here");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
Phone obj=new smartphone(); //valid runtime pe object create hoga
//smartphone obj2=new Phone();//wrong not allowed
        obj.m1();//
       // obj.m2();//not allowed only that objects will run that are in super class
    }
}
