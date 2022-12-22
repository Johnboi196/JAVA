//import class
import java.util.Scanner;
public class Merdeka {
    public static void main (String[]args){
//paparan output-makluman awal atrucara
System.out.println("ATURCARA TENTUKAN LAHIR SEBELUM/SELEPAS MERDEKA");

//pengisytiharan pemboelhubah Scanner
  Scanner input = new Scanner(System.in);
  input.close();

//papar teks pertanyaan
System.out.print("Masukkan tahun anda dilahirkan dan tekan ENTER:");
int lahir = input.nextInt();

//pengisytihran pembolehubah input
int merdeka =1957;

//menggunakan struktur kawalan if else
if(lahir > merdeka){


 //papar output True
 System.out.println("Anda dilahirkan selepas merdeka");   
}else{


//papar output False
System.out.println("Anda dilahirkan sebleum merdeka");



   }


  } 

}
