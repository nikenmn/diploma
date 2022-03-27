import java.util.Scanner;

public class hariNiken{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int jumlahHari, nim;

    System.out.println("===== Nama Hari =====");
    System.out.print("Masukkan 2 digit terakhir NIM anda: ");
    nim = sc.nextInt();
    
    if(nim<10){
        jumlahHari = nim + 10;
    } else {
        jumlahHari = nim;
    }
    System.out.println("Tampilan nama hari sebanyak " + jumlahHari + " kali : ");
    for (int a=1; a<= jumlahHari; a++){
        if(a%7==1){
            System.out.print("Senin ");
        }else if(a%7==2){
            System.out.print("Selasa ");
        }else if(a%7==3){
            System.out.print("Rabu ");
        }else if(a%7==4){
            System.out.print("Kamis ");
        }else if(a%7==5){
            System.out.print("Jumat ");
        }else if(a%7==6){
            System.out.print("Sabtu ");
        }else if(a%7==0){
            System.out.print("Minggu ");
        }
    }
}
}