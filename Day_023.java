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
            {"Brody","081315267815"},
            {"Lukas","082425671098"},
            {"Oskar","083729238387"},
            {"Parman","08491827722"},
            {"Kaco'","085326749177"}
        };
        //Pengambilan Data Array
        for(int a = 0; a < prenn.length; a++){
        System.out.println("Nama : "+prenn[a][0]);
        System.out.println("Nomor : "+prenn[a][1]);
            System.out.println("");
        }
    }
}
