package baru;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {

        
        
        Scanner input = new Scanner(System.in);
     String nama,nim, prodi;
     char kelas;
     int umur;
     float bb;
     
     System.out.print("Nama : ");
     nama = input.nextLine();
        
     System.out.print("NIM : ");
     nim = input.nextLine();
        
     System.out.print("Prodi : ");
     prodi = input.next();
     
     System.out.print("Kelas : ");
     kelas = input.next().charAt(0);
     
     System.out.print("Umur : ");
     umur = input.nextInt();
     
     System.out.print("Berat Badan : ");
     bb = input.nextFloat();
        
        
    }
    
}
