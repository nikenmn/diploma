import java.util.Scanner;
import java.util.Random;

public class yuk{
    public static void main(String[] args){
        
Random random = new Random();
Scanner input = new Scanner (System.in);
char menu;
int batas = 1;

do{
    int number = random.nextInt(10)+1;
    boolean success = false;
    
    batas = 1;
    
    do{
    System.out.println("Permainan Tebak Angka");
    System.out.println("Kesempatan hanya 10 kali");
    
     do {
        System.out.println("Tebak Angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine();
        
        if(answer == number){
            System.out.println("Yay... tebakan Anda benar... Selamat!!!");
            success = true; 
        }else if(answer > number) {
        System.out.println("Tebakan anda lebih besar dari jawaban");
        } else if(answer < number) {
        System.out.println("Tebakan anda lebih kecil dari jawaban");
        }  
        } while (!success);
    System.out.println("Apakah Anda ingin mengulang permainan iya = (Y/y), tidak (t)? ");
    menu = input.nextLine().charAt(0);
    
    } while (menu == 'y' || menu == 'Y');
        System.out.print("Permainan tebak angka selesai.");
    } while(batas++ <= 10);
        System.out.print("Maaf, Anda gagal menebak angka sebanyak 10x");
         
} 
}
