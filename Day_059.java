package D59;
import java.util.Scanner;
public class D59 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        String kalimat = input.nextLine();
        
        System.out.println();
        System.out.println("Di ubah ke huruf besar:");
        System.out.println(kalimat.toUpperCase());
        System.out.println();
        System.out.println("Di ubah ke huruf kecil:");
        System.out.println(kalimat.toLowerCase());
    }
}
