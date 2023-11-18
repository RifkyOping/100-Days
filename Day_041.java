package D41;
import java.util.Scanner;
public class D41 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menampilkan Bilangan Genap & Ganjil");
        System.out.print("Angka Awal : ");
        int awal = input.nextInt();
        System.out.print("Angka Akhir : ");
        int akhir = input.nextInt();
        System.out.println();
        System.out.println("Bilangan Genap");
        for(int a = awal; a <= akhir; a++){
            if(a % 2 == 0){
                System.out.println(a);
            }
        }System.out.println();
        System.out.println("Bilangan Ganjil");
        for(int a = awal; a <= akhir; a++){
            if(a % 2 != 0){
                System.out.println(a);
            }
        }
    }
}
