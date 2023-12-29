package rifkyoping;

import javax.swing.JOptionPane;

public class GUIRound3No2 {
    public static void main(String[] args) {
        String masuk = JOptionPane.showInputDialog("Masukkan Batas Angka : ");
        int batas = Integer.parseInt(masuk);
        int jumlah = 0;
        for (int i = 1; i <= batas; i++) {
            if (i % 3 == 0) {
                jumlah++;
            }
        }
        JOptionPane.showMessageDialog(null, "Jumlah Angka Genap Yang Bisa Dibagi 3 Adalah "+jumlah);
    }
}
