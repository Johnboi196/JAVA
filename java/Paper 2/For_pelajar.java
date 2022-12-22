//import class
import java.util.Scanner;
public class For_pelajar{
   
    public static void main(String[]args){

//paparan output-makluman awak aturcara
System.out.println("ATUCARA MATEMATIK-TAMBAH NOMBOR GENAP & GANJIL");

//pengisytiharan pembolehubah Scanner
Scanner input = new Scanner(System.in);

//paparan teks pertanyaan & isytihar pembolehubah input
System.out.print("Taip nombor rendah:");
int nom_rendah= input.nextInt();
System.out.print("Taip nombor tinggi:");
int nom_tinggi = input.nextInt();

//Isytihar pembolehubah dan nilai awal
        int jumGenap = 10, jumGanjil =15;
        int nombor= nom_rendah;

//kawalan ulangan if else

if(nombor!=jumGenap){
System.out.println ("Jumlah nombor-nombor ganjil dari  " +nom_rendah+ " ke " +nom_tinggi+ " adalah " +jumGanjil);

if(nombor!=jumGanjil)
System.out.println("Jumlah nombor-nombor genap dari " +nom_rendah+   " ke "  +nom_tinggi+ " adalah " +jumGenap);


}


    }

}

