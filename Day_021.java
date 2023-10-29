package Loop;

public class Main {
    
    public static void main(String[] args) {
        /*
        Perulangan Nested : Perulangan bersarang, maksudnya perulangan dalam perulangan
                            atau disebut juga nested loop.
                            Perulangan bersarang sering digunakan pada array multi dimensi.
                            Jenis perulangan di dalam perulangn bisa berbeda, misalnya di dalam perulangan
                            while ada perulangan for.
        */
        for(int a = 1; a < 10; a++){
            for(int b = 1; b < a; b++){
                System.out.print("* ");
            }
            System.out.println("* ");
        }
    }
}
