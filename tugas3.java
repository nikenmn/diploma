import java.util.Scanner;
public class tugas3{

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int umur, pendapatan, jumlahTanggungan, biayaHidup;
String statusBekerja, statusSekolah;

System.out.println("Menentukan Kategori Penduduk ");
System.out.println("Masukkan umur: ");
umur = sc.nextInt();

if(umur >=18){
    System.out.println("Masukkan status bekerja (sudah / belum): ");
    statusBekerja = sc.nextLine();
    if(statusBekerja.equalsIgnoreCase("sudah")){
        System.out.println("Masukkan Pendapatan Perbulan: ");
        pendapatan = sc.nextInt();
        System.out.println("Masukkan Jumlah Tanggungan: ");
        jumlahTanggungan = sc.nextInt();
        biayaHidup = pendapatan/jumlahTanggungan;
    if(biayaHidup<300000){
        System.out.println("Penduduk Miskin ");
    } else {
        System.out.println("Bukan Penduduk Miskin"); 
    }
}
}
}else{
    System.out.println("Masukkan status sekolah : (Ya / Tidak)");
    statusSekolah = sc.nextLine();
    if(statusSekolah.equalsIgnoreCase ("Ya")){
        System.out.println("Bukan Penduduk Miskin ");
    } else {
        System.out.println("Penduduk Miskin ");
}
