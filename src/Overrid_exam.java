public class Overrid_exam {
    int x;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("i am method 1 of class 1");
    }


}
class child extends Overrid_exam{

    @Override
    public void meth2(){
        System.out.println("i am method 2 of class child");
    }

public void meth3() {
    System.out.println("i am meth 3 of class child ");
}
}
class Nan{
    public static void main(String[] args) {
        child obj=new child();
        obj.meth2();
    }
}
