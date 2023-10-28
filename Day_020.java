package Loop;

public class Main {
    
    public static void main(String[] args) {
        /*
        Perulangan Do-While : Merupakan perulangan uncounted loop, yakni
                              perulangan yang tidak jelas jumlah pengulangannya.
                              kondisi bisa kita isi dengan perbandingan maupun variabel boolean.
                              Kondisi ini hanya memiliki nilai true dan flase.
                              Pada perulangan Do-While, akan di kerjakan pada bagian do terlebih dahulu
                              baru di cek bagian while. Jika bagian while bernilai true maka
                              perulangam akan di kerjakan.
        */
        int b = 0;
        do{
            System.out.println("B Nilai Ke-"+b);
            b++;
        }while(b <= 100);
    }
}
