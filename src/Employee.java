public class Employee {
    int id;
    String name;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Person extends Employee{
float salary;
Person(int id,String name,float salary){
    super(id, name);
    this.salary=salary;
}
void display(){
    System.out.println("the details are :" + id + "  " + name + "   "   + salary);

}
}
class Check{
    public static void main(String[] args) {
        Person obj=new Person(101,"nandini",1000f);
        obj.display();
    }
}

