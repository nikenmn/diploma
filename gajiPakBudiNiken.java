import java.util.Scanner;
public class gajiPakBudiNiken {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int gajiPokok;
        int komisi;    
        int penjualan;
        int jumlah;
        
        System.out.println("Masukkan besar penjualan yang didapat: ");
        penjualan = sc.nextInt();
        komisi = 15*penjualan/100;
        System.out.println("Masukkan komisi yang didapatkan: " + komisi);
        System.out.println("Masukkan gaji pokok ");
        gajiPokok = sc.nextInt();
        jumlah = gajiPokok+komisi;
        System.out.println("Jumlah gaji yang diterima Pak Budi: " + jumlah);
    }
} 