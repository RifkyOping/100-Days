package D88;
import java.util.Scanner;
public class D88 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menentukan Jumlah Spasi Pada Sebuah Kalimat");
        System.out.print("Masukkan Kalimat/Kata: ");
        String kalimat = in.nextLine();
        
        int hasil = 0;
        for(int i = 0; i < kalimat.length(); i++){
            if(kalimat.charAt(i) == ' '){
                hasil++;
            }
        }
        System.out.println("\nJumlah Spasi Dalam Kalimat Tersebut Adalah "+hasil);
    }
    
}
