public class Inheritance {
private float radius;
    Inheritance(float radius){
//       radius=9.2f;
        this.radius=radius;
    }

    public float getRadius() {
        return radius;
    }

    double area(){
        return Math.PI * radius * radius;
    }
}
class cylinder extends Inheritance{
    private int height;
    cylinder(int height,float r){
        super(r);
        this.height=height;
    }
   public double volume(){
       return Math.PI*getRadius()*getRadius()*height;
   }
}
class cwh_ps{
    public static void main(String[] args) {

        cylinder obj=new cylinder(3,5.2f);
        System.out.println(obj.volume());
    }
}
