package D97;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class D97 {
    static void MinMax(int arr[]){
        int kecil = arr[0];
        int besar = besar = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < kecil){
                kecil = arr[i];
                
            }else if(arr[i] > besar){
                besar = arr[i];
            }
        }
        System.out.printf("\n\nNilai Terkecil Dari Angka Random Adalah %d", kecil);
        System.out.printf("\nNilai Terbesar Dari Angka Random Adalah %d", besar);
    }
    static void AngkaAcak(int arr[], int angka){
        Random random = new Random();
        System.out.printf("\nMencetak %d Angka Random:\n", angka);    
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(10);
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Mencetak & Mengurutkan Angka Random");
        System.out.print("Masukkan Jumlah Angka: ");
        int angka = in.nextInt();
        int arr[] = new int [angka];
        if(angka == 0){
            System.out.println("Error");
        }else if(angka == 1){
            int sos = random.nextInt(10);
            System.out.printf("\nMencetak 1 Angka Random:\n%d \n\nNilai Terkecil & Terbesar Dari Angka Random Adalah Sama", sos);
        }else{
            AngkaAcak(arr, angka);
            MinMax(arr);
        }
    }
}
