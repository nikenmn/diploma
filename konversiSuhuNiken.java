import java.util.Scanner;
public class konversiSuhuNiken {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float celcius;
        float reamur;
        float fahrenheit;
        float kelvin;

        System.out.println("Masukkan suhu celcius ");
        celcius = sc.nextInt();
        reamur = 4*celcius/5;
        System.out.println("Suhu dalam Reamur " +reamur);
        fahrenheit = (9*celcius/5) + 32;
        System.out.println("Suhu dalam Fahrenheit "+fahrenheit);
        kelvin = celcius + 273;
        System.out.println("Suhu dalam Kelvin "+kelvin);
    }
}