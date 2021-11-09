//class Overloaded{
//    Overloaded(){
//        System.out.println("Constructor is initialized");
//    }
//    protected void Overloadeda(){
//        System.out.println("Constructor is initialized");
//    }
//}
//class bc{
//    public static void main(String[] args) {
//Overloaded o=new Overloaded();
//o.Overloadeda();
//    }
//}
class Rectangle{
    int len;
    int width;
    void Rectangle(int len,int width){
        this.len=len;
        this.width=width;
    }
}
class bc {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.Rectangle(5,7);
        System.out.println(r.len+ " "+ r.width);
    }
}
