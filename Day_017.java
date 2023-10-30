package switchJava;

public class Main {
    
    public static void main(String[] args) {
        
        /*
        Switch-Case merupakan bentuk lain dari percabangan if-else.
        Namun yang membedakan adalah formatnya.
        Berbeda dari if-else yang berisi perbandingan, percabangan switch-case
        hanya berisi hasil.
        */
        int angka = 1;
        
        switch(angka){
            case 1:
            System.out.println("Good");
            break;
            
            case 2:
            System.out.println("Nice");
            break;
            
            default:
            System.out.println("Lawak");
        }
            
       int angka2 = 2;
        
        switch(angka2){
            case 1:
            System.out.println("Good");
            break;
            
            case 2:
            System.out.println("Nice");
            break;
            
            default:
            System.out.println("Lawak");
        }
        
        int angka3 = 3;
        
        switch(angka3){
            case 1:
            System.out.println("Good");
            break;
            
            case 2:
            System.out.println("Nice");
            break;
            
            default:
            System.out.println("Lawak");
        }    
           
    }
    
}
