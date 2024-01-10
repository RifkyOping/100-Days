package D92;
import java.util.Scanner;
public class D92 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menentukan Huruf 'a' dalam Sebuah Kata/Kalimat");
        System.out.print("Masukkan Kata/Kalimat : ");
        String kata = in.nextLine();
        int hasil = 0;
        for(int i = 0; i < kata.length(); i++){
            if(kata.charAt(i) == 'A' || kata.charAt(i) == 'a'){
                hasil++;
            }
        }
        System.out.println("Jumlah Huruf ('A'/'a') Adalah "+hasil);
    }
}
