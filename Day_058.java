package D58;
import java.util.Scanner;
public class D58 {
    static void terbesar(int arr[]){
        int hasil = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > hasil){
                hasil = arr[i];
            }
        }
        System.out.println("\nOutput:");
        System.out.println("Angka terbesar adalah "+hasil);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah inputan : ");
        int jumlah = input.nextInt();
        int arr[] = new int [jumlah];
        
        for(int i = 0; i < arr.length; i++){
            System.out.print("Masukkan angka : ");
            arr[i] = input.nextInt();
        }
        terbesar(arr);
    }
}
