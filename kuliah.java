package PemrogramanLanjut.Latihan;


import java.util.Scanner;



public class kuliah {


    public static void main(String[] args) {
        boolean isIn;
        Scanner x = new Scanner(System.in);
        // Array = [82,12,41,38,19,26,9,48,20,55,8,32,3]
        int[] Himpunan = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        // A. Menampilkan semua nilai di dalam array tersebut di atas

        /* Pseudocode
           1. Mulai
           2. Buat variable yang bertipe data integer yang berbentuk array (misal Himpunan)
           3. Masukkan himpunan bilangan bulat pada variable tersebut,
              dalam kasus ini, himpunan bilangan bulat tersebut adalah [82,12,41,38,19,26,9,48,20,55,8,32,3]
           4. Buatlah looping yang di dalamnya terdapat aturan yang berisikan variable i sebagai counter dengan nilai awal 0 yang akan bertambah +1 setiap putaran
              yang batas putaran atau nilai i yang terus bertambah tersebut kurang dari total panjang array
           5. di dalam looping tersebut, pada setiap putarannnya buat perintah untuk print index array yang ke-i
           6. Selesai

            Source Code : */
        System.out.println("A. Semua nilai di dalam array tersebut di atas adalah : ");
        for (int i = 0; i < Himpunan.length; i++) {
            System.out.println("Nilai dari Himpunan integer index ke-" + i + " adalah " + Himpunan[i]);
        }

        // ATAU

        System.out.print("[" + Himpunan[0]);
        for (int i = 1; i < Himpunan.length; i++) {
            System.out.print(", " + Himpunan[i]);
        }
        System.out.println("]\n\n");

        // B. Mencari sebuah angka di dalam Array tersebut diatas

         /* Pseudocode
           1. Mulai
           2. Buat variable yang bertipe data integer yang berbentuk array (misal Himpunan)
           3. Buat variable yang bertipe data integer yang meminta input-an dari user (misal "target")
           4. Buatlah looping yang di dalamnya terdapat aturan yang berisikan variable i sebagai counter dengan nilai awal 0 yang akan bertambah +1 setiap putaran
              yang batas putaran atau nilai i yang terus bertambah tersebut kurang dari total panjang array
           5. di dalam looping tersebut, pada setiap putarannnya buat pengkondisian dengan pernyataan :
              "apabila variable target sama dengan nilai x index ke-i, maka jalankan perintah berikut :
              -print yang menyatakan bahwa target yang dicari ditemukan!
              -perintah untuk langsung keluar dari looping ketika angka sudah ditemukan"
           6. Jika nilai target yang dicari tidak ditemukan, maka buat kondisi dengan pernyataan :
              "apabila variable i sama dengan jumlah total panjang array dikurang 1, maka jalankan perintah berikut :
              -print yang menyatakan bahwa target yang dicari tidak ditemukan!"
           7. Selesai

              Source Code : */
        System.out.print("B. Masukkan angka yang ingin dicari : ");
        int target = x.nextInt();
        for (int i = 0; i < Himpunan.length; i++) {
            if (target == Himpunan[i]) {
                System.out.println("Angka " + target + " Ditemukan!");
                break;
            } else if (i == Himpunan.length - 1) System.out.println("Angka " + target + " Tidak Ditemukan!");
        }

        // C. Menampilkan angka-angka ganjil di dalam array tersebut di atas
        /* Pseudocode
           1. Mulai
           2. Buat variable yang bertipe data integer yang berbentuk array (misal Himpunan)
           3. Masukkan himpunan bilangan bulat pada variable tersebut,
              dalam kasus ini, himpunan bilangan bulat tersebut adalah [82,12,41,38,19,26,9,48,20,55,8,32,3]
           4. Buatlah looping yang di dalamnya terdapat aturan yang berisikan variable i sebagai counter dengan nilai awal 0 yang akan bertambah +1 setiap putaran
              yang batas putaran atau nilai i yang terus bertambah tersebut kurang dari total panjang array
           5. di dalam looping tersebut, pada setiap putarannnya buat pengkondisian dengan pernyataan :
              "apabila Himpunan integer index ke-i dimoduluskan dengan 2 bernilai 1, maka jalankan perintah : print angka tersebut!"
           6. Selesai

              Source Code : */
        System.out.print("\n\nC. Angka Ganjil di dalam Array tersebut adalah : \n" + "[");
        for (int i = 0; i < Himpunan.length; i++) {
            if (Himpunan[i] % 2 == 1) {
                System.out.print(Himpunan[i]);
                if (i != Himpunan.length - 1) System.out.print(", ");
            }
        }
        System.out.println("]\n\n");

        // D. Menampilkan angka-angka kelipatan 3 di dalam array tersebut di atas
         /* Pseudocode
           1. Mulai
           2. Buat variable yang bertipe data integer yang berbentuk array (misal Himpunan)
           3. Masukkan himpunan bilangan bulat pada variable tersebut,
              dalam kasus ini, himpunan bilangan bulat tersebut adalah [82,12,41,38,19,26,9,48,20,55,8,32,3]
           4. Buatlah looping yang di dalamnya terdapat aturan yang berisikan variable i sebagai counter dengan nilai awal 0 yang akan bertambah +1 setiap putaran
              yang batas putaran atau nilai i yang terus bertambah tersebut kurang dari total panjang array
           5. di dalam looping tersebut, pada setiap putarannnya buat pengkondisian dengan pernyataan :
              "apabila Himpunan integer index ke-i dimoduluskan dengan 3 bernilai 0, maka jalankan perintah : print angka tersebut!"
           6. Selesai

              Source Code : */
        System.out.print("D. Angka Kelipatan 3 di dalam Array tersebut adalah : \n[");
        for (int i = 0; i < Himpunan.length; i++) {
            if (Himpunan[i] % 3 == 0) {
                System.out.print(Himpunan[i]);
                if (i != Himpunan.length - 1) System.out.print(", ");
            }
        }
        System.out.println("]\n\n");

        // E. Menampilkan angka-angka yang memiliki angka 2 di dalam array tersebut di atas
         /* Pseudocode
           1. Mulai
           2. Buat variable yang bertipe data integer yang berbentuk array (misal Himpunan)
           3. Masukkan himpunan bilangan bulat pada variable tersebut,
              dalam kasus ini, himpunan bilangan bulat tersebut adalah [82,12,41,38,19,26,9,48,20,55,8,32,3]
           4. Buatlah looping yang di dalamnya terdapat aturan yang berisikan variable i sebagai counter dengan nilai awal 0 yang akan bertambah +1 setiap putaran
              yang batas putaran atau nilai i yang terus bertambah tersebut kurang dari total panjang array
           5. di dalam looping tersebut, pada setiap putarannnya buat pengkondisian dengan pernyataan :
              "apabila Himpunan integer index ke-i dimoduluskan dengan 10 bernilai 2 atau jika dibagi dengan 10 maka bernilai 2, maka jalankan perintah : print angka tersebut!
           6. Selesai

              Source Code : */
        System.out.print("E. Angka-angka yang memiliki angka 2 di dalam array tersebut di atas adalah : \n[");
        for (int i = 0; i < Himpunan.length; i++) {
            if (Himpunan[i] % 10 == 2 || Himpunan[i] / 10 == 2) {
                if (i != 0) System.out.print(", ");
                System.out.print(Himpunan[i]);
            }
        }
        System.out.print("]\n\n");

        // F. Menampilkan angka-angka ganjil yang diapit oleh angka genap di dalam array tersebut di atas
         /* Pseudocode
           1. Mulai
           2. Buat variable yang bertipe data integer yang berbentuk array (misal Himpunan)
           3. Masukkan himpunan bilangan bulat pada variable tersebut,
              dalam kasus ini, himpunan bilangan bulat tersebut adalah [82,12,41,38,19,26,9,48,20,55,8,32,3]
           4. Buatlah looping yang di dalamnya terdapat aturan yang berisikan variable i sebagai counter dengan nilai awal 1 yang akan bertambah +1 setiap putaran
              yang batas putaran atau nilai i yang terus bertambah tersebut kurang dari total panjang array - 1
           5. di dalam looping tersebut, pada setiap putarannnya buat pengkondisian dengan pernyataan :
              "apabila Himpunan integer index ke-i dimoduluskan dengan 2 bernilai 1, index ke-i - 1 dan index ke-i + 1 dimoduluskan dengan 2 bernilai 0 maka jalankan perintah : print angka tersebut!
           6. Selesai

              Source Code : */

        System.out.print("F. Angka-angka ganjil yang diapit oleh angka genap di dalam array tersebut di atas adalah : \n[");
        isIn = false;
        for (int i = 1; i < Himpunan.length - 1; i++) {
            if (Himpunan[i] % 2 == 1 && Himpunan[i-1] % 2 == 0 && Himpunan[i+1] % 2 == 0) {
                if (isIn) System.out.print(", ");
                System.out.print(Himpunan[i]);
                isIn = true;
            }
        }
        System.out.print("]\n\n");

        // G. Menampilkan angka-angka kelipatan 5 yang sebelumnya juga angka kelipatan 5 di dalam array tersebut di atas
         /* Pseudocode
           1. Mulai
           2. Buat variable yang bertipe data integer yang berbentuk array (misal Himpunan)
           3. Masukkan himpunan bilangan bulat pada variable tersebut,
              dalam kasus ini, himpunan bilangan bulat tersebut adalah [82,12,41,38,19,26,9,48,20,55,8,32,3]
           4. Buatlah looping yang di dalamnya terdapat aturan yang berisikan variable i sebagai counter dengan nilai awal 1 yang akan bertambah +1 setiap putaran
              yang batas putaran atau nilai i yang terus bertambah tersebut kurang dari total panjang array
           5. di dalam looping tersebut, pada setiap putarannnya buat pengkondisian dengan pernyataan :
              "apabila Himpunan integer index ke-i dimoduluskan dengan 5 bernilai 0, index ke-i - 1 dimoduluskan dengan 5 bernilai 0 maka jalankan perintah : print angka tersebut!
           6. Selesai

              Source Code : */

        System.out.print("G. Angka-angka kelipatan 5 yang sebelumnya juga angka kelipatan 5 di dalam array tersebut di atas adalah : \n[");
        isIn = false;
        for (int i = 1; i < Himpunan.length; i++) {
            if (Himpunan[i] % 5 == 0 && Himpunan[i-1] % 5 == 0) {
                if (isIn) System.out.print(", ");
                System.out.print(Himpunan[i]);
                isIn = true;
            }
        }
        System.out.print("]\n\n");

        // H. Menghitung jumlah angka di dalam array tersebut di atas
         /* Pseudocode
           1. Mulai
           2. Buat variable yang bertipe data integer yang berbentuk array (misal Himpunan)
           3. Masukkan himpunan bilangan bulat pada variable tersebut,
              dalam kasus ini, himpunan bilangan bulat tersebut adalah [82,12,41,38,19,26,9,48,20,55,8,32,3]
           4. Buat variable yang bertipe data integer untuk menghitung jumlah angka yang terdapat di dalam array tersebut (misal jumlah)
           5. Buatlah looping forEach yang di dalamnya terdapat aturan yang berisikan variable "angka" dengan tipe data integer yang akan mengambil setiap angka dari variable array "Himpunan"
           6. di dalam looping tersebut, pada setiap putarannnya jalankan perintah yang membuat jumlah akan terus bertambah sebanyak +1 setiap putaran
           7. Tampilkan nilai
           8. Selesai

              Source Code : */
        int jumlah = 0;
        for (int angka : Himpunan) jumlah++;
        System.out.println("H. Jumlah angka di dalam array tersebut adalah sebanyak : " + jumlah + " angka\n\n");

        // I. Menampilkan selisih angka-angka dengan angka setelahnya di dalam array tersebut di atas
         /* Pseudocode
           1. Mulai
           2. Buat variable yang bertipe data integer yang berbentuk array (misal Himpunan)
           3. Masukkan himpunan bilangan bulat pada variable tersebut,
              dalam kasus ini, himpunan bilangan bulat tersebut adalah [82,12,41,38,19,26,9,48,20,55,8,32,3]
           4. Buatlah looping yang di dalamnya terdapat aturan yang berisikan variable i sebagai counter dengan nilai awal 0 yang akan bertambah +1 setiap putaran
              yang batas putaran atau nilai i yang terus bertambah tersebut kurang dari total panjang array - 1
           5. di dalam looping tersebut, pada setiap putarannnya buat pengkondisian dengan pernyataan :
              "Jalankan perintah : print Himpunan nilai index ke-i dikurangi dengan nilai index ke-i + 1!
           6. Selesai

              Source Code : */

        System.out.print("I. Selisih angka-angka dengan angka setelahnya di dalam array tersebut di atas adalah : \n[");
        for (int i = 0; i < Himpunan.length - 1; i++) System.out.print(Himpunan[i]-Himpunan[i+1] + ", ");
        System.out.print(Himpunan[Himpunan.length-1]);
        System.out.print("]\n\n");

        // J. Menampilkan selisih angka-angka genap dengan angka setelahnya yang genap pula di dalam array tersebut di atas
         /* Pseudocode
           1. Mulai
           2. Buat variable yang bertipe data integer yang berbentuk array (misal Himpunan)
           3. Masukkan himpunan bilangan bulat pada variable tersebut,
              dalam kasus ini, himpunan bilangan bulat tersebut adalah [82,12,41,38,19,26,9,48,20,55,8,32,3]
           4. Buatlah looping yang di dalamnya terdapat aturan yang berisikan variable i sebagai counter dengan nilai awal 0 yang akan bertambah +1 setiap putaran
              yang batas putaran atau nilai i yang terus bertambah tersebut kurang dari total panjang array - 1
           5. di dalam looping tersebut, pada setiap putarannnya buat pengkondisian dengan pernyataan :
              "Apabila Himpunan integer index ke-i dimoduluskan dengan 2 bernilai 0 dan index ke-i + 1 dimoduluskan dengan 2 bernilai 0, maka jalankan perintah berikut :
              print Himpunan integer nilai index ke-i dikurangi dengan nilai index ke-i + 1
           6. Selesai

              Source Code : */
        System.out.print("J. Selisih angka-angka genap dengan angka setelahnya yang genap pula di dalam array tersebut di atas adalah : \n[");
        isIn = false;
        for (int i = 0; i < Himpunan.length - 1; i++)
            if (Himpunan[i] % 2 == 0 && Himpunan[i+1] % 2 == 0) {
                if (isIn) System.out.print(", ");
                System.out.print(Himpunan[i] - Himpunan[i + 1]);
                isIn = true;
            }
        System.out.print("]\n\n");

        // K. Menampilkan angka-angka yang setelahnya bernilai lebih besar
         /* Pseudocode
           1. Mulai
           2. Buat variable yang bertipe data integer yang berbentuk array (misal Himpunan)
           3. Masukkan himpunan bilangan bulat pada variable tersebut,
              dalam kasus ini, himpunan bilangan bulat tersebut adalah [82,12,41,38,19,26,9,48,20,55,8,32,3]
           4. Buatlah looping yang di dalamnya terdapat aturan yang berisikan variable i sebagai counter dengan nilai awal 0 yang akan bertambah +1 setiap putaran
              yang batas putaran atau nilai i yang terus bertambah tersebut kurang dari total panjang array - 1
           5. di dalam looping tersebut, pada setiap putarannnya buat pengkondisian dengan pernyataan :
              "Apabila Himpunan integer nilai index ke-i lebih besar dari nilai index ke-i + 1, maka jalankan perintah berikut :
              print Himpunan integer nilai index ke-i
           6. Selesai

              Source Code : */

        System.out.print("K. Angka-angka yang setelahnya bernilai lebih besar di dalam array tersebut di atas adalah : \n[");
        isIn = false;
        for (int i = 0; i < Himpunan.length - 1; i++)
            if (Himpunan[i] < Himpunan[i+1]) {
                if (isIn) System.out.print(", ");
                System.out.print(Himpunan[i]);
                isIn = true;
            }
        System.out.print("]\n\n");

        // L. Menampilkan jumlah angka dengan angka setelahnya yang hasil penjumlahannya bernilai genap di dalam array tersebut di atas
         /* Pseudocode
           1. Mulai
           2. Buat variable yang bertipe data integer yang berbentuk array (misal Himpunan)
           3. Masukkan himpunan bilangan bulat pada variable tersebut,
              dalam kasus ini, himpunan bilangan bulat tersebut adalah [82,12,41,38,19,26,9,48,20,55,8,32,3]
           4. Buatlah looping yang di dalamnya terdapat aturan yang berisikan variable i sebagai counter dengan nilai awal 0 yang akan bertambah +1 setiap putaran
              yang batas putaran atau nilai i yang terus bertambah tersebut kurang dari total panjang array - 1
           5. di dalam looping tersebut, pada setiap putarannnya buat pengkondisian dengan pernyataan :
              "Apabila Himpunan integer nilai index ke-i ditambah nilai index ke-i + 1 jika dimoduluskan dengan 2 bernilai 0, maka jalankan perintah berikut :
              print Himpunan integer nilai index ke-i
           6. Selesai

              Source Code : */

        System.out.print("L. Jumlah angka dengan angka setelahnya yang hasil penjumlahannya bernilai genap di dalam array tersebut di atas adalah : \n[");
        isIn = false;
        for (int i = 0; i < Himpunan.length - 1; i++)
            if ((Himpunan[i] + Himpunan[i+1]) % 2 == 0) {
                if (isIn) System.out.print(", ");
                System.out.print(Himpunan[i] + Himpunan[i+1]);
                isIn = true;
            }
        System.out.print("]\n\n");

        // M. Menghitung jumlah angka-angka selisih yang ditampilkan pada poin (i) di atas
         /* Pseudocode
           1. Mulai
           2. Buat variable yang bertipe data integer yang berbentuk array (misal Himpunan)
           3. Masukkan himpunan bilangan bulat pada variable tersebut,
              dalam kasus ini, himpunan bilangan bulat tersebut adalah [82,12,41,38,19,26,9,48,20,55,8,32,3]
           4. Buat variable integer untuk menghitung jumlah angka dari array Himpunan (misalnya jumlahAngkaSelisih)
           4. Buatlah looping yang di dalamnya terdapat aturan yang berisikan variable i sebagai counter dengan nilai awal 0 yang akan bertambah +1 setiap putaran
              yang batas putaran atau nilai i yang terus bertambah tersebut kurang dari total panjang array - 1
           5. di dalam looping tersebut, pada setiap putarannnya buat pengkondisian dengan pernyataan :
              "Apabila Himpunan integer nilai index ke-i ditambah nilai index ke-i + 1 jika dimoduluskan dengan 2 bernilai 0, maka jalankan perintah berikut :
              print Himpunan integer nilai index ke-i
           6. Selesai

              Source Code : */

        System.out.print("M. Jumlah angka-angka selisih yang ditampilkan pada poin (i) ([");
        int jumlahAngkaSelisih = 0;
        for (int i = 0; i < Himpunan.length - 1; i++) {
            System.out.print(Himpunan[i] - Himpunan[i + 1] + ", ");
            jumlahAngkaSelisih++;
        }
        System.out.print(Himpunan[Himpunan.length-1]);
        jumlahAngkaSelisih++;
        System.out.println("]) di atas adalah sebanyak : " + jumlahAngkaSelisih + " angka\n\n");

        // N. Menampilkan jumlah angka-angka di dalam array tersebut di atas dengan seluruh angka-angka sebelumnya
         /* Pseudocode
           1. Mulai
           2. Buat variable yang bertipe data integer yang berbentuk array (misal Himpunan)
           3. Masukkan himpunan bilangan bulat pada variable tersebut,
              dalam kasus ini, himpunan bilangan bulat tersebut adalah [82,12,41,38,19,26,9,48,20,55,8,32,3]
           4. Buatlah looping yang di dalamnya terdapat aturan yang berisikan variable i sebagai counter dengan nilai awal 0 yang akan bertambah +1 setiap putaran
              yang batas putaran atau nilai i yang terus bertambah tersebut kurang dari total panjang array - 1
           5. di dalam looping tersebut, pada setiap putarannnya berisikan hal berikut ini :
              -variable integer dengan nilai awal 0 (nama variablenya misalkan "temp")
              -looping lagi dengan aturan yang berisikan variable j sebagai counter dengan nilai awal 0 yang akan bertambah +1 setiap putaran yang batas putaran atau nilai j yang terus bertambah tersebut kurang dari sama dengan i
               di dalam looping tersebut, pada setiap putarannya tambahkan "temp" dengan Himpunan integer nilai index yang ke-j
              -print yang menampilkan hasil looping j
           6. Selesai

              Source Code : */
        System.out.print("N. Jumlah angka-angka di dalam array tersebut di atas dengan seluruh angka-angka sebelumnya adalah : \n[");
        for (int i = 0; i < Himpunan.length; i++) {
            int temp = 0;
            for (int j = 0; j <= i; j++) temp += Himpunan[j];
            if (i != 0) System.out.print(", ");
            System.out.print(temp);
        }
        System.out.print("]");
    }

}