public class belajar_daspro {
    public static void main(String[] args) {
        int[] jumlah = new int[4];
        int[] total_pembeli = new int[4];
        String[] nama_pembeli = {"Kiki", "Maya", "Dio", "Kevin"};
        int[] banyak_barang = {3, 10, 6, 11};
        int[] satu_kilo = {5000};
        double[] total_barang = {0};
        double diskon = 0.05;

        for (int i = 0; i < jumlah.length; i++) {
            System.out.print(i + 1);
            System.out.println(nama_pembeli[i] + ", " + satu_kilo[jumlah[i]] +
                    " x\t" + banyak_barang[i] + "\tkg " + "\t= " + (satu_kilo[jumlah[i]] * banyak_barang[i]));
            total_pembeli[i] = satu_kilo[jumlah[i]] * banyak_barang[i];
            total_barang[0] += total_pembeli[i];
        }
        if ( banyak_barang[0] >= 10) {
            diskon = banyak_barang[0] * 0.05;
        } else {
            diskon = 0;
        }

        System.out.println("Total barang: " + total_barang[0]);
    }
}