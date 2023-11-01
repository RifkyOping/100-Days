package array_list;

//Jika ingin menggunakan Array List, kita harus mengimpornya terlebih dahulu.
import java.util.ArrayList;
public class Main {
    
    public static void main(String[] args) {
        
        //Setelah itu, baru kita bisa membuat sebuah objek ArrayList
        ArrayList data = new ArrayList();
        
        //Data dari ArrayList
        data.add("Rifky");
        data.add("Informatika");
        data.add('E');
        data.add(1);
        data.add("galau");
        
        //menghapus nilai pada index tertentu
        data.remove("galau");
        
        //Menampilkan isi data ArrayList
        System.out.println("Isi Data ArrayList : "+data);
        
        //Menampilkan banyak isi data dari ArrayLis
        System.out.println("Data ArrayList Berjumlah "+data.size());
    }
}
