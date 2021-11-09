 abstract  class Base1 {
    public void Base1(){
         System.out.println("i am a constructor of base1 class");
     }
     public void sayHello(){
         System.out.println("say hello");
     }
     abstract public void greet();
}
class child2 extends Base1{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
}
abstract class child3 extends Base1{
    public void th(){
        System.out.println("hii there");
    }
}
class abstract_demo{
    public static void main(String[] args) {
//Base1 obj=new Base1() //error as abstract class donot have methods
child2 obj1=new child2();
//child3 obj2=new child3() ;//error



    }
}
