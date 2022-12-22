//import class
import java.util.Scanner;
public class Ifmatapelajaran{
    public static void main (String[]args){

//paparan output-makluman awal aturcara
System.out.println("ATURCARA MENGIRA SUBJECT");
// Pengisytiharan pembolehubah scanner
    Scanner input =new Scanner(System.in);
//papar teks pertanyaan
System.out.print("GRED UNTUK SAINS ");
//pengisytiharan pembolehubah input dan output
int subject;
int sains= input.nextInt();
System.out.print("GRED UNTUK MATHS ");
int maths= input.nextInt();
input.close();

subject = sains + maths;
//Menggunakan struktur kawalan if
        if( sains == maths ){
//papar output
System.out.println("Anda dua dua subject sama "+subject+", gred yang  diperolehi sama.");


        }
        else{
            System.out.println("Anda dua dua subject sama "+subject+", gred yang  diperolehi tidak sama.");
        }

    }

}