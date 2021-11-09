public class outer {
    void display(){
        System.out.println("i am display function in outer class");
    }
    class inner{
        public  void display(){
            System.out.println("i am display function in inner class");
        }
    }
    void display_inner(){
        inner obj1=new inner();
        obj1.display();
    }

}
class cwh{
    public static void main(String[] args) {
        outer obj=new outer();
        obj.display();
       // outer.inner.display();
        obj.display_inner();
    }
}
