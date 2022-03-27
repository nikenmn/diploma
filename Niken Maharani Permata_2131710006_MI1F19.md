#### Nama : Niken Maharani Permata
#### NIM : 2131710006
#### Kelas / No Abs : MI1F / 19

## JOBSHEET 7

## PERULANGAN 1

### Tujuan

Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks perulangan 1 dan mengimplemantasikannya dalam bahasa pemrogaman java.

### Alat dan Bahan
+ PC/laptop
+ Browser(chrome, firefox, safari)
+ Koneksi internet

### Praktikum

#### Percobaan 1 : Penggunaan for, while dan do-while

#### Waktu percobaan : 40 menit

1. Perhatikan flowchart perulangan for dibawah ini!

    <p align="left">
    <img width="197" height="259" src="images/flowchartFaktorial.png">
    </p>
    

> Flowchart diatas digunakan untuk menghitung nilai faktorial, selanjutnya kita akan membuat programnya berdasarkan
> flowchart di atas!

2. Tambahkan library Scanner, deklarasi Scanner, dan buat variabel angka untuk menampung data yang diinput melalui keyboard




```Java
// Ketik kode program di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka;
```

3. Buatlah deklarasi dan inisialisasi variabel faktorial sesuai dengan flowchart diatas


```Java
// Ketik kode program di bawah sini
int faktorial = 1;
```

4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for
    
    <p align="left">
    <img width="696" height="124" src="images/for.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan : ");
angka= input.nextInt();
for(int i=1; i<=angka; i++)
    faktorial*=i;
