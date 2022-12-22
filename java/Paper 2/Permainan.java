//Import class
import java.util.Scanner;
public class Permainan{
    public static void main(String[] args) {

 //paparan output-makluman awal aturcara
System.out.println("ATURCARA PERMAINAN MATEMATIK-OPERASI TAMBAH");     
 
 //penisytiharan pembolehubah Scanner
 Scanner input = new Scanner (System.in);
 
 //Ishtihar pembolehubah dan papar teks pertanyaan
 int nom1 = (int) (Math .random()*101);
 int nom2 = (int)   (Math.random()*101);

 System.out.println("Nyatakan jawapan"+nom1+"+"+nom2+"=");
 int jawapan = input.nextInt();

 //kawalan ulangan guna while
 while (nom1+nom2!=jawapan){

//papar output jika jawapan salah dan ulab tanya
    System.out.print("jawapan andasalah! sila cuba lagi...\n Nyatakan jawapan"+nom1+"+"+nom2+"=");
    jawapan = input.nextInt();

 }
 input.close();
 //papar output jika jawapan betul
 System.out.println("Tahniah ,jawapan anda betul!");


    }

}
