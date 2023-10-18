package Day_9;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println(">>>>>>>Informasi Identitas Pribadi<<<<<<");
        System.out.println(" ");
        
        String nama, nim, nim1, kelas, alamat;
        double bb, tb, bmi;
        
        nama = "RIFKY";
        System.out.println("Nama : "+nama);
        
        nim = "D0223519";
        
        System.out.println("NIM : "+nim);
        nim1 = nim.substring(nim.length()-2);
        System.out.println("Umur : "+nim1+" tahun");
        
        kelas = "Informatika E 2023";
        System.out.println("Kelas : "+kelas);
        
        bb = 40;
        System.out.println("Berat Badan : "+bb+" Kg");
        
        tb = 1.6;
        System.out.println("Tinggi Badan : "+tb+" m");
        
        bmi = bb / (tb * tb);
        System.out.println("BMI : "+bmi);
        
        alamat = "Kalukku";
        System.out.println("Alamat : "+alamat);
        
    }
    
}
