package rifkyoping;

import javax.swing.JOptionPane;

public class GUIRound3No1 {
    public static void main(String[] args) {
        String gaji1 = JOptionPane.showInputDialog("Masukkan Gaji : ");
        int gaji = Integer.parseInt(gaji1);
        String pns = JOptionPane.showInputDialog("Masukkan Gaji : ");
        
        if (gaji >= 5000000) {
            if (pns.equalsIgnoreCase("tidak")) {
                int pajak = 10 * gaji / 100;
                int hasil = gaji - pajak;
                JOptionPane.showMessageDialog(null, "Panjak "+pajak);
                JOptionPane.showMessageDialog(null, "Uang Bersih "+hasil);
            }else if(pns.equalsIgnoreCase("ya")){
                int pajak = (10+5) * gaji / 100;
                int hasil = gaji - pajak;
                JOptionPane.showMessageDialog(null, "Panjak "+pajak);
                JOptionPane.showMessageDialog(null, "Uang Bersih "+hasil);
            }
        }else if(gaji >= 3000000) {
            if (pns.equalsIgnoreCase("tidak")) {
                int pajak = 5 * gaji / 100;
                int hasil = gaji - pajak;
                JOptionPane.showMessageDialog(null, "Panjak "+pajak);
                JOptionPane.showMessageDialog(null, "Uang Bersih "+hasil);
            }else if(pns.equalsIgnoreCase("ya")){
                int pajak = (5+5) * gaji / 100;
                int hasil = gaji - pajak;
                JOptionPane.showMessageDialog(null, "Panjak "+pajak);
                JOptionPane.showMessageDialog(null, "Uang Bersih "+hasil);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Tidak dikenakan pajak");
            JOptionPane.showMessageDialog(null, "Uang Bersih "+gaji);
        }
    }
}
