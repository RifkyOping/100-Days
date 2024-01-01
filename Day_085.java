package JumlahAngka;
import java.util.Scanner;
public class JumlahAngka {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menentukan Jumlah Angka");
        System.out.print("Antara : ");
        int awal = in.nextInt();
        System.out.print("Sampai : ");
        int akhir = in.nextInt();
        
        int hasil = 0;
        for(int i = awal; i < akhir; i++){
            if(awal != i){
                hasil++;
            }
        }
        System.out.println("\nJumlah angka antara "+awal+" sampai "+akhir);
        System.out.println("Adalah : "+hasil);
    }
    
}
