package D74;
import java.util.Scanner;
public class D74 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Batas : ");
        int batas = in.nextInt();
        int jumlah = 0;
        
        for(int i = 1; i <= batas; i++){
            System.out.print(i);
            if(i != batas){
                System.out.print("+");
            }
            jumlah += i;
        }
        System.out.print(" = "+jumlah);
    }
    
}
