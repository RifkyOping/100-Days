package Ternary_Day13;

public class Main {
    
    public static void main(String[] args) {
        
        int nilai = 10, angka = 20, var_a = 5, var_b = 15;
        String hasil;
        
        /*
        pada operator ternary, jika perbandingannya terpenuhi
        maka akan menjalankan yang sebelah kiri.
        jika tidak terpenuhi maka akan menjalankan yang
        sebelah kanan.
        */
        
        hasil = nilai > angka ? "Benar" : "Salah";
        System.out.println(hasil);
        
        hasil = nilai < angka ? "Benar" : "Salah";
        System.out.println(hasil);
        
        hasil = var_b <= angka ? "Benar" : "Salah";
        System.out.println(hasil);
        
        hasil = var_b >= angka ? "Benar" : "Salah";
        System.out.println(hasil);
        
        hasil = var_a <= angka ? "Benar" : "Salah";
        System.out.println(hasil);
        
        hasil = var_a == var_a ? "Benar" : "Salah";
        System.out.println(hasil);
        
        hasil = nilai != nilai ? "Benar" : "Salah";
        System.out.println(hasil);
    }
    
}
