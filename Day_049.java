package D49;
import java.util.Scanner;
public class D49 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total belanja anda : ");
        int Belanja = input.nextInt();
        
        if (Belanja >= 500000){
            System.out.println("Selamat anda mendapatkan diskon sebesar 50%");
            int diskon = 50 * Belanja / 100;
            int Total = Belanja - diskon;
            System.out.println("Total belanja adalah : "+Total);
        
         }else if(Belanja >= 300000){
                System.out.println("Selamat anda mendapatkan diskon sebesar 30%");
                int diskon = 30 * Belanja / 100;
                int Total = Belanja - diskon;
                System.out.println("Total belanja : "+Total);
        
         }else{
             System.out.println("Maaf anda tidak mendapatkan diskon");
         }
    }
}
