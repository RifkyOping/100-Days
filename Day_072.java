package Bom;
import java.util.Scanner;
public class Bom {
    public static void main(String[] args) {
        int bom = 29;
        int awal = 0;
        int akhir = 100;
        int angka = 0;
        do{
            Scanner in = new Scanner(System.in);
            System.out.print("Masukkan Angka "+awal+"-"+akhir+" : ");
            angka = in.nextInt();
            if(angka == bom){
                System.out.println("\nBOM");
                break;
            }else if(angka < bom){
                awal = angka;
            }else if(angka > bom){
                akhir = angka;
            }
            
        }while(angka != bom);
    }
}
