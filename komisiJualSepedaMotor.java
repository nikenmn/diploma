import java.util.Scanner;

public class komisiJualSepedaMotor{
    public static void main(String[] args){
    
        int hargaJual, totalJasa;
        double uangKomisi, totalKomisi;

    System.out.println("===== Komisi Bulanan Karyawan Marketing Dealer Motor Surya =====");
    System.out.print("Masukkan hasil penjualan motor : ");
    hargaJual = input.nextInt();
    
    if (hargaJual >= 30000000){
        uangKomisi = 0.05 * hargaJual;
        totalJasa = hargaJual + 1000000;
        totalKomisi = totalJasa + uangKomisi;
        System.out.println("Maka total komisi yang anda dapatkan ialah Rp " +totalKomisi);
    } else if (hargaJual >= 50000000) {
        totalJasa = hargaJual + 2000000;
        uangKomisi = 0.07 * hargaJual ;
        totalKomisi = totalJasa + uangKomisi;
        System.out.println("Maka total komisi yang anda dapatkan ialah Rp " +totalKomisi);
    } else if ( hargaJual >= 100000000 ) {
        totalJasa = hargaJual + 3000000;
        uangKomisi = 0.10 * hargaJual;
        totalKomisi = totalJasa + uangKomisi;
        System.out.println("Maka total komisi yang anda dapatkan ialah Rp " +totalKomisi);
    }
    System.out.println("Maaf, anda tidak mendapatkan uang komisi penjualan");
}
}