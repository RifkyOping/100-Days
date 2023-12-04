package D57;
import java.util.Scanner;
public class D57 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah inputan : ");
        int jumlah = input.nextInt();
        int arr[] = new int [jumlah];
        
        for(int i = 0; i < arr.length; i++){
            System.out.print("Masukka  angka : ");
            arr[i] = input.nextInt();
        }
        int hasil = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < hasil){
                hasil = arr[i];
            }
        }
        System.out.println("\nAngka terkecil adalah "+hasil);
    }
}
