// Menentukan Angka Ganjil Genap Menggunakan Operator Ternary
package D32;
// Membuat Library Scanner
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        // Memanggil Library Scanner
        Scanner input = new Scanner(System.in);
        // Deklarasi
        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();
        // Membuat Kondisi Menggunakan Operator Ternary
        int kondisi = angka % 2;
        String masukan = kondisi == 0 ?
        "Ini Angka Genap":"Ini Angka Ganjil";
        System.out.println(masukan);
    }
    
}
