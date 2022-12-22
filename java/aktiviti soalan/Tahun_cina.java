//Import class
import java.util.Scanner;
public class Tahun_cina {
    public static void main(String[] args){

        //Paparan output-makluman awal aturcara
        System.out.println("ATURCARA MENGIRA KALENDAR CINA");
        //Pengisytuharan pembolehubah Scanner
        Scanner input = new Scanner (System.in);

        //Papar tekas pertanyaan
        System.out.println("Taipkan tahun:");
        
        //Pengisytiharan pembolehubah input dan pengiraan
        int tahun_masihi = input.nextInt();
        int tahun_cina = tahun_masihi % 12;

        //Guna kawalan swicth-case
        switch (tahun_cina){
            case 0:
            System.out.println("Tahun"+tahun_masihi+   "adalah" + "TAHUN MONYET")
            ;break;
            case 1:
            System.out.println("Tahun" +tahun_masihi+ "adalah" + "TAHUN AYAM");
            break;
            case 2:
            System.out.println("Tahun" +tahun_masihi+ "adalah" + "TAHUN ANJING");
            break;
            case 3:
            System.out.println("Tahun" +tahun_masihi+ "adalah" + "TAHUN BABI");
            break;
            case 4:
            System.out.println("Tahun" +tahun_masihi+ "adalah" + "TAHUN TIKUS");
            break;
            case 5:
            System.out.println("Tahun" +tahun_masihi+ "adalah" + "TAHUN LEMBU");
            break;
            case 6:
            System.out.println("Tahun" +tahun_masihi+ "adalah" + "TAHUN HARIMAU");
            break;
            case 7:
            System.out.println("Tahun" +tahun_masihi+ "adalah" + "TAHUN ARNAB");
            break;
            case 8:
            System.out.println("Tahun" +tahun_masihi+ "adalah" + "TAHUN NAGA");
            break;
            case 9:
            System.out.println("Tahun" +tahun_masihi+ "adalah" + "TAHUN ULAR");
            break;
            case 10:
            System.out.println("Tahun" +tahun_masihi+ "adalah" + "TAHUN KUDA");
            break;
            case 11:
            System.out.println("Tahun" +tahun_masihi+ "adalah" + "TAHUN KAMBING");
            break;
        }
    }
}