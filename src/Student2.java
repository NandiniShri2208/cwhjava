import java.util.Scanner;

public class Student2 {
    String name;
    int age;
    String address;
    Student2(){
        name="unknown";
        age=0;
        address="not available";
    }
    void setInfo(String name,int age){
        this.name=name;
        this.age=age;
    }
  void setInfo(String name,int age,String address){
        this.name=name;
  this.age=age;

        this.address=address;
    }
    void display(){
        System.out.println(name + " "+ age+" "+address);
    }

    public static void main(String[] args) {
        Student2 obj=new Student2();
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<3;i++){
            String n=sc.nextLine();
            int a=sc.nextInt();
            String add=sc.nextLine();
            obj.setInfo(n,a,add);
            obj.display();

        }
    }
}

