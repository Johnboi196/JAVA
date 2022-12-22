import java.util.Scanner;
public class Nombor_genap {
    public static void main(String[] args) {
        //declare variable
        Scanner input = new Scanner(System.in);

        //input
        System.out.println("Masukkan nilai : ");
        int nombor = input.nextInt();

        input.close();

        if(nombor % 2 == 0){
            System.out.println("nombor " +nombor+ " adalah nombor genap");
        }
        else{
            System.out.println("nombor " +nombor+ " adalah nombor ganjil");
        }
    }
}
