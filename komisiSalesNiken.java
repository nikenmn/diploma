import java.util.Scanner;

public class komisiSalesNiken{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int hargaJual, totalJasa;
        double uangKomisi, totalKomisi;

    System.out.println("===== Komisi Bulanan Karyawan Marketing Dealer Motor Surya =====");
    System.out.print("Masukkan hasil penjualan motor : ");
    hargaJual = sc.nextInt();
    
    if (hargaJual >= 30000000){
        uangKomisi = 0.05 * hargaJual;
        totalJasa = 1000000;
        totalKomisi = totalJasa + uangKomisi;
        System.out.println("Maka total komisi yang anda dapatkan ialah Rp " +totalKomisi);
    } else if (hargaJual >= 50000000) {
        totalJasa = 2000000;
        uangKomisi = 0.07 * hargaJual ;
        totalKomisi = totalJasa + uangKomisi;
        System.out.println("Maka total komisi yang anda dapatkan ialah Rp " +totalKomisi);
    } else if ( hargaJual >= 100000000 ) {
        totalJasa = 3000000;
        uangKomisi = 0.10 * hargaJual;
        totalKomisi = totalJasa + uangKomisi;
        System.out.println("Maka total komisi yang anda dapatkan ialah Rp " +totalKomisi);
    } else {
        System.out.println("Maaf, anda tidak mendapatkan uang komisi penjualan");
    }
}
}