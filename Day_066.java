package D66_;
import java.util.Scanner;
public class D66_ {
    static void outputgenap(int arr[]){
        System.out.println("\nOutput Bilangan Genap :");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
    static void genap(int arr[]){
        int hasil = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                hasil += arr[i];
            }
        }
        System.out.println("\nJumlah seluruh bilangan genap adalah "+hasil);
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
        outputgenap(arr);
        genap(arr);
    }
}
