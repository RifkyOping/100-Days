package Data_Array;

public class Main {
    
    public static void main(String[] args) {
        /*
        Array multi-dimensi merupakan array yang mempunyai ukuran lebih dari dua.
                            pendeklarasian array sama saja dengan array dimensi satu maupun array dimensi dua.
                            1 Operator dan bersifat unary (hanya memerlukan satu operand saja).
        */
        //Membuat Array
        String [][] prenn = {
            {"Brody","081315267815","Hindu"},
            {"Lukas","082425671098","Budha"},
            {"Oskar","083729238387","Kristen"},
            {"Parman","08491827722","Islam"},
            {"Kaco'","085326749177","Islam"}
        };
        //Pengambilan Data Array
        System.out.println("Nama  : "+prenn[0][0]);
        System.out.println("Nomor : "+prenn[0][1]);
        System.out.println("Agama : "+prenn[0][2]);
        System.out.println("");
        
        System.out.println("Namab : "+prenn[1][0]);
        System.out.println("Nomor : "+prenn[1][1]);
        System.out.println("Agama : "+prenn[1][2]);
        System.out.println("");
        
        System.out.println("Nama  : "+prenn[2][0]);
        System.out.println("Nomor : "+prenn[2][1]);
        System.out.println("Agama : "+prenn[2][2]);
        System.out.println("");
        
        System.out.println("Nama  : "+prenn[3][0]);
        System.out.println("Nomor : "+prenn[3][1]);
        System.out.println("Agama : "+prenn[3][2]);
        System.out.println("");
        
        System.out.println("Nama  : "+prenn[4][0]);
        System.out.println("Nomor : "+prenn[4][1]);
        System.out.println("Agama : "+prenn[4][2]);
    }
}