System.out.print("Nilai faktorial bilangan tersebut adalah : "+ faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 4
    Nilai faktorial bilangan tersebut adalah : 24

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka, faktorial, i;
faktorial = 1;

System.out.println("==== PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR ====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i =1;
while(i<=angka){
        faktorial*=i;
        i++;
}
        System.out.print("Nilai faktorial bilangan tersebut adalah : " +faktorial);
```

    ==== PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR ====
    Masukkan Bilangan : 7
    Nilai faktorial bilangan tersebut adalah : 5040

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>

// Ketik kode program di atas di bawah sini



```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka, faktorial, i;
faktorial = 1;

System.out.println("==== PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE ====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i =1;
do{
    faktorial*=i;
    i++;
}
while(i<=angka);
        System.out.print("Nilai faktorial bilangan tersebut adalah : " +faktorial);
```

    ==== PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE ====
    Masukkan Bilangan : 8
    Nilai faktorial bilangan tersebut adalah : 40320

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>

#### Jawaban No.1
Guna faktorial*=i adalah untuk melaksanakan perhitungan faktorial. Mengkalikan bilangan faktorial sebanyak i atau yang sebanyak dimaksukkan.

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka;
int faktorial = 1;

System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
System.out.print(angka);
System.out.print(" Faktorial = ");
for(int i=1; i<=angka; i++){
    faktorial*=i;
    System.out.print(i);
    System.out.print("x");
}  
System.out.print( " = " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL=====
    Masukkan Bilangan : 5
    5 Faktorial = 1x2x3x4x5x = 120

#### Percobaan 2 : Keluar dari perulangan menggunakan break

#### Waktu percobaan : 40 menit

1. Buatlah perulangan dengan menggunakan for yang memanfaatkan keyword break
<p align="left">
    <img width="696" height="124" src="images/for2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
Scanner input = new Scanner(System.in);
int angka, total;
System.out.println("=== PROGRAM FOR LOOP DENGAN BREAK ===");
for(total=0; true;){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total >50) break;
}
 System.out.print("Jumlah angka-angka yang telah dimasukkan : " +total);
```

    === PROGRAM FOR LOOP DENGAN BREAK ===
    Masukkan Bilangan : 80
    Jumlah angka-angka yang telah dimasukkan : 80

2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
Scanner input = new Scanner(System.in);
int angka, total;
System.out.println("=== PROGRAM FOR LOOP DENGAN WHILE ===");
total=0; 
while (true){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total >50) break;
}
System.out.print("Jumlah angka-angka yang telah dimasukkan : " +total);
```

    === PROGRAM FOR LOOP DENGAN WHILE ===
    Masukkan Bilangan : 10
    Masukkan Bilangan : 40
    Masukkan Bilangan : 80
    Jumlah angka-angka yang telah dimasukkan : 130

3. Tuliskan perulangan diatas dalam struktur do-while
    <p align="left">
    <img width="696" height="124" src="images/dowhile2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
Scanner input = new Scanner(System.in);
int angka, total;
System.out.println("=== PROGRAM DO-WHILE LOOP DENGAN WHILE ===");
total=0; 
do
{
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total >50) break;
}
while (true);
 System.out.print("Jumlah angka-angka yang telah dimasukkan : " +total);
```

    === PROGRAM DO-WHILE LOOP DENGAN WHILE ===
    Masukkan Bilangan : 90
    Jumlah angka-angka yang telah dimasukkan : 90

##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

#### Jawaban No. 1
break digunakan untuk menghentikan paksa suatu pernyataan (statement), dimana inputan akan keluar dari perulangan, kode diluar perulangan akan dieksekusi.

2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>


#### Jawaban No. 2
fungsi dari for(total=0;true;){ ialah digunakan untuk melakukan perulangan sebanyak jumlah yang telah
diketahui. dari kode program diatas, total=0 merupakan inisialilasi dimana total dimulai dari angka 0, bernilai benar. Maka statement selanjutnya akan dijalankan.

#### Percobaan 3 : Keluar dari step perulangan menggunakan continue

#### Waktu percobaan : 40 menit

1. Buat program looping menggunakan struktur perulangan for seperti di bawah ini: 
<p align="left">
    <img src="images/forContinue.jpg" align="left">
    </p>



```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka, total, count;
double avg;
count=0;
System.out.println("=== PROGRAM FOR LOOP DENGAN CONTINUE ===");
for(int i=0; i<5; i++){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    if(angka>=50) continue;
    total += angka;
    count++;
}
System.out.println("Jumlah angka-angka yang kurang dari 50: " +total);
avg=(double)total/count;
System.out.println("Rata-rata angka-angka yang kurang dari 50: " +avg);
```

    === PROGRAM FOR LOOP DENGAN CONTINUE ===
    Masukkan Bilangan : 90
    Masukkan Bilangan : 10
    Masukkan Bilangan : 70
    Masukkan Bilangan : 80
    Masukkan Bilangan : 28
    Jumlah angka-angka yang kurang dari 50: 38
    Rata-rata angka-angka yang kurang dari 50: 19.0



```Java
5. Jalankan program. Amati apa yang terjadi!
```

Hal yang terjadi ialah dilakukan perulangan pada program, dimana dihasilkan output jumlah angka angka yang kurang dari 50 beserta rata-ratanya

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

#### Jawaban pertanyaan Nomor 1
Perbedaan antara percobaan 2 dan percobaan 3 ialah pada penggunaan penghentian perulangan. Pada percobaan 2 digunakan perulangan break, dimana pada penggunaan break, proses perulangan akan dihentikan hanya pada 1 pernyataan. Sehingga akan keluar dari perulangan. Sementara pada percobaan 3 digunakan perulangan continue, dimana untuk mengabaikan ,lalu melanjutkan suatu pernyataan pada perulangan. Menghentikan perulangan yang saat ini terjadi (1 iterasi saja). Kemudian melanjutkan perulangan iterasi berikutnya, atau bisa disebut juga untuk ‘melewati’ 1 perulangan

2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>

#### Jawaban No.2
Fungsi perintah kode tersebut ialah jika inputan bernilai lebih dari sama dengan 50 maka program akan berhenti dari perulangan di tengah dan memulai kembali dari awal. Keluar dari iterasi tapi perulangan tetap dijalankan.

### Tugas

#### Waktu pengerjaan Tugas: 140 menit

1. Buatlah program yang meminta masukan user sebuah bilangan bulat N (N > 0). Program kemudian menampilkan penjumlahan N bilangan genap positif pertama (bilangan genap ≥ 0).
Contoh: 
    •	Jika user memasukkan N = 10, program akan menghitung banyaknya jumlah bilangan positive di dalam range bilangan 1-10   kemudian menampilkan penjumlahan bilangan positive bilangan bilangan diantara 1-10 yaitu : 
        0 + 2 + 4 + 6 + 10 = 30. 
        Setelah itu program akan menampilkan rata-rata dari bilangan positive yang telah dijumlahkan tadi.
    •	Contoh output program dan flowchart
<br/><img width="303" height="529" src="images/hasilTugasFc.jpg" align="left"><br/>
  

<br/><img width="303" height="529" src="images/fcTugasJS7.png" align="left">



```Java
// Ketik kode program disini
// Jawaban Tugas No 1
import java.util.Scanner;
Scanner input = new Scanner(System.in) ;
int bil, jmlBilGenap;
int totalGenap = 0;
double avg;
System.out.print("Masukkan angka : ") ;
bil = input.nextInt();
jmlBilGenap=bil/2;
System.out.println("Banyaknya angka genap dari 1 sampai " +bil + " adalah " + jmlBilGenap) ;
for(int i=1; i<=bil; i++) {
    if(i%2!=0) continue;
    totalGenap+=i;
}

System.out.print("Angka genap dalam range tersebut adalah ");

for(int i=1; i<=10; i++)
    if(i%2==0) {
    System.out.print( i +" ");
    }
System.out.print("\nHasil dari penjumlahan bilangan genap dari 1 sampai " +bil + " adalah " + totalGenap) ;
avg=totalGenap/jmlBilGenap;
System.out.print("\nRata-rata bilangan genap dari 1 sampai " +bil + " adalah " + avg);
```

    Masukkan angka : 10
    Banyaknya angka genap dari 1 sampai 10 adalah 5
    Angka genap dalam range tersebut adalah 2 4 6 8 10 
    Hasil dari penjumlahan bilangan genap dari 1 sampai 10 adalah 30
    Rata-rata bilangan genap dari 1 sampai 10 adalah 6.0

2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int x, angka;

System.out.print("Masukkan angka : ");
angka = input.nextInt();
for(x=1; x<=angka; x++) {
if (x%5==0) continue;
System.out.println(x);
}
```

    Masukkan angka : 19
    1
    2
    3
    4
    6
    7
    8
    9
    11
    12
    13
    14
    16
    17
    18
    19


3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
 <p align="left">
    <img width="451" height="226" src="images/fibo.png" align="left">
    </p>



```Java
// Ketik kode program disini
import java.util.Scanner;
    int  n1= 0 ,n2= 1 ,n3,i,count ;    
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan jumlah deret bilangan fibonacci: ");
    count = scan.nextInt();

System.out.println(" ");
System.out.println("Fibonacci Series");
System.out.println(" ");
 for (i= 2 ;i<count;++i)    
 {    
  n3=n1+n2;    
  System.out.println( "Sum of: " +n1+ " + "  +n2+ " = " +n3);    
  n1=n2;    
  n2=n3;    
 }
```

    Masukkan jumlah deret bilangan fibonacci: 20
     
    Fibonacci Series
     
    Sum of: 0 + 1 = 1
    Sum of: 1 + 1 = 2
    Sum of: 1 + 2 = 3
    Sum of: 2 + 3 = 5
    Sum of: 3 + 5 = 8
    Sum of: 5 + 8 = 13
    Sum of: 8 + 13 = 21
    Sum of: 13 + 21 = 34
    Sum of: 21 + 34 = 55
    Sum of: 34 + 55 = 89
    Sum of: 55 + 89 = 144
    Sum of: 89 + 144 = 233
    Sum of: 144 + 233 = 377
    Sum of: 233 + 377 = 610
    Sum of: 377 + 610 = 987
    Sum of: 610 + 987 = 1597
    Sum of: 987 + 1597 = 2584
    Sum of: 1597 + 2584 = 4181



```Java

```
