package teks;
import java.util.Scanner;
public class teks {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menentukan Jumlah Huruf Pada Sebuah Kalimat/Kata");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = input.nextLine();
        String kata [] = kalimat.split(" ");
        
        int jumlah = 0;
        for (int i = 0; i < kata.length; i++){
            jumlah += kata[i].length();
        }
        System.out.println("\nJumlah Huruf Pada Kalimat/kata :\n=>"+kalimat+"\n\nAdalah : "+jumlah+" Huruf");
    }
}
