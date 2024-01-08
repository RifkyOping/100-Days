package D91;
import java.util.Scanner;
public class D91 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Batas : ");
        int batas = in.nextInt();
        int hasil = 0;
        
        for(int i = 2; i <= batas; i+=2){
            if(i > 2){
                System.out.print("+");
            }
            System.out.print(i);
            hasil += i;
        }
        System.out.println(" = "+hasil);
    }
    
}
