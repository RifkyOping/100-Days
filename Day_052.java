package D52;
import java.util.Scanner;
public class D52 {
    
    public static void main(String[] args) {
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Angka : ");
            int angka = input.nextInt();
            if(angka >= 40 && angka <= 99){
                System.out.println("Output:");
                System.out.println(angka);
                break;
            }
        }
    }
}
