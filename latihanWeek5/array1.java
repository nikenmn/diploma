package latihanWeek5;

public class array1 {

    public static int search(int arr[], int x){
        int n = arr.length;
        for (int i=0; i<n; i++){
            if (arr[i] == x ){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args){
        int arr[] = {46, 7, 3, 17, 30, 25, 20};
        int x = 21;

        int hasil = search(arr, x);
        if (hasil==-1){
            System.out.println("Elemen yang dicari tidak ada di dalam array");
        } else{
            System.out.println("Elemen berada pada index "+hasil);
        }
    }
}


