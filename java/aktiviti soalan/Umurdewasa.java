//import class
import java.time.Year;
import java.util.Scanner;
public class Umurdewasa{
    public static void main (String[]args){

//paparan output-makluman awal aturcara
System.out.println("ATURCARA MENGIRA UMUR & PERINGAT DEWASA");
// Pengisytiharan pembolehubah scanner
    Scanner input =new Scanner(System.in);
//papar teks pertanyaan
System.out.print("taip tahun kelahirran anda dan tekan ENTER:");
//pengisytiharan pembolehubah input dan output
int tahun_lahir = input.nextInt();
int tahun_semasa;
int umur;
//pengiraan umurjava umurdewasa.java
tahun_semasa = Year.now().getValue();
umur=tahun_semasa-tahun_lahir;
//Menggunakan struktur kawalan if
        if(umur<19){
//papar output
System.out.println("Anda berumur"+umur+",anda belum dewasa.");


        }


    }

}