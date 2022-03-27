public class mahasiswaPolinemaNiken {
    public static void main(String[] args) {
        String kampus = "Polinema";
        int tingkat = 1;
        char kelas = 'F';
        int bilanganBulat = 10;
        double bilanganPecahan = 3.33333;
        char karakter = 'C';

        System.out.println("Saya mahasiswa " +kampus);
        System.out.println("Saya sedang belajar menampilkan nilai: ");
        System.out.println("Bilangan bulat " + bilanganBulat);
        System.out.println("Bilangan pecahan " + (float) bilanganPecahan);
        System.out.println(String.format("Karakter " +karakter));
    }
}
