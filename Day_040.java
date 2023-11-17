package D40;
import java.util.Scanner;
public class D40 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();
        System.out.print("Masukkan Pangkat : ");
        int pangkat = input.nextInt();
        int hasil = angka;
        for(int i = 1; i  < pangkat; i++){
            hasil *= angka;
        }
        System.out.println(angka+" Pangkat "+pangkat+" Adalah = "+hasil);
    }
    
}
