import java.util.Scanner;

class Book1 {
    String name;
    String author;
    double price;
    int qtyInStock;

   Book1(String name,String author,double price,int qtyInStock){
       this.author=author;
       this.name=name;
       this.price=price;
       this.qtyInStock=qtyInStock;
   }

     public String getName() {
         return name;
     }

     public double getPrice() {
         return price;
     }

     public String getAuthor() {
         return author;
     }

     public int getQtyInStock() {
         return qtyInStock;
     }

     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("how many objects of books you are gonna be create?");
         int s=sc.nextInt();
         for(int i=0;i<s;i++) {
             String name=sc.nextLine();
             String author=sc.nextLine();
             double price=sc.nextDouble();
             int qtyInStock=sc.nextInt();
             Book1 obj = new Book1(name,author,price,qtyInStock);
             System.out.println(obj.getAuthor());
             System.out.println(obj.getName());
             System.out.println(obj.getQtyInStock());
             System.out.println(obj.getPrice());
         }



     }
 }
