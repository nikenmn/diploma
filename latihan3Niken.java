import java.util.Scanner;
public class latihan3Niken {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int P, x, y, Q;
        Double Q1;
        System.out.print("Masukkan Nilai X: ");
        x = sc.nextInt();
        System.out.print("Masukkan Nilai Y: ");
        y = sc.nextInt();
        P = x + y;
        Q = x * y;
        Q1 = (double) x / y;

        if (P >= 0){
            System.out.print("Hasil = " +Q);
        }
        else
        System.out.print("Hasil = " +Q1);
    }
}