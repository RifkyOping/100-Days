package Percabangan_IfElse;

public class Main {
    
    public static void main(String[] args) {
        
        int a = 6;
        
        if(a < 6){
            System.out.println("Berhasil");
            
            /* Percabangan If-Else dapat berisi 2 kondisi atau lebih.
               Dengan menambahkan else-if kita dapat menambahkan kondisi baru
                   pada percabangan if-else.
            */
            // Jika kondisi if tidak terpenuhi, maka kondisi else-if akan di jalankan.
            // Dan jika kondisi Else-If di jalankan, sama seperti sebelumnya kondisi else tidak akan di jalankan.
        }else if(a == 6){
            System.out.println("Coba Lagi");
        }else{
            System.out.println("Gagal");
        }
    }
}
