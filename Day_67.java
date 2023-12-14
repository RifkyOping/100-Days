package D67_;
import java.util.Scanner;
public class D67_ {
    static void outputganjil(int arr[]){
        System.out.println("\nOutput Bilangan Ganjil :");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 1){
                System.out.println(arr[i]);
            }
        }
    }
    static void ganjil(int arr[]){
        int hasil = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 1){
                hasil += arr[i];
            }
        }
        System.out.println("\nJumlah seluruh bilangan ganjil adalah "+hasil);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Panjang Array : ");
        int jumlah = sc.nextInt();
        int arr[] = new int [jumlah];
        
        for(int i = 0; i < arr.length; i++){
            System.out.print("Masukkan Data : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Output:");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        outputganjil(arr);
        ganjil(arr);
    }
}
