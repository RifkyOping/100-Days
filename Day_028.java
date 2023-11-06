//Penggabungan operator pembanding dengan input Scanner
package D28;

//Untuk Menggunakan Scanner input, kita harus mengimpornya
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        //Membuat Scanner baru
        Scanner input = new Scanner(System.in);
        
        //Deklarasi
        System.out.println("OPERATOR PEMBANDING MELALUI INPUT SCANNER\n");
        System.out.println("1. < (Lebih kecil)");
        System.out.print("Nilai pertama : ");
        //Cara memanggil Scanner
        int awal = input.nextInt();
        
        System.out.print("Nilai kedua : ");
        int akhir = input.nextInt();
        
        System.out.println("Apakah "+awal+" lebih kecil dari "+akhir+" ?");
        //Menggunakan operator pembanding
        System.out.println("Hasil = "+(awal < akhir));
        System.out.println("");
        
        System.out.println("2. > (Lebih besar)");
        System.out.print("Nilai pertama : ");
        int awal1 = input.nextInt();
        
        System.out.print("Nilai kedua : ");
        int akhir2 = input.nextInt();
        
        System.out.println("Apakah "+awal1+" lebih besar dari "+akhir2+" ?");
        System.out.println("Hasil = "+(awal1 > akhir2));
        System.out.println("");
        
        System.out.println("3. == (sama dengan)");
        System.out.print("Nilai pertama : ");
        int awal2 = input.nextInt();
        
        System.out.print("Nilai kedua : ");
        int akhir3 = input.nextInt();
        
        System.out.println("Apakah "+awal2+" sama dengan "+akhir3+" ?");
        System.out.println("Hasil = "+(awal2 == akhir3));
        System.out.println("");
        
        System.out.println("4. <= (Lebih kecil atau sama dengan)");
        System.out.print("Nilai pertama : ");
        int awal3 = input.nextInt();
        
        System.out.print("Nilai kedua : ");
        int akhir4 = input.nextInt();
        
        System.out.println("Apakah "+awal3+" lebih kecil atau sama dengan "+akhir4+" ?");
        System.out.println("Hasil = "+(awal3 <= akhir4));
        System.out.println("");
        
        System.out.println("5. >= (Lebih besar atau sama dengan)");
        System.out.print("Nilai pertama : ");
        int awal4 = input.nextInt();
        
        System.out.print("Nilai kedua : ");
        int akhir5 = input.nextInt();
        
        System.out.println("Apakah "+awal4+" lebih besar atau sama dengan "+akhir5+" ?");
        System.out.println("Hasil = "+(awal4 >= akhir5));
        System.out.println("");
        
        System.out.println("6. ≠ (Tidak sama dengan)");
        System.out.print("Nilai pertama : ");
        int awal5 = input.nextInt();
        
        System.out.print("Nilai kedua : ");
        int akhir6 = input.nextInt();
        
        System.out.println("Apakah "+awal5+" tidak sama dengan "+akhir6+" ?");
        System.out.println("Hasil = "+(awal5 != akhir6));
    }
    
          }
