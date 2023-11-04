//Pemanfataan penggabungan Scanner dengan operator aritmatika pada Java
package D27;
//Untuk Menggunakan Scanner input, kita harus mengimpornya
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        //Membuat Scanner Baru
        Scanner input = new Scanner(System.in);
        
        //Isi Dari Scanner
        System.out.println("ARITMATIKA\n");
        
        //Deklarasi
        System.out.println("PENJUMLAHAN");
        System.out.print("Masukkan angka awal : ");
        
        //Cara memanggil Scanner
        int awal = input.nextInt();
        
        System.out.print("Masukkan angka akhir : ");
        int akhir = input.nextInt();
        
        System.out.println("Hasil = "+(awal+akhir));
        System.out.println("");
        
        System.out.println("PENGURANGAN");
        System.out.print("Masukkan angka awal : ");
        int awal1 = input.nextInt();
        
        System.out.print("Masukkan angka akhir : ");
        int akhir2 = input.nextInt();
        
        System.out.println("Hasil = "+(awal1-akhir2));
        System.out.println("");
        
        System.out.println("PERKALIAN");
        System.out.print("Masukkan angka awal : ");
        int awal2 = input.nextInt();
        
        System.out.print("Masukkan angka akhir : ");
        int akhir3 = input.nextInt();
        
        System.out.println("Hasil = "+(awal2*akhir3));
        System.out.println("");
        
        System.out.println("PEMBAGIAN");
        System.out.print("Masukkan angka awal : ");
        int awal3 = input.nextInt();
        
        System.out.print("Masukkan angka akhir : ");
        int akhir4 = input.nextInt();
        
        System.out.println("Hasil = "+(awal3/akhir4));
        System.out.println("");
        
        System.out.println("SISA BAGI");
        System.out.print("Masukkan angka awal : ");
        int awal4 = input.nextInt();
        
        System.out.print("Masukkan angka akhir : ");
        int akhir5 = input.nextInt();
        
        System.out.println("Hasil = "+(awal4%akhir5));
    }
    }
