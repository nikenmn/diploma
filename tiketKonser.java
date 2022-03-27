import java.util.Scanner;

public class tiketKonser{
    public static void main(String[] args){

    int seat, reg, vip, vvip;
    String kartu;
    double diskon, totalHarga; 

    hargaTiket1 = 35000;
    hargaTiket2 = 42000;
    hargaTiket3 = 45000;

    Scanner scan = new Scanner(System.in);
    System.out.println("===================================");
    System.out.println(" TREASURE's WORLD TOUR : INDONESIA ");
    System.out.println("        TICKET RESERVATION         ");
    System.out.println("===================================");
    System.out.println("\n");
    System.out.println("----------     MENU      ----------");

    System.out.println("Pilih Jenis Seat yang diinginkan ");
    System.out.println("1 = Reguler , 2 = VIP , 3 = VVIP ");
    seat = scan.nextInt();
    System.out.println("Jenis seat yang dipilih " +seat);
    System.out.println(" ");
    
    System.out.println("Apakah anda memiliki kartu anggota? ya / tidak ");
    kartu = scan.next();
    
    switch (seat) {
        case 1:
        System.out.println("Harga tiket anda sebesar Rp " +hargaTiket1);
            break;
        case 2:
            System.out.println(" Harga tiket anda sebesar Rp " +hargaTiket2);
            break;
        case 3:
            System.out.println(" Harga tiket anda sebesar Rp " +hargaTiket3);
            break;
        default:
        System.out.println(" Input yang anda masukkan tidak sesuai ");
            break;
             
        }
    System.out.println("\n");
    System.out.println("=========================================");
    System.out.println(" Terima Kasih telah memilih Bioskop Kami ");
    System.out.println("=========================================");
}
}
    