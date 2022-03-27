package minggu5;
/*maaf ibu, sebenarnya kemarin saya mengerjakan sudah sampai latihan1 pada saat ibu
berkata latihan 1 tidak perlu dikerjakan, mohon maaf saya masukkan dalam pengumpulan nggih bu*/

public class Latihan1 {
    public static int search(int arr[], int x){
        int n = arr.length;
        for (int i=0; i<n; i++){
            if (arr[i] == x || arr[i]>arr[i+1]){
                return i;
            }
        } return -1;
    }

    public static void main(String[] args){
        int arr[] = {17, 20, 26, 33, 37, 41, 53, 63, 73, 83};
        int x = 41;

        int hasil = search(arr, x);
        if (hasil==-1){
            System.out.println("Elemen yang dicari tidak ada di dalam array");
        } else{
            System.out.println("Elemen berada pada index "+hasil);
        }
    }
}
