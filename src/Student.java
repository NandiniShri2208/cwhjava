import java.util.Scanner;

class Student{
   String []arr;
    Student(){
        arr=new String[5];
       for (int i=0;i< arr.length;i++){
           Scanner sc=new Scanner(System.in);
           String y=sc.nextLine();
           arr[i]=y;
       }
    }
    void display(){
        for (String i:
                arr) {
            System.out.println(i);
        }
    }
    Student(String name){
        arr=new String[10];
       for(int i=0;i<arr.length;i++){
           arr[i]=name;
       }

    }

    public static void main(String[] args) {
        Student obj=new Student();
        obj.display();
    }
}
