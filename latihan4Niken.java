import java.util.Scanner;
public class latihan4Niken{
    
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String jenisKendaraan, mobil, motor;
         int pajakMobil, pajakMotor, pajakSebelumDenda, dendaPajak, totalPembayaran; 
         int jmlHariKeterlambatan ;

         pajakSebelumDenda = pajakMobil;
         pajakMobil = 2000000;
         pajakMotor = 600000;
         dendaPajak = jmlHariKeterlambatan * 10000;
         totalPembayaran = pajakSebelumDenda + dendaPajak;

         System.out.print("Masukkan jenis kendaraan = ");
         jenisKendaraan = sc.nextLine();

         if (jenisKendaraan == mobil){
            System.out.println("Pajak sebelum denda = " +pajakMobil);
         }
         else {
            System.out.println("Pajak sebelum denda = " +pajakMotor);
         }

         System.out.print("Masukkan hari keterlambatan = ");
         jmlHariKeterlambatan = sc.nextInt();

         System.out.println("Total pembayaran pajak = " +totalPembayaran );

    }
}