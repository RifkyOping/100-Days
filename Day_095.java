package D95;
import java.util.Scanner;
public class D95 {
    static void Konsonan(String konvert){
        int hasil = 0;
        for(int i = 0; i < konvert.length(); i++){
            if(konvert.charAt(i) != 'a' && konvert.charAt(i) != 'i' && konvert.charAt(i) != 'u' && konvert.charAt(i) != 'e' && konvert.charAt(i) != 'o' && konvert.charAt(i) != ' '){
                hasil++;
            }
        }
        System.out.printf("\nJumlah Huruf Konsonan Adalah  %d",hasil);
    }
    static void Vokal(String konvert){
        int hasil = 0;
        for(int i = 0; i < konvert.length(); i++){
            if(konvert.charAt(i) == 'a' || konvert.charAt(i) == 'i' || konvert.charAt(i) == 'u' || konvert.charAt(i) == 'e' || konvert.charAt(i) == 'o' && konvert.charAt(i) != ' '){
                hasil++;
            }
        }
        System.out.printf("\nJumlah Huruf Vokal Adalah  %d",hasil);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menentukan Jumlah Huruf Konsonan dan Vokal");
        System.out.print("Masukkan Kata/Kalimat : ");
        String kalimat = in.nextLine();
        String konvert = kalimat.toLowerCase();
        Konsonan(kalimat);
        Vokal(konvert);
    }
}
