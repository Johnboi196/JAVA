//Import class
import java.util.Scanner;
public class Operasitambah {
    public static void main(String[] args) {
        //paparan output-makluman awal aturcara
        System.out.println("ATURCARA PERMAINAN MATEMATIK - OPERASI TAMBAH");

        //pengisytiharan pembolehubah Scanner
        Scanner input = new Scanner (System.in);

        //Isytihar pembolehubah dan nilai awal
        int bilbetul = 0;
        int bilsoalan = 0;
        String output = "";

        //papar teks pernyataan & isytihar pembolehubah input
        System.out.println("Bilangan soalan:");
        int soalan=input.nextInt();

        //kawalan ulangan guna whil dan if 
       
        while (bilsoalan < soalan){
            //Istihar pembolehubah dan jana nombor rawak
            int nombor1 =(int)(Math.random()* 16 + 1 );
            int nombor2 =(int)(Math.random()* 16 + 1 );
 
            if (nombor1 < nombor2){
                int temp = nombor1;
                nombor1 = nombor2;
                nombor2 = temp;
            }
            //papar soalan operasi tambah dan input jawapan 
            System.out.println("Berapakah"+ nombor1+"+"+nombor2+"=");
            int jawapan = input.nextInt();
            
            
            // semak jawapan

                if ( nombor1 + nombor2 == jawapan ){
                    System.out.println("Jawapan anda betul!");
                    bilbetul++;
                }
                else
                {
                    System.out.println("Jawapan anda salah.");
                }
            
                // for(int i = 0;i > soalan; i++){
                //     if (nombor1 + nombor2 == jawapan){
                //        bilbetul++;
                //     }
                // }
                input.close();

               output += "\n"+nombor1 +"+" + nombor2 + "="+ jawapan +((nombor1 + nombor2 == jawapan)?" betul":" salah");
                System.out.println("Bilangan soalan betul" + bilbetul + output);
            }
            //papar semula soalan
             //paparan output
            }
        }

