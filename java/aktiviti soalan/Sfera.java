import java.text.DecimalFormat;
import java.util.Scanner;
public class Sfera {
    public static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        //declare variable
        Scanner input = new Scanner(System.in);
        double PI = 3.14;

        //input
        System.out.println("Masukkan nilai jejari Sfera : ");
        double radius = input.nextDouble();
        input.close();

       //calculation
       double sphere = (4.0/3.0)*PI*(radius*radius*radius);

       //output
       System.out.println ("Isispadu Sfera setelah jejari dimasukkan ialah : "  + df.format(sphere));

    }
}
