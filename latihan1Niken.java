import java.util.Scanner;
public class latihan1Niken{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float totalPembelian;

        System.out.print("Masukkan total pembelian = ");
        totalPembelian = sc.nextFloat();

        if (totalPembelian > 500000f) {
            System.out.println("Pelanggan mendapatkan hadiah setrika");
        }
        else {
            System.out.println("Pelanggan mendapatkan hadiah payung");
        }
     }
}
   