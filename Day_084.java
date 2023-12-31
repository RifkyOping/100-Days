package rifkyoping;

import javax.swing.JOptionPane;

public class GUIRound3No4 {
    public static void main(String[] args) {
        String angka1 = JOptionPane.showInputDialog("masukkan Angka : ");
        int awal = Integer.parseInt(angka1);
        String angka2 = JOptionPane.showInputDialog("masukkan Angka : ");
        int akhir = Integer.parseInt(angka2);
        
        int hasil = awal + akhir;
        
        if (hasil % 2 == 0) {
            JOptionPane.showMessageDialog(null, awal+" + "+akhir+" = "+hasil+" + 1 = "+(hasil+1));
        }else{
            JOptionPane.showMessageDialog(null, awal+" + "+akhir+" = "+hasil+" + 1 = "+(hasil+2));
        } 
    }
}
