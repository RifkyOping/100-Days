package Operator_Logika;

public class Main {
    
    public static void main(String[] args) {
        
        boolean a = true, b = false, c;
        
        /*
        AND (dan):Jika salah satu variabel bernilai false,
                  maka hasilnya akan false.
        */
        c = a && b;
        System.out.println(c);
        
        /*
        OR (atau):Jika salah satu variabel bernilai true,
                  maka hasilnya akan true.
        */
        c = a || b;
        System.out.println(c);
        
        /*
        NOT / Negasi (tidak):Jika variabel bernilai true,
                             maka hasilnya akan false,
                             begitu pula sebaliknya.
        */
        c = !a;
        System.out.println(c);
    }
    
}
