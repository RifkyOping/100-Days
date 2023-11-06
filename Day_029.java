// Penggabungan Operator Ternary dengan Input Scanner
package ternary;

// Untuk Menggunakan Scanner input, kita harus membuat library
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        // Memanggil library Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai Ujian : ");
        
        // Cara memanggil scanner
        int nilai = input.nextInt();
        
        System.out.println("");
        
        // Isi dari Operator Ternary
        String predikat =
        nilai > 10 ? "Error":
        nilai >= 90 ? "Predikat Nilai = A (Amat Baik)":
        nilai >= 80 ? "Predikat Nilai = B (Baik)":
        nilai >= 70 ? "Predikat Nilai = C (Cukup)":
        nilai >= 60 ? "Predikat Nilai = D (Kurang)":
        "Predikat Nilai = E (Sangat kurang)";
        System.out.println(predikat);
    }
}
