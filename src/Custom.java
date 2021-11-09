public  class Custom{
    private int salary;
    private String name;

//    public String getName(){
//        return name;
//    }
//    public void setName(String n){
//this.name=n;
//    }
//    public int getSalary(){
//         return salary;
//    }
//    public void setSalary(int s){
//        this.salary=s;
//    }
    Custom(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
class custom_class {

    public static void main(String[] args) {
Custom nan=new Custom();//object
//nan.setName("khushi");
//        nan.salary=34;
//        nan.name="cwh";
        nan.setName("nandini");
        nan.setSalary(3000);
        System.out.println(  nan.getName());

        System.out.println(nan.getSalary());

    }
}
