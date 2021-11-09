interface test{
    void square(int x);
}
class arithmetic implements test{
    public void square(int x){
        System.out.println( x*x);
    }
}
public class ToTestInt extends arithmetic {
    public static void main(String[] args) {
        arithmetic obj=new arithmetic();
        obj.square(5);
    }
}
