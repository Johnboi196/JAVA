//import class
import java.util.Scanner;
public class Pt3{
    public static void main (String[]args){

Scanner input =new Scanner(System.in);

System.out.println("Masukkan kesemua gred pembelajaran.");

System.out.println("Gred Mathematics.");
String math= input.next(); 

System.out.println("Gred Sains.");
String sains= input.next(); 

System.out.println("Gred Inglish.");
String inglish= input.next(); 

System.out.println("Gred Bahasa Melayu.");
String bahasa= input.next(); 


System.out.println("Gred Sejarah.");
String sejarah= input.next(); 
input.close();

if ( math.contains("A")){
if ( inglish.contains("A") ){
    
System.out.println("Tahniah,anda layak memasuki kelas 4 sains komputer!''.");
      
    if (bahasa.contains("A")){
    
    if (sejarah.contains("A")){
        
 if (sains.contains("A")) {
         }
        }
    }
}
}
else {
    System.out.println("Anda tidak layak memasuki kelas 4 sains komputer!''.");
}
}
}
