//import class
import java.util.Scanner;
public class jejaribulatan {
    public static void main (String[]args){
        //pengisytiharan pembolehubah Scanner(System.in);

        //papar teks pertanyaan
        System.out.println("Masukkan nilai jejari bulatan:");

        //pengisytiharan pembolehubah yang memagang nilai input
        double jejari = input.nextDouble();

        //membuat pengiraan dan bundar kepada 2 tempat perpuluhan
        double luas = Math.round((jejari*jejari*3.14159)
        *100.0)/100.0;


        //papar output
        System.out.println("Luas bulatan dengan jejari"+jejari+" adalah" +luas+"persegi");


    }
}
