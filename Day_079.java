package rifkyoping;

import javax.swing.JOptionPane;

public class GUIRound2No2 {
    public static void main(String[] args) {
        String angka1 = JOptionPane.showInputDialog("Masukkan Angka : ");
        int angka = Integer.parseInt(angka1);
         
        if (angka % 3 == 0 && angka % 5 == 0) {
            JOptionPane.showMessageDialog(null, "Master Class");
        }else if(angka % 5 == 0) {
            JOptionPane.showMessageDialog(null, "Pride Of 5");
        }else if(angka % 3 == 0) {
            JOptionPane.showMessageDialog(null, "Pride Of 3");
        }
    }
}
