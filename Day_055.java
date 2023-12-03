package D55_;
import java.util.Scanner;
public class D55_ {
    static void genap(int arr[]){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.println("Genap");
            }else if(arr[i] % 2 != 0){
                System.out.println("Ganjil");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah penginputan : ");
        int jumlah = input.nextInt();
        int arr [] = new int [jumlah];
        
        for(int i = 0; i < arr.length; i++){
            System.out.print("Masukkan angka : ");
            arr[i] = input.nextInt();
        }
        
        System.out.println();
        System.out.println("Output:");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        genap(arr);
        
    }
    
}
