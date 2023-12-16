package D67;
import java.util.Scanner;
public class D67 {
    static void output(int arr[]){
        System.out.println("\nOutput:");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static void genap(int arr[]){
        int hasil = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                hasil++;
            }
        }
        System.out.println("\nTotal angka genap adalah "+hasil);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Panjang : ");
        int panjang = in.nextInt();
        
        int arr[] = new int [panjang];
        
        for(int i = 0; i < arr.length; i++){
            System.out.print("Masukkan Data : ");
            arr[i] = in.nextInt();
        }
        output(arr);
        genap(arr);
    }
}
