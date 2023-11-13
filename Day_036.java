package D36;
// Membuat Library Scanner
import java.util.Scanner;
public class D36 {
    
    public static void main(String[] args) {
        // Memanggil Library Scanner
        Scanner input = new Scanner(System.in);
        double a, t, s, L, K;
        // Deklarasi
        System.out.println("Menghitung Luas dan Keliling Segitiga sama sisi");
        System.out.println("Masukkan Alas : ");
        a = input.nextDouble();
        
        System.out.println("Masukkan Tinggi : ");
        t = input.nextDouble();
        
        s = a;
        // Rumus Mencari Luas Segitiga
        L = 0.5 * a * t;
        // Rumua Mencari Keliling Segitiga
        K = s + s + s;
        
        System.out.println("Jika alas adalah "+a+" dan tinggi adalah "+t);
        System.out.println("Maka Luas Segitiga adalah "+L);
        System.out.println("Dan Keliling Segitiga adalah "+K);
    }
    
}
