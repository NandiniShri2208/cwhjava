import java.util.Scanner;

public class Multidim {
    public static void main(String[] args) {
        int [][]flat;
        flat=new int[2][3];
        Scanner s=new Scanner(System.in);
        for(int i=0;i< flat.length;i++){
            for(int j=0;j<flat[i].length;j++){
                flat[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<flat.length;i++){
            for(int j=0;j<flat[i].length;j++){
                System.out.println(flat[i][j]);
            }
        }
    }
}
