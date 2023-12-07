package D60;
import java.util.Scanner;
public class D60 {
    static void bmi(double bb, double tb){
        tb /= 100;
        double hasil = (bb / (tb * tb));
        System.out.printf("BMI anda adalah %.1f\n", hasil);
    }
    static void penentu(){
        double hasil = 0;
        if(hasil < 18.5){
            System.out.println("Berat Badan Kurang");
        }else if(hasil >= 18.5){
            System.out.println("Berat Badan Normal");
        }else if(hasil >= 25){
            System.out.println("Berat badan Berlebih");
        }else if(hasil >= 30){
            System.out.println("Obesitas");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Body Mass Index (BMI)");
        System.out.print("Masukkan Tinggi Badan (cm): ");
        double tb = input.nextInt();
        System.out.print("Masukkan Berat Badan (kg): ");
        double bb = input.nextInt();
        System.out.println();
        bmi(bb, tb);
        penentu();
    }
    
  }
