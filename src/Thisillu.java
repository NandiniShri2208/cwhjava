public class Thisillu {
    int x;

    public int getX() {
        return x;
    }

    public Thisillu(int x) {
     this.x=x;
    }
}
class cwh_this{
    public static void main(String[] args) {
        Thisillu obj=new Thisillu(95);
        System.out.println(obj.getX());
    }
}
