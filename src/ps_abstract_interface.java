
abstract class Pen {
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("changing the nib");
    }

}
    public class ps_abstract_interface{
        public static void main(String[] args) {
            FountainPen obj=new FountainPen();
            obj.changeNib();
            obj.refill();
            obj.write();
        }
    }


