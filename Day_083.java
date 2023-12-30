package rifkyoping;

import javax.swing.JOptionPane;

public class GUIRound3No3 {
    public static void main(String[] args) {
        String m = JOptionPane.showInputDialog("Masukkan Modal Investasi : ");
        int modal = Integer.parseInt(m);
        String l = JOptionPane.showInputDialog("Masukkan Lama Investasi : ");
        int lama = Integer.parseInt(l);
        int unt = 5 * modal / 100;
        int total = 0;
        for (int i = 1; i <= lama; i++) {
            total += unt;
            JOptionPane.showMessageDialog(null, "Keuntungan Tahun ke-"+i+" Adalah "+total);
        }
        int hasil = modal + total;
        JOptionPane.showMessageDialog(null, "Hasil Investasi Selama "+lama+" Tahun Adalah "+hasil);
    }
}
