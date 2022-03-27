package minggu2;

public class HargaMain {
    public static void main(String[] args){
        Harga hg1 = new Harga("kasur", 900000, 3);
        int hartot = hg1.hitungHargaTotal();
        System.out.println("Harga total : "+hartot);
        int hardiskon = hg1.hitungDiskon();
        System.out.println("Harga diskon : "+hardiskon);
        int harbar = hg1.hitungHargaBayar();
        System.out.println("Jumlah yang harus dibayarkan : "+harbar);

    }
}
