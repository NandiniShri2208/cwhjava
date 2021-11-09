interface sampleInterface{
    void meth1();
    void meth2();
}
interface childInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childInterface{

    public void meth1() {
        System.out.println("meth1");
    }
    public void meth2() {
        System.out.println("meth2");
    }
    public void meth3() {
        System.out.println("meth3");
    }
    public void meth4() {
        System.out.println("meth4");
    }
}
class demo{
    public static void main(String[] args) {
        MySampleClass obj1=new MySampleClass();
        obj1.meth1();
        obj1.meth2();
        obj1.meth3();
        obj1.meth4();
    }
}
