package D51;
import java.util.Scanner;
public class D51 {
    
    public static void main(String[] args) {
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Gaji : ");
            int gaji = input.nextInt();
            if(gaji >= 5000000){
                double pajak = 5 * gaji / 100;
                double hasil = gaji - pajak;
                System.out.println("Pajak yang dikenakan sebesar 5% yaitu Rp."+pajak);
                System.out.println("Total gaji setelah kena pajak adalah Rp."+hasil);
            }else if(gaji >= 3000000){
                double pajak = 3 * gaji / 100;
                double hasil = gaji - pajak;
                System.out.println("Pajak yang dikenakan sebesar 3% yaitu Rp."+pajak);
                System.out.println("Total gaji setelah kena pajak adalah Rp."+hasil);
            }else{
                double pajak = 1 * gaji / 100;
                double hasil = gaji - pajak;
                System.out.println("Pajak yang dikenakan sebesar 1% yaitu Rp."+pajak);
                System.out.println("Total gaji setelah kena pajak adalah Rp."+hasil);
            }
            System.out.println();
        }
    }
}
