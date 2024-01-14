package fungsiRet;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class fungsiRet {
    static void Sort(int arr[], int angka){
        System.out.println("\n\nSetelah di urutkan :");
        if(angka < 2){
            System.out.println("1 Angka Tidak Dapat di Urutkan");
        }else{
            Arrays.sort(arr);
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    static void AngkaAcak(int arr[], int angka){
        Random acak = new Random();
        System.out.printf("\nMencetak %d Angka Random:\n", angka);    
        for(int i = 0; i < arr.length; i++){
            arr[i] = acak.nextInt(9);
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Mencetak & Mengurutkan Angka Random");
        System.out.print("Masukkan Jumlah Angka: ");
        int angka = in.nextInt();
        int arr[] = new int [angka];
        AngkaAcak(arr, angka);
        Sort(arr, angka);
    }
}
