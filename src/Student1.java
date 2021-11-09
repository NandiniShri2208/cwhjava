import java.util.Scanner;

public class Student1 {
    String name;
    static int count=0;
 float sum=0f;
    float percentage;
Student1(String name,float percentage){
    this.name=name;
    this.percentage=percentage;
    count++;
}
void display(){
for(int i=0;i<count;i++){
    if(percentage>sum){
       sum=percentage;
    }
    System.out.println(sum);
}
}
}
class Test_Student1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            String name=sc.nextLine();
            float percentage=sc.nextFloat();
            Student1 obj1=new Student1(name,percentage);
            obj1.display();
        }
    }
}
