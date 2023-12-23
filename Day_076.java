package rifkyoping;

import javax.swing.JOptionPane;

public class GUIgajiPokok {
    public static void main(String[] args) {
        String gaji1 = JOptionPane.showInputDialog("Masukkan Gaji Pokok : ");
        int gaji = Integer.parseInt(gaji1);
        String lama1 = JOptionPane.showInputDialog("Masukkan Lama Lembur : ");
        int lama = Integer.parseInt(lama1);
        int lembur = 55000;
        int hasil = lama * lembur;
        int total = hasil + gaji;
        
        JOptionPane.showMessageDialog(null, "Gaji Bersih Adalah "+total);
        
    }
}
