//import class
import java.util.Scanner;
public class Huruf {
    public static void main(String[] args) {

        //declare variable
        Scanner input = new Scanner(System.in);

             //input
             char ch;
             Scanner huruf = new Scanner(System.in);
             
             
             System.out.print("Enter a charater: ");
             ch = huruf.next().charAt(0);

            if ( (ch == 'H') == (ch == 'h')){
                System.out.println("Gagal");
            }
            else{
                System.out.println("Tahniah");
            }
}
    
}
