package Fungsi_Test;

public class Main {
    
    //FUNGSI PADA JAVA
    /*
    Fungsi adalah sebutan untuk fungsi yang mengembalikan nilai.
                  Fungsi harus dibuat atau ditulis di dalam class.
    */
    public static String Data_teman(){
        
        //Isi dari Fungsi
        String nama = "MulMul";
        String asal = "Polman";
        String kuliah = "UNSULBAR";
        String prodi = "INFORMATIKA";
        int semester = 1;
        
        /*
        selanjutnya fungsi harus mengembalikan nilai agar dapat diolah pada proses berikutnya.
        Pengembalian nilai pada fungsi menggunakan kata kunci return.
        */
        return
        "DATA DIRI TEMAN\nTeman saya bernama "+nama+" dia berasal dari "+asal+
        ". Sekarang dia berkuliah di "+" program studi "+prodi
        +" semester "+semester;
    }
    public static void main(String[] args) {
        
        //cara memanggil Fungsi
        System.out.println(Data_teman());
    }
    
}
