package D53;
import java.util.Scanner;
public class D53 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ray [] = {
            "PANCASILA",
            "1.Ketuhanan yang maha esa.",
            "2.Kemanusiaan yang adil dan beradap",
            "3.Persatuan indonesia",
            "4.Kerakyatan yang dipimpin oleh hikmat kebijaksanaan dalam permusyawaratan perwakilan",
            "5.Keadilan sosial bagi seluruh rakyat indonesia"
        };
        for(int i = 0; i < ray.length; i++){
            System.out.println(ray[i]);
        }
        int salah = 0;
        System.out.println();
        System.out.print("Tampilkan sila ke : ");
        int cari = input.nextInt();
        
        for(int i = 0; i < ray.length; i++){
            if(i == cari && cari >= 1){
                System.out.println(ray[i]);
                salah++;
            }
        }
        if(salah == 0){
            System.out.println("Error");
        }
    }
}
