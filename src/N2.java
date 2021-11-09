class N2{
    double width;
    double height;
    double depth;
  N2(N2 o){
        o.height=height;
        o.depth=depth;
        o.width=width;
    }
    N2(){
        width=-1;
        height=-1;
        depth=-1;
    }
   N2(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }N2(double len){
        width=height=depth=len;
    }
    double volume(){
        return width*height*depth;
    }
}
class OverloadCons2{
    public static void main(String[] args) {
       N2 obj1=new N2();
        N2 obj2=new N2(30,40,5);
        N2 obj3=new N2(34);

        N2 obj4=new N2(obj1);
        System.out.println(obj1.volume());
        System.out.println(obj2.volume());
        System.out.println(obj3.volume());
        System.out.println(obj4.volume());
    }
}