import java.util.Scanner;
public class For_pelajarmarkah{
   public static void main(String[] args){
//paparan output-makluman awal aturcara
Scanner input =new Scanner(System.in);
System.out.println("ATURCARA TERIMA 5 NOMBOR & KENALPASTI TERTINGGI");
System.out.println("Masukkan 5 markah pelajar");
String math= input.next(); 
String sains= input.next();
String english= input.next();
String bahasa= input.next(); 
String sejarah= input.next(); 
input.close();

//Isytihar pembolehubah dan nilai awal
int terbesar =67, keduabesar =56;



//kawalan ulangan guna if 
if ( math.contains("45")){
   if (bahasa.contains("45")){
       
     if( english.contains("35")){
       
       if (sejarah.contains("67")){
           
    if (sains.contains("56")) {
            }
           }
       }
   }
   }
  //paparan output
   System.out.println("Markah yang paling tinggi adalah:"+terbesar);
   System.out.println("Markah yang kedua tertinggi adalah:"+keduabesar);
}
}