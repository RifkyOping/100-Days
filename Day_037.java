package D37;
import java.util.Scanner;
public class D37 {
    
    public static void main(String[] args) {
        while(true){
        Scanner input = new Scanner(System.in);
        System.out.println("KALKULATOR SEDERHANA");
        System.out.print("Masukkan Angka : ");
        int a = input.nextInt();
        System.out.print("Masukkan Simbol : ");
        char c = input.next().charAt(0);
        System.out.print("Masukkan Angka : ");
        int b = input.nextInt();
        
        switch(c){
            case '+':
            int hasil = a + b;
            System.out.println("Hasil dari "+a+" + "+b+" = "+hasil);
            break;
            
            case '-':
            int hasil2 = a - b;
            System.out.println("Hasil dari "+a+" - "+b+" = "+hasil2);
            break;
            
            case '/':
            int hasil3 = a / b;
            System.out.println("Hasil dari "+a+" / "+b+" = "+hasil3);
            break;
            
            case 'x':
            int hasil4 = a * b;
            System.out.println("Hasil dari "+a+" x "+b+" = "+hasil4);
            break;
            
            case '%':
            int hasil5 = a % b;
            System.out.println("Hasil dari "+a+" % "+b+" = "+hasil5);
            break;
            
            }
            System.out.println();
        }
    }
}
