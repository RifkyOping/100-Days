package D43;
import java.util.Scanner;
public class D43 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salah = 0;
        int [] a = {1, 4, 5, 7, 3, 5, 6, 9, 2};
        System.out.print("Data Yang Disimpan : ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("");
        System.out.println("Input : ");
        System.out.print("Cari Data : ");
        int cari = input.nextInt();
        
        System.out.println();
        System.out.println("Output : ");
        System.out.println("Hasil Pencarian : ");
        for(int i = 0; i < a.length; i++){
            if(a[i] == cari){
                System.out.println("Data Berada Pada Index ke-"+i);
                salah++;
            }
        }
        if(salah == 0){
            System.out.println("Data Tidak Ditemukan !");
        }
    }
}
