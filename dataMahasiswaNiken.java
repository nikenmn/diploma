import java.util.Scanner;

public class dataMahasiswaNiken{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        int nim, tahunLahir, usia, tahunIni;
        System.out.println("Masukkan nama anda : ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM anda : ");
        nim = sc.nextInt();
        System.out.println("Masukkan tahun lahir anda : ");
        tahunLahir = sc.nextInt();
        tahunIni = 2021;
        usia = tahunIni - tahunLahir;
        System.out.println("-------------------------------");
        System.out.println("----DATA DIRI-----");

        System.out.println("Nama anda adalah\t: " +nama);
        System.out.println("NIM anda adalah\t: " +nim);
        System.out.println("Usia anda adalah\t: " +usia);

    }
}