import java.util.Scanner;
public class simbolNiken{
    public static void main(String[] args){
Scanner input = new Scanner(System.in);
int digitTerakhir, nilaiProses;

System.out.println("=====PROGRAM MENAMPILKAN SIMBOL =====");
System.out.print("Masukkan digit terakhir NIM anda: ");
digitTerakhir = input.nextInt();

if (digitTerakhir >= 5) {
    nilaiProses = 2 * digitTerakhir;
} else {
    nilaiProses = 2 * (digitTerakhir += 5);
}
System.out.println("Tampilan symbol * dan # sebanyak " +nilaiProses + " simbol");

for (int a=1; a <= nilaiProses; a++ ){
        System.out.print("*");
        System.out.print("#");
    }  
} 
}