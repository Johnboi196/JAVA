//Import class
// import java.time.Year;
import java.util.Scanner;
public class Konsonanvokal{
        public static void main(String[] args) {
//paparan output-makluman awal aturcara
System.out.println("ATURCARA BILANG HURUF KONSONAN & VOKAL");
//pengisytiharan pembolehubah Scanner
Scanner taip = new Scanner (System.in);
//papar teks pertanyaan dan isihar pembolehubah
   System.out.println("Taipkan satu perkataan tekan ENTER");
   String perkataan =taip.next();
   char[]hurufv = perkataan.toCharArray();
   int vokal = 0;


//kawalan ulang for
  for (char h:hurufv){
    if(h == 'a'||h == 'A'|| h == 'e'|| h=='E'||h=='i'||h=='I'|| h =='o'|| h=='O'|| h=='u'||h=='U'){

//penambah
vokal++;    
    }

  }

  //paparan output
  System.out.println("bilangan huruf vokal dalam"+perkataan+"adalah:"+vokal);
  System.out.println("bilangan huruf konsonan dalam"+perkataan+"adalah:"+(hurufv.length - vokal));         

        }
}

