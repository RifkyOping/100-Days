package rifkyoping;

import javax.swing.JOptionPane;

public class GUIRound2No1 {
    public static void main(String[] args) {
        while(true){
            String angka1 = JOptionPane.showInputDialog("Masukkan Angka : ");
            int angka = Integer.parseInt(angka1);
            if (angka % 2 == 0) {
                JOptionPane.showMessageDialog(null, "Angka Genap");
            }else{
                JOptionPane.showMessageDialog(null, "You and I, end");
                break;
            }
        }        
    }
}
