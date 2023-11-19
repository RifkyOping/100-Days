package ray;
import java.util.Scanner;
public class ray {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Panjang Index : ");
        int index = input.nextInt();
        int a [] = new int[index];
        System.out.println();
        System.out.println("Input :");
        for(int i = 0; i < index; i++){
            System.out.print("Masukkan Data ke-"+(i+1)+" : ");
            a[i] = input.nextInt();
        }
        System.out.println();
        System.out.println("Output :");
        for(int i = 0; i < index; i++){
            System.out.print(a[i]+" ");
        }
        
    }
    
}
