package minggu5;
import java.util.Scanner;

public class PencarianMain {
    public static void main(String [] args){
        double[] arr = new double[7];
        Scanner sc = new Scanner(System.in);

        System.out.println("Pengisian data Array");
        System.out.println("nb: pengisian data terurut dari nilai terkecil hingga terbesar");
        System.out.println("");
            for (int i=0; i< arr.length; i++){
                System.out.print("Data ke-"+i+": ");
                arr[i] = sc.nextDouble();
            }

        OrderedSearch os = new OrderedSearch(arr);
        System.out.println("\nIsi elemen Array: ");
        os.tampilkan();
        System.out.print("\nMasukkan data yang dicari: ");
        double key = sc.nextDouble();
        int index = os.cari(key);
        if(index!=-1){
            System.out.println("Data "+key+" pada index "+index);
        } else {
            System.out.println("Data "+key+" tidak ditemukan");
        }
    }
}
