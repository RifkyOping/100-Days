package D73;
import java.util.Scanner;
public class D73 {
    static void luas(double a, double t){
        double L = a * t;
        System.out.println("\nJika alas "+a+" dan tinggi "+t+" Maka luas jajar genjang adalah "+L);
    }
    static void keliling(double a, double t){
        double k = 2 * (a + t);
        System.out.println("\nDan kelilingnya adalah "+k);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Alas : ");
        double a = in.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        double t = in.nextDouble();
        
        luas(a, t);
        keliling(a, t);
    }
    
}
