#Percobaan 1#
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks
ke-0? Jelaskan!
Jawab:
>Pengisian array tidak harus dilakukan secara berurutan dari indeks ke-0, boleh diisi secara acak selama indeks yang dituju masih dalam batas ukuran array, jika melebihi batas ukuran array maka elemen akan diisi dengan nilai default
2. Mengapa terdapat null pada daftar nama penonton?
Jawab:
>Karena elemen array tersebut tidak diisi nilai apapun, sehingga java memberi nilai default pada elemen tersebut berdasarkan tipe datanya
4. Jelaskan fungsi dari penonton.length dan penonton[0].length!
Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama Mengapa?
>Jawab:
penonton.length digunakan untuk mengetahui jumlah baris pada array 2 dimensi. penonton[0].length digunakan untuk mengetahui jumlah kolom pada baris ke-0 dari array 2D. Ya, semuanya memiliki nilai yang sama yaitu 2 karena array dibuat dengan ukuran 4 elemen baris dan 2 elemen kolom
10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop?
>Jawab:
Kelebihan foreach loop adalah sintaks lebih sederhana dan mudah dibaca, tidak ada risiko ArrayIndexOutOfBoundsException karena foreach otomatis berhenti di akhir elemen, dan cocok untuk membaca semua isi array. Sedangkan kekurangan foreach loop adalah tidak bisa mengakses index dan memodifikasi array secara langsung
11. Berapa indeks baris maksimal untuk array penonton?
>Jawab:
indeks baris maksimal 3 (0,1,2,3)
12. Berapa indeks kolom maksimal untuk array penonton?
>Jawab
indeks kolom maksimal 1 (0,1)
13. Apa fungsi dari String.join()?
>Jawab
Menggabungkan array atau list string dan untuk menambahkan delimiter(pemisah), misalnya",","-", atau "\n"

#Percobaan 2#
1. Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
>Jawab
Tidak, pengisian elemen array tidak harus berurutan dan program tetap berjalan asalkan indeks valid (tidak mengisi indeks yang sudah diisi), jika tidak maka program akan error atau bisa diberikan struktur kontrol untuk meminta user menginput indeks yang 

#Percobaan 3#
2. Apa fungsi dari Arrays.toString()?
>Jawab
mengubah isi array menjadi bentuk string untuk ditampilkan ke layar
