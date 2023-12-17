package D70;
import java.util.Scanner;
public class D70 {
    static void output(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void ganjil(int arr[][]){
        int hasil = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i][j] % 2 != 0){
                    hasil++;
                }
            }
        }
        System.out.println("\nJumlah angka ganjil adalah "+hasil);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Baris : ");
        int baris = in.nextInt();
        
        System.out.print("Masukkan Kolom : ");
        int kolom = in.nextInt();
        
        int arr[][] = new int [baris][kolom];
        
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print("Masukka  Data : ");
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println();
        output(arr);
        ganjil(arr);
    }
}
