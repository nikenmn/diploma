import java.util.Scanner;
public class latihan5Niken{
    
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String jenisSampah, a, o, b, warnaTempatSampah;

         String jenisSampah1 = organik;
         String jenisSampah2 = anorganik;
         String jenisSampah3 = b3;

         System.out.print("Masukkan jenis sampah = ");
         jenisSampah = sc.nextLine();

         switch (jenisSampah) {
             case organik :
                 System.out.print("Warna tempat sampah = Hijau");
                 break;

            case anorganik :
                 System.out.print("Warna tempat sampah = Kuning");
                 break;

                 case b3 :
                 System.out.print("Warna tempat sampah = Merah");
                 break;

             default: 
                 break;
         }
    }
}