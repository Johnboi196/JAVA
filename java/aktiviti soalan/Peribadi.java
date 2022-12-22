//Import class
import java.time.Year;
import java.util.Scanner;
public class Peribadi{
  public static void  main(String[] args)  {

    // Pengisytiharan pembolehan Scanner
       Scanner input = new Scanner(System.in);

       //paparan teks pertanyaan1 & isytihar pembolehubah nilai input1
         System.out.print("Masukkan nama anda:");
         String nama = input.next();

         //papar tks pertanyaan2 & isytihar pembolehubah nilai input2
           System.out.print("Masukkan tahun anda dilahirkan:");
           int tahun = input.nextInt();
          
        //papar teks prtanyaan3 & isytihar pembolehubah nilai input3
          System.out.print("Masukkan bandar anda dilahirkan:");
          String negeri = input.next();

          //pengiraan umur
            int tahunsemasa = Year.now().getValue();
            int umur=tahunsemasa-tahun;

            //memaparkan output
              System.out.println("Nama:"+nama);
              System.out.println("Umur:"+umur);
              System.out.println("Bandar kelahiran: "+negeri);


}
}


