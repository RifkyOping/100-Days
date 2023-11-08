// Challenge From Mentor
package d31;

// Untuk Menggunakan Scanner input, kita harus membuat library
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        int gajiBersihku = 0,gajiBersih;
        // Menggunakan Perulangan For untuk mempersingkat codingan
        // Agar tidak terjadi pemborosan Line
        for(int a = 1; a <= 5; a++){
            
            // Memanggil Library Scanner
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Jumlah Hari Kerja : ");
            // Memanggil Scanner
            int hariKerja = input.nextInt();
            
            // Deklarasi Menghitung Gaji Karyawan
            int gajiKotorperhari = 120000;
            int uangMakan = 15000;
            int TotMakan = uangMakan * hariKerja;
            int gajiKotor = gajiKotorperhari * hariKerja;
            gajiBersih = gajiKotor - TotMakan;
            
            System.out.println("Karyawan "+a);
            System.out.println("Jumlah Hari Kerja \t: "+hariKerja+" Hari");
            System.out.println("Uang Makan Perhari \t: Rp."+uangMakan);
            System.out.println("Gaji Kotor \t\t: Rp."+gajiKotor);
            System.out.println("Gaji Bersih \t\t: Rp."+gajiBersih);
            System.out.println("");
            
            // Menghitung jumlah dana yg harus di keluarkan perusahaan
            gajiBersihku += gajiBersih;
        }
        
        System.out.println("Dana Yang Harus di Keluarkan Perusahaan : Rp."+gajiBersihku);
    }
    
}
