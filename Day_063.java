package D63;

import java.util.Scanner;

public class D63 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner	(System.in);
        System.out.print("Masukkan Baris : ");
        int baris = input.nextInt();
        System.out.print("Masukkan Kolom : ");
        int kolom = input.nextInt();
        int arr [][] = new int [baris][kolom];
        
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print("Masukkan Data : ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("\nOutput:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
