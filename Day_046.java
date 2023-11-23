package D46;
import java.util.Scanner;
public class D46 {
    
    public static void main(String[] args) {
        int lanjut = 0;
        do{
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        String user = input.nextLine();
        System.out.print("Masukkan Password : ");
        String pass = input.nextLine();
        System.out.println();    
        
        if(user.equals("Rifky") && pass.equals("29")){
            System.out.println("Login Berhasil");
            System.out.println();
            lanjut = 0;
        }else{
            System.out.println("Login Gagal");
            System.out.println();
            lanjut = 1;
        }
        }while(lanjut == 1);
    }
}
