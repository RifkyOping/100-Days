package D56;
import java.util.Scanner;
public class D56 {
    
    public static void main(String[] args) {
        int kodeRahasia = 29;
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan kode rahasia : ");
            int kode = input.nextInt();
            if(kode == kodeRahasia){
                System.out.println("Kode Benar");
                break;
            }else if(kode > kodeRahasia){
                System.out.println("Kode yang anda masukkan terlalu besar\n");
            }else if(kode < kodeRahasia){
                System.out.println("Kode yang anda masukkan terlalu kecil\n");
            }
        }
    }
}
