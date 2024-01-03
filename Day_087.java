package D86;
import java.util.Scanner;
public class D86 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menentukan Jumlah Kata Dalam Sebuah Kalimat");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = input.nextLine();
        String kata [] = kalimat.split(" ");
        
        int jumlah = 0;
        for (int i = 0; i < kata.length; i++){
            if(i >= 0){
                jumlah++;
            }
        }
        System.out.println("\nJumlah Kata dalam kalimat tersebut adalah "+jumlah+" Kata");
    }
    
}
