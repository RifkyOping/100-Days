package Percabangan_IfElse;

public class Main {
    
    public static void main(String[] args) {
        
        int a = 5;
        
        //Pada operator percabangan if-else jika if terpenuhi, maka else tidak akan di jalankan.
        if(a < 6){
            System.out.println("Berhasil");
        }else{
            System.out.println("Gagal");
        }
        
  									  //Begitu pula sebaliknya, jika if tidak terpenuhi maka else akan di jalankan.
        if(a < 5){
            System.out.println("Berhasil");
        }else{
            System.out.println("Gagal");
        }
    }
}
