
import java.util.Scanner;
public class Pelajar_markah {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("masukkan markah anda: ");
        int gred = input.nextInt();
        input.close();

        if(gred <= 45){
            System.out.println("Anda gagal,usaha lagi!");
        }

        else{ 
            System.out.println("Tahniah,anda lulus.");

        }
        } 
}


   

