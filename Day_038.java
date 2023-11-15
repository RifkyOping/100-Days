package pemanfaatan_if;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        String lanjut;
        do{
        Scanner input = new Scanner(System.in);
        
        System.out.println("--------------IndoMarried---------------");
        
        System.out.println("\nDaftar menu :\n");
        
        System.out.println("1.Nasi Kuning\n2.Nasi Goreng");
        
        System.out.print("\nPilih Menu Anda :");
        int pilihan = input.nextInt();
        System.out.println(" ");
            
            
        if(pilihan == 1){
            
            String menuisi = ("Nasi Kuning");
            System.out.print(menuisi);
            String menuisi1 = (" 10k/porsi");
            System.out.println(menuisi1);
            
            System.out.print("\nPilih Jumlah Porsi :");
            int porsi = input.nextInt();
            System.out.println(" ");
            System.out.println("=======================================");
            
            
            String menu = "\nMenu yang dipilih \t:"+menuisi;
            System.out.println(menu);
            
            int harga = 10000;
            System.out.println("Dengan harga \t\t:Rp."+harga);
            int porsihasil = porsi * harga;
            System.out.println("Total porsi \t\t:"+porsi);
            System.out.println("Total harga \t\t:Rp."+porsihasil);
            System.out.println("\n--------------TERIMAKASIH---------------");
            
            
        }else if(pilihan == 2){
            
            String menu1 = "Nasi Goreng";
            System.out.print(menu1);
        
            String menuisi1 = (" 15k/porsi");
            System.out.println(menuisi1);
            
            System.out.print("\nPilih Jumlah Porsi :");
            int porsi = input.nextInt();
            System.out.println(" ");
            System.out.println("=======================================");
            
            
            String menu = "\nMenu yang dipilih \t:"+menu1;
            System.out.println(menu);
            
            int harga = 15000;
            System.out.println("Dengan harga \t\t:Rp."+harga);
            int porsihasil = porsi * harga;
            System.out.println("Total porsi \t\t:"+porsi);
            System.out.println("Total harga \t\t:Rp."+porsihasil);
       			System.out.println("\n--------------TERIMAKASIH---------------");
        }else{
            System.out.println("------Masukkan Pilihan Yang Benar-------");
        }
            System.out.print("\nMasih mau pesan (y/n) ? :");
            lanjut = input.next();
            System.out.println();
        } while(lanjut.equalsIgnoreCase("y"));
            System.out.println("\n-----------------(-_-)-----------------");
    }
    
}
