package D50;
import java.util.Scanner;
public class D50 {
    
    public static void main(String[] args) {
        int stop = 0;
        do{
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        
        if(angka % 2 == 0){
            System.out.println("Program Berhenti");
            stop = 0;
        }else{
            stop = 1;
        }
        }while(stop == 1);
    }
    
}
