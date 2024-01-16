package MenghitungUmur;
import java.util.Scanner;
public class MenghitungUmur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menghitung Umur");
        System.out.print("Masukkan Tanggal Lahir : ");
        int tglLahir = in.nextInt();
        System.out.print("Masukkan Bulan Lahir : ");
        int blnLahir = in.nextInt();
        System.out.print("Masukkan Tahun Lahir : ");
        int thnLahir = in.nextInt();
        
        System.out.print("\nMasukkan Tanggal Sekarang : ");
        int tgl = in.nextInt();
        System.out.print("Masukkan Bulan Sekarang : ");
        int bln = in.nextInt();
        int thn = 2024;
        System.out.println("\nOutput:");
        System.out.printf("Tanggal Lahir Anda : %d-%d-%d", tglLahir, blnLahir, thnLahir);
        System.out.printf("\nTanggal Sekarang : %d-%d-%d", tgl, bln, thn);
        
        int hasil = thn - thnLahir;
        if(bln <= blnLahir && tgl < tglLahir){
            hasil--;
        }else if(bln < blnLahir){
            hasil--;
        }
        System.out.printf("\n\nUmur Anda Sekarang Adalah %d tahun",hasil);
        
        int sisaBulan = blnLahir - bln;
        int posf = Math.abs(sisaBulan);
        if(blnLahir > bln){
            System.out.printf("\n%d bulan lagi anda ulang tahun", sisaBulan);
        }else if(blnLahir < bln){
            System.out.printf("\nUlang tahun anda sudah lewat %d bulan", posf);
        }else{
            int tglhasil = tglLahir - tgl;
            int posf2 = Math.abs(tglhasil);
            if(tglLahir > tgl){
                System.out.printf("\n%d hari lagi anda ulang tahun", tglhasil);
            }else if(tglLahir < tgl){
                System.out.printf("\nUlang tahun anda sudah lewat %d hari", posf2);
            }else{
                System.out.println("\nSelamat Ulang Tahun");
            }
        }
    }
}
