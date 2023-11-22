package D45;

public class D45 {
    
    public static void main(String[] args) {
        int n = 8;
        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                System.out.print("* ");
                if((i + j) == 8){
                    break;
                }
            }
        System.out.println();    
        }
    }
}
