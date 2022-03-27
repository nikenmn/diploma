//Tambahkan library Scanner, deklarasi Scanner, dan buat variabel angka untuk menampung data yang diinput melalui keyboard
import java.util.Scanner;
public class percobaan1{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int angka, faktorial, i;
i = 1;
faktorial = faktorial*i;

System.out.print("==== PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR ====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt;
for(int i=1; i<=angka; i++){
        faktorial*=i;
        System.out.print("Nilai faktorial bilangan tersebut adalah : " +faktorial);
    }
}
    }