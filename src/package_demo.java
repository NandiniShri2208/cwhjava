class c1{
    public int x=5;
    protected int y=45;
    int z=6;
    private int p=46;
    public void meth1(){
        System.out.println(p);
    }
}
public class package_demo {
    public static void main(String[] args) {
        c1 c=new c1();
       // c.meth1();
        System.out.println(c.x);
        System.out.println(c.z);
        System.out.println(c.y);

        //System.out.println(c.p);not accessible as it is private modifier
    }
}
