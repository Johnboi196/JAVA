//import class 
import java.util.Scanner;
public class Hasil_darab {
        public static void main (String[]args){

//paparan output-makluman awal aturcara
System.out.println ("ATURCARA PERMAINANA MATEMATIK-OPERASI DARAB");

//pengisytiharan pembolehubah scanner
Scanner input=new Scanner(System.in);

//Ishtihar pembolehubah dan papar teks pertanyaan
int nom1,nom2;
String jawab;
//kawalan ulangan do while
do{
 System.out.println("Nombor pertama:");
 nom1=input.nextInt();
 System.out.print("Nombor kedua:");
 nom2=input.nextInt();
 
 //paparan output 
 System.out.println("Hasil darab: "+nom1+ "X" +nom2+ "=" + Math.abs(nom2 * nom1));

 //pertanyaan ulangan
 System.out.println("Taipkan Y untuk teruskan..");
 jawab=input.next();

 //Ulangan selagi syarat ditepati
}while (jawab.equals("Y")||jawab.equals("y"));

}
 }