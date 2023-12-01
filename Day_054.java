package D54;
import java.util.Scanner;
public class D54 {
    static void lulus(int ray[]){
        for(int i = 0; i < ray.length; i++){
            if(ray[i] >= 70){
                System.out.println(ray[i]);
            }
        }
    }
    static void gagal(int ray[]){
        for(int i = 0; i < ray.length; i++){
            if(ray[i] < 70){
                System.out.println(ray[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ray [] = {70, 55, 90, 85, 95, 76, 66, 50, 69};
        
        System.out.print("Nilai Siswa : ");
        for(int i = 0; i < ray.length; i++){
            System.out.print(ray[i]+" ");
        }
        System.out.println("\n");
        System.out.println("Output:");
        System.out.println("Nilai yang lulus : ");
        lulus(ray);
        System.out.println();
        System.out.println("Nilai yang tidak lulus : ");
        gagal(ray);
        
    }
}
