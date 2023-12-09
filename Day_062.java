package D62_;
import java.util.Scanner;
public class D62_ {
    static void keliling(int r){
        double K = 12 * r;
        System.out.println("\nJika panjang rusuknya "+r+", maka keliling kubus tersebut adalah "+K);
    }
    static void luas(int r){
        double L = r * r * 6;
        System.out.println("\nJika panjang rusuknya "+L+", maka luas permukaan kubus tersebut adalah "+L);
    }
    static void volume(int r){
        double v = r * r * r;
        System.out.println("\nJika panjang rusuknya "+r+", maka volume kubus tersebut adalah "+v);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Panjang Rusuk : ");
        int r = sc.nextInt();
        
        keliling(r);
        luas(r);
        volume(r);
    }
}
