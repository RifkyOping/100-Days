package D30_gaji;

public class Main {
    
    public static void main(String[] args) {
        
        int hariKerja = 25;
        int gajiperHari = 1200000;
        int uangMakan = 15000;
        int TotMakan = uangMakan * hariKerja;
        int gajiKotor = gajiperHari * hariKerja;
        int gajiBersih = gajiKotor - TotMakan;
        
        System.out.println("============>Gaji Karyawan<============");
        System.out.println("Jumlah Hari Kerja \t: "+hariKerja+" Hari");
        System.out.println("Gaji Perhari \t\t: Rp."+gajiperHari);
        System.out.println("Uang Makan Perhari \t: Rp."+uangMakan);
        System.out.println("Gaji Kotor \t\t: Rp."+gajiKotor);
        System.out.println("Total Uang Makan \t: Rp."+TotMakan);
        System.out.println("Gaji Bersih \t\t: Rp."+gajiBersih);
    }
}
