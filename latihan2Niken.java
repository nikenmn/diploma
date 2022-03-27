import java.util.Scanner;
public class tugas2Niken{

     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jumlahFotocopy, totalPembayaran, pembayaran1, pembayaran2;

        System.out.print("Masukan jumlah fotocopy = ");
        jumlahFotocopy = sc.nextInt();
        pembayaran1 = jumlahFotocopy*100;
        pembayaran2 = jumlahFotocopy*150;

        if (jumlahFotocopy > 100) {
            System.out.println("Total pembayaran = " +pembayaran1);
        }
        else {
            System.out.println("Total pembayaran = " +pembayaran2);
        }
     }
}
