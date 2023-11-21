package D44;
import java.util.Scanner;
public class D44 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===>Periksa Kelulusan Anda<===");
        System.out.println();
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.println();
        System.out.print("Masukkan Nilai Agama : ");
        int agama = input.nextInt();
        System.out.print("Masukkan Nilai B.Indonesia : ");
        int bindo = input.nextInt();
        System.out.print("Masukkan Nilai IPA : ");
        int ipa = input.nextInt();
        System.out.print("Masukkan Nilai Matematika : ");
        int mtk = input.nextInt();
        System.out.println();
        
        double hasil = (agama + bindo + ipa + mtk)/4;
        System.out.println("Rata-rata Nilai : "+hasil);
        System.out.println();
        if(hasil > 100){
            System.out.println("Error");
        }else if(hasil > 70 && hasil <= 100){
            System.out.println("Selamat "+nama+", Anda Lulus");
            if(hasil >= 90){
                System.out.println("Dengan Predikat Nilai A");
            }else if(hasil >= 80){
                System.out.println("Dengan Predikat Nilai B");
            }else{
                System.out.println("Dengan Predikat Nilai C");
            }
        }else{
            System.out.println("Maaf "+nama+", Anda Tidak Lulus");
        }
    }
}
