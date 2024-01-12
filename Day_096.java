package clssobjck;
import java.util.Random;
import java.util.Scanner;
public class clssobjck {
    static void AngkaAcak(int stop, int awal, int akhir){
        while(true){
            if(stop == 0){
                break;
            }
            Random acak = new Random();
            int angka = acak.nextInt(akhir) + awal;    
            System.out.print(angka+" ");
            stop--;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menampilkan Angka Acak");
        System.out.print("Masukkan Batas Awal : ");
        int awal = in.nextInt();
        System.out.print("Masukkan Batas Akhir : ");
        int akhir = in.nextInt();
        System.out.print("Masukkan Jumlah Angka : ");
        int stop = in.nextInt();
        akhir -= awal;
        akhir++;
        AngkaAcak(stop, awal, akhir);
    }
}
