package D89;
import java.util.Scanner;
public class D89 {
    
    public static void main(String[] args) {
        System.out.println("Tabel Pengurangan");
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.print("Masukkan Angka Pengurangan : ");
            int angka = in.nextInt();
            
            for(int i = 1; i <= 10; i++){
                System.out.println(i+" - "+angka+" = "+(i-angka));
            }
            System.out.println();
        }
    }
}
