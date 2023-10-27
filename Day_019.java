package Loop;

public class Main {
    
    public static void main(String[] args) {
        /*
        Perulangan While : Merupakan perulangan uncounted loop, yakni
                           perulangan yang tidak jelas jumlah pengulangannya.
                           kondisi bisa kita isi dengan perbandingan maupun variabel boolean.
                           Kondisi ini hanya memiliki nilai true dan flase.
                           Perulangan while akan berhenti sampai kondisi bernilai false.
                           
        */
        int a = 1;
        while(a <= 50){
            System.out.println("A Perulangan Ke-"+a);
            a++;
        }
    }
}
