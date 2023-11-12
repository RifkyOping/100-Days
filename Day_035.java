// Menghitung Luas dan Keliling Lingkaran
package D35;
// Jika ingin menginput angka maka kita harus membuat Library Scanner.
import java.util.Scanner;
public class D35 {
    
    public static void main(String[] args) {
        // Memanggil Library Scanner.
        Scanner input = new Scanner(System.in);
        
        // Deklarasi
        System.out.println("Menghitung Luas Dan Keliling Lingkaran");
        // Input
        System.out.print("Masukkan r (jari-jari) : ");
        double r = input.nextDouble();
        
        // Nilai Phi
        double phi = 3.14;
        // Rumus Mencari Diameter
        double d = 2 * r;
        // Rumus Mencari Luas Lingkaran
        double L = phi * r * r;
        // Rumus Mencari Keliling Lingkaran
        double K = phi * d;
        
        // Output
        System.out.println("Jika r (jari-jari) Lingkaran Adalah = "+r);
        System.out.println("Maka Luas Lingkaran Adalah = "+L);
        System.out.println("Dan Keliling Lingkaran Adalah = "+K);
    }
    
}
