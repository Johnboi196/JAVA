public class kiraluas {
    static java.util.Scanner taip = new java.util.Scanner(System.in);
    public static void main(String [] args){

        //istihar pembolehubah
        double papar;
        //umpuk nilaidengan sub aturcara fungsi
        papar =kiraluas();
        //panggil semula nilai untuk output
        System.out.println("Isipadu bagi kuboid yang adfalah "+papar+"padu");
    }

    //sub aturcara yang berbentuk fungsi
    static double kiraluas(){
        //isatihar pembolehubah
        double panjang,lebar,tinggi,isipadu;
        System.out.println("Panjang kuboid: ?");
        panjang=taip.nextDouble();
        System.out.println("Lebar kuboid: ?");
        lebar=taip.nextDouble();
        System.out.println("Tinggi kuboid: ?");
        tinggi=taip.nextDouble();

        //lakukan operasi pengiraan
        isipadu=panjang *lebar*tinggi;

        //hantar data setelah dilakukan pengiraan
        return Math.round(isipadu);
    }
    
}
