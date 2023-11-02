package prosedur_Test;

public class Main {
    
    //Prosedur pada Java
    /*
    Prosedur adalah sebutan untuk fungsi yang tidak mengembalikan nilai.
    Fungsi ini biasanya ditandai dengan kata kunci void.
    */
    public static void Data_Diri(){
        //Isi Dari Prosedur
        String nama = "RIFKY";
        String alamat = "parang-parang";
        int umur = 19;
        char kelas = 'E';
        double BeratBadan = 40.0;
        float TinggiBadan = 160.0f;
        
        System.out.println(
        
        "Nama saya "+nama+" tinggal di "+alamat+". Umur "+umur+" tahun, "+
        " Kelas Informatika "+kelas+", dengan berat badan "+BeratBadan+
        " kg dan tinggi badan "+TinggiBadan+" cm"+"\nTERIMAKASIH");
    }
    
    public static void main(String[] args) {
        //Cara pemanggilan Prosedur
        Data_Diri();
    }
    
}
