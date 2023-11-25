package pangkat;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        int hasil = angka;
        for(int a = angka; a > 0; a--){
            System.out.print(a);
            if(a > 1){
                System.out.print(" x ");
            }
            if(angka != a){
                hasil *= a;
            }
            
        }
        System.out.println();
        System.out.println("Hasil = "+hasil);
    }
    
}
