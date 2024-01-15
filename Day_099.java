package login;
import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String user = null, pw = null, kpw = null, spasi = "";
        do{
            System.out.println("LOG-IN USER");
            System.out.println("\nTahap Pembuatan Akun");
            System.out.print("Masukkan Username : ");
            user = in.nextLine();
            System.out.print("Masukkan Password : ");
            pw = in.nextLine();
            System.out.print("Konfirmasi Password : ");
            kpw = in.nextLine();
            spasi = "";
            for(int i = 0; i < pw.length(); i++){
                if(pw.charAt(i) == ' '){
                    spasi = "salah";
                }
                
            }
            if(!pw.equals(kpw) || spasi.equals("salah")){
                System.out.println("\nMohon Masukkan Konfirmasi Password Dengan Benar & Password Tidak Boleh Berspasi\n");
            }
        }while(!pw.equals(kpw) || spasi.equalsIgnoreCase("salah"));
        System.out.println("\nBerhasil Membuat Akun");
        
        System.out.println("\nTahap Log-In");
        String name = null, password = null;
        do{
            System.out.print("Masukkan Username : ");
            name = in.nextLine();
            System.out.print("Masukkan Password : ");
            password = in.nextLine();
            if(name.equals(user) && pw.equals(password)){
                System.out.print("\nLog-In Berhasil");
                break;
            }
            System.out.println("\nLog-In Gagal !!!\nPastikan Username & Password Yang Anda Masukkan Benar\n");
        }while(!name.equals(password));
    }
}
