class Monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("bite....");
    }
}
interface BasicAnimalInterfaces{
  void eat();
  void sleep();
}
class Human extends Monkey implements BasicAnimalInterfaces{
    public void eat(){
        System.out.println("eating...");
    }

    public void sleep(){
        System.out.println("sleeping...");
    }
}
 class pq_interface {
     public static void main(String[] args) {
         Monkey m1=new Human();
         m1.bite();
         m1.jump();//cannot use eat,sleep method becausethe reference is monkey which does not have eat,sleep method
//         Human obj1=new Human();
//         obj1.eat();
//         obj1.sleep();
//         obj1.jump();
//         obj1.bite();
     }

}
