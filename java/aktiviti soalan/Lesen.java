import java.util.Scanner;
public class Lesen {
    public static void main (String[]args){
        //paparan output-makluman awal atrucara
        System.out.println("ATURCARA TENTUKAN LAHIR SEBELUM/SELEPAS LESEN");
        
        //pengisytiharan pemboelhubah Scanner
          Scanner input = new Scanner(System.in);
         
        
        //papar teks pertanyaan
        System.out.print("Masukkan tahun anda dilahirkan sahaja ENTER:");
        int lahir = input.nextInt();
        
        //pengisytihran pembolehubah input
        int lesen =2004;
        
        //menggunakan struktur kawalan if else
         
        if(lahir > lesen){
            //papar output True
            System.out.println("Maaf,Anda belum layak memohon lesen motosikal");   
           }else{   
           //papar output False
           System.out.println("Anda sudah layak memohon lesen motosikal");
           
          
              }
             } 
           }