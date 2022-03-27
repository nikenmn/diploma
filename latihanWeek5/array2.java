package latihanWeek5;

public class array2 {
    public static int search(int arr[], int x){
        int n = arr.length;
        for (int i=0; i<n; i++){
            if (arr[i] == x || arr[i]>arr[i+1]){
                return i;
            }
        } return -1;
    }


    public static void main(String[] args){
        int arr[] = {3, 7, 17, 20, 25, 30, 46};
        int x = 21;

        int hasil = search(arr, x);
        if (hasil==-1){
            System.out.println("Elemen yang dicari tidak ada di dalam array");
        } else{
            System.out.println("Elemen berada pada index "+hasil);
        }
    }
}
