package D61;
import java.util.Scanner;
public class D61 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        String kalimat = input.nextLine();
        System.out.println();
        String arr[] = kalimat.split(" ");
        System.out.println("Output:\nKata yang terkandung adalah : ");
        for(int i = 0; i < arr.length; i++){
            System.out.println((i+1)+"."+arr[i]);
        }
    }
}
