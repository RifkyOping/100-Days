package rifkyoping;

import javax.swing.JOptionPane;

public class GUIRound2No3 {
    public static void main(String[] args) {
        double komputer = 55000000;
        double tabungan = 1500000;
        double hasil = komputer / tabungan;
        int total = (int) Math.round(hasil);
        JOptionPane.showMessageDialog(null, total+" Bulan");
    }
}
