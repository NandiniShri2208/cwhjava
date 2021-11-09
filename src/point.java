public class point {
    private int x;
    private int y;
    public point(){
        x=10;
        y=15;
    }
    public point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y=y;
    }
    public  void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void  display(){
        System.out.println(x);
        System.out.println(y);
    }
}
class cwh_test1{
    public static void main(String[] args) {
point obj=new point();
obj.setX(5);
obj.setY(6);
obj.display();
    }
}
