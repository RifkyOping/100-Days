package D47;
import java.util.Scanner;
public class D47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = 40;
        System.out.println("Maksimal Angka = "+angka);
        System.out.println();
        System.out.print("Batas Angka Genap = ");
        int batas = input.nextInt();
        System.out.print("Batas Angka Ganjil = ");
        int batass = input.nextInt();
        System.out.println("Angka Genap");
        for(int i = 2; i <= angka; i+=2){
            System.out.println(i);
            batas--;
            if(batas == 0){
                break;
            }
        }
        System.out.println();
        System.out.println("Angka Ganjil");
        for(int i = 1; i <= angka; i+=2){
            System.out.println(i);
            batass--;
            if(batass == 0){
                break;
            }
        }
    }
}
