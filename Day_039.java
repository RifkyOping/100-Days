package D39;
import java.util.Scanner;
public class D39 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        String user = input.nextLine();
        System.out.print("Masukkan Password : ");
        int pass = input.nextInt();
        
        if(user.equals("Rifky") && pass == 29){
            System.out.println("Login Berhasil");
        }else{
            System.out.println("Login Gagal");
        }
    }
}
