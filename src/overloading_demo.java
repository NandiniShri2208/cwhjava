public class overloading_demo {
    void test(){
        System.out.println("No parameters...");
    }
//    void test(int a){
//        System.out.println(" integer a:"+a);
//    }
    void test(int a,int b){
        System.out.println("a and b:" + a+ " "+ b);
    }
    void test(double a){
        System.out.println("inside test(double) a:"+ a);

    }

}
class Overload{
    public static void main(String[] args) {
        overloading_demo obj1=new overloading_demo();
        double result;
        int i=88;

        obj1.test();
       obj1.test(i);
        obj1.test(90,95);
     obj1.test(123);
    }
}
