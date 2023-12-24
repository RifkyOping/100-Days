package rifkyoping;

import javax.swing.JOptionPane;

public class GUIRound1No2 {
    public static void main(String[] args) {
        String luas1 = JOptionPane.showInputDialog("Masukkan Luas Tanah : ");
        int luas = Integer.parseInt(luas1);
        int harga = 300000;
        int jual = luas * harga;
        if (jual >= 100000000) {
            int pajak = 5 * jual / 100;
            int total = jual - pajak;
            JOptionPane.showMessageDialog(null, "Jumlah Pajak "+pajak);
            JOptionPane.showMessageDialog(null, "Uang Bersih "+total);
        }else if(jual >= 50000000) {
            int pajak = 3 * jual / 100;
            int total = jual - pajak;
            JOptionPane.showMessageDialog(null, "Jumlah Pajak "+pajak);
            JOptionPane.showMessageDialog(null, "Uang Bersih "+total);     
        }else{
            JOptionPane.showMessageDialog(null, "Tidak dikenakan pajak");
            JOptionPane.showMessageDialog(null, "Uang tetap "+jual);
        }
    }
}
