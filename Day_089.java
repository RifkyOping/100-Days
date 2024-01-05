package D89;
import java.util.Scanner;
public class D89 {
    
    public static void main(String[] args) {
        System.out.println("Tabel Penjumlahan");
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.print("Masukkan Angka Penjumlahan : ");
            int angka = in.nextInt();
            
            for(int i = 1; i <= 10; i++){
                System.out.println(i+" + "+angka+" = "+(angka+i));
            }
            System.out.println();
        }
    }
}
