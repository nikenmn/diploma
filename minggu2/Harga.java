package minggu2;

public class Harga {
    String nama;
    int hargaSatuan, jumlah;

    Harga(String name, int hargaSatu, int jmlh){
        nama = name;
        hargaSatuan = hargaSatu;
        jumlah = jmlh;
    }

    int hitungHargaTotal(){
        return hargaSatuan*jumlah;
    }

    int hitungDiskon(){
        if (hitungHargaTotal()>100000){
            return hitungHargaTotal()*10/100;
        } else if (hitungHargaTotal()>=50000 && hitungHargaTotal()<=100000){
            return hitungHargaTotal()*5/100;
        } else {
            return 0;
        }
    }

    int hitungHargaBayar(){
        return hitungHargaTotal()-hitungDiskon();
    }
}
