# Program Manajemen Data Karyawan

Program ini adalah sistem manajemen data karyawan sederhana berbasis Java.  
Program memungkinkan pengguna untuk menambahkan, melihat, mengubah, dan menghapus data karyawan secara lebih efisien.

## Fitur
- Tambah data karyawan
- Lihat daftar karyawan
- Ubah data karyawan
- Hapus data karyawan
- Keluar dari program

## Alur Program
1. Saat program dijalankan, muncul menu manajemen karyawan.
2. Pengguna memilih menu
3. Pilih tambah untuk mengisi menambah karyawan.
4. Pilih lihat untuk menampilkan semua data karyawan.
5. Pilih ubah untuk memperbarui data karyawan berdasarkan nomor id.
6. Jika pilih hapus, karyawan dihapus dari daftar.
7. Program terus berjalan sampai pengguna memilih keluar.

## Output Program
<img width="283" height="140" alt="image" src="https://github.com/user-attachments/assets/71fc33db-714d-48c7-88a0-4a16cb40a7e2" />

1. Gambar di atas merupakan tampilan menu utama dari program Manajemen Data KAryawan yang menerapkan CRUD lengkap


<img width="527" height="318" alt="image" src="https://github.com/user-attachments/assets/d7d57145-a3b0-48c5-9094-293c3bc05d2e" />

2. Ketika kita memilih nomor satu pada menu kita akan diarahkan ke menu untuk menambah karyawan dan gambar diatas merupakan prosesnya


<img width="344" height="323" alt="image" src="https://github.com/user-attachments/assets/8518cdc5-a19a-4732-a373-6f8850e181e8" />

3. Ketika memilih nomor dua pada menu maka kita akan diarahkan ke tampilan daftar karyawan


<img width="412" height="201" alt="image" src="https://github.com/user-attachments/assets/dee37a4e-7f33-41f3-92ef-3c52b314bbc9" />

4. Ketika memilih nomor tiga pada menu, maka kita dapat mengedit data karyawan dengan langkah memasukan id karyawan terlebih dahulu


<img width="331" height="300" alt="image" src="https://github.com/user-attachments/assets/909b6755-08cb-4631-ac5a-3dcd27e0cc59" />

5. Gambar di atas merupakan proses pengeditan data karyawan, admin harus mengetikan kembali data karyawan sebelumnya dan mengubah bagian yang diinginkan

<img width="358" height="90" alt="image" src="https://github.com/user-attachments/assets/f09bfa79-e5f6-445b-9659-f48782e3d7bc" />

6. Terdapat menu hapus karyawan, digunakan untuk menghapus data karyawan yang sudah berhenti kerja, program dapat berjalan dengan admin mengetikkan id dari karyawan yang ingin dihapus datanya dari perusahaan.

<img width="349" height="93" alt="image" src="https://github.com/user-attachments/assets/3888cbbc-4328-4715-b5ba-4cb9c76d3e7f" />

7. Gambar di atas menandakan bahwa data karyawan yang dipilih berhasil terhapus

<img width="344" height="323" alt="image" src="https://github.com/user-attachments/assets/8518cdc5-a19a-4732-a373-6f8850e181e8" />
<img width="333" height="243" alt="image" src="https://github.com/user-attachments/assets/a307e6af-7113-440d-a9e6-989e808be390" />

8. Data Karyawan "Nanda" Berhasil Terhapus


# Penjelasan Kode

## class buku

1. <img width="485" height="229" alt="image" src="https://github.com/user-attachments/assets/3c2dcb22-ae96-465b-95f0-ba73bab1be06" />

Pada gambar di atas, kita membuat atribut dari karyawan, yaitu data karyawan

2. <img width="1082" height="285" alt="image" src="https://github.com/user-attachments/assets/1ea83782-f50b-446d-b001-2db8265339d6" />

Pada tahap ini kita membuat constructor yang berfungsi untuk mengisi data karyawan saat objek pertama kali dibuat. Constructor akan langsung menyimpan nilai dari parameter ke atribut kelas dengan bantuan keyword this, jadi setiap objek yang dibuat otomatis punya data lengkap tanpa harus diisi ulang secara manual.

3. <img width="688" height="262" alt="image" src="https://github.com/user-attachments/assets/dbfbe9df-3ca3-443d-978f-b3d7afd84757" />

Dalam program ini, kita membuat kelas DataKaryawan yang berisi atribut-atribut penting untuk menyimpan informasi karyawan, mulai dari ID, nama, jabatan, gaji, hingga data pribadi seperti alamat dan status. Untuk mengisi atribut tersebut, digunakan constructor yang secara otomatis menyimpan data ketika objek baru dibuat, sehingga kita tidak perlu mengisi ulang satu per satu. Lalu method tampilkanData() berfungsi menampilkan semua informasi karyawan ke layar agar data bisa langsung dibaca dengan rapi.

## class main

1.  <img width="303" height="72" alt="image" src="https://github.com/user-attachments/assets/664e0e45-d5c1-405f-adb4-9eff0b316478" />

ArrayList digunakan untuk membuat daftar dinamis berisi objek DataKaryawan. Berbeda dengan array biasa yang ukurannya tetap, ArrayList bisa bertambah atau berkurang sesuai kebutuhan, misalnya saat kita menambah atau menghapus data karyawan.

Scanner digunakan untuk membaca input dari pengguna melalui keyboard. Dengan Scanner, kita bisa menerima data seperti string, angka, atau pilihan menu yang dimasukkan oleh user ketika menjalankan program.

2.<img width="718" height="394" alt="image" src="https://github.com/user-attachments/assets/65a4d106-10e7-4ed7-b010-1779de8d1ae8" />


Di bagian ini, program mulai jalan lewat main. Kita bikin ArrayList buat nyimpen data karyawan, terus ada Scanner biar bisa nerima input dari user. nextId dipake buat bikin ID otomatis tiap karyawan baru. Nah, lewat do-while, program bakal nampilin menu utama dan user tinggal pilih mau ngapain.


3. <img width="757" height="415" alt="image" src="https://github.com/user-attachments/assets/9ee1fa82-2fb4-45b6-b345-b20fb32d8030" />

Di potongan kode ini, program lagi masuk ke menu Tambah Karyawan. Pertama, user diminta ngisi nama karyawan. Setelah itu, ada pilihan jenis kelamin yang cuma dua opsi: Pria atau Wanita. Sistem pake do-while biar kalau user salah input (misalnya milih angka selain 1 atau 2), program bakal minta input ulang sampai pilihannya bener.


4. <img width="710" height="277" alt="image" src="https://github.com/user-attachments/assets/691160d8-2e78-4ebd-88a9-1dc11750c3c9" />

Bagian ini buat ngisi status perkawinan karyawan. User dikasih dua pilihan, yaitu Sudah atau Belum. Sama kayak sebelumnya, dipake do-while biar program terus ngulang kalau input salah. Jadi kalau user masukin angka selain 1 atau 2, sistem bakal bilang salah dan minta input ulang sampai bener.


5. <img width="787" height="361" alt="image" src="https://github.com/user-attachments/assets/963940a9-8edf-43ff-891f-107d11fe0f46" />

Di bagian kode ini, program menggunakan Scanner untuk membaca input dari keyboard yang diketik oleh pengguna. Setiap data karyawan disimpan sesuai dengan tipe datanya. Misalnya, String dipakai untuk menyimpan teks seperti nama, jabatan, alamat, status kepegawaian, dan nomor H


6. <img width="879" height="356" alt="image" src="https://github.com/user-attachments/assets/ce4ace7a-9a56-4697-a37b-9f6053620844" />

Pada bagian kode ini, program masuk ke menu pilihan kedua yaitu melihat daftar karyawan. Pertama, program mengecek apakah daftarKaryawan kosong dengan perintah isEmpty(). Jika memang belum ada data yang tersimpan, maka akan muncul tulisan "Belum ada data karyawan.". Namun, kalau ada isinya, program akan melakukan perulangan for untuk menampilkan semua data karyawan yang ada di dalam list. Di dalam perulangan itu, setiap objek karyawan akan dipanggil dengan metode tampilkanData(), yang sebelumnya sudah dibuat di class DataKaryawan, sehingga informasi lengkap setiap karyawan bisa ditampilkan ke layar


7. <img width="913" height="407" alt="image" src="https://github.com/user-attachments/assets/72866bc7-d9a8-4251-ad35-5e9f806128e9" />

Bagian kode ini dipakai untuk mengubah data karyawan. Program minta user memasukkan ID karyawan, lalu dicek satu per satu di daftar. Kalau ID cocok, data lama bisa diganti dengan data baru (nama, jenis kelamin, dan seterusnya). Kalau tidak ditemukan, program akan kasih pesan bahwa ID tersebut tidak ada.


8. <img width="685" height="399" alt="image" src="https://github.com/user-attachments/assets/e1155f9b-5ccb-4af5-a3fd-240c85e7e236" />

Bagian kode ini dipakai untuk mengupdate detail data karyawan setelah ID ditemukan. Program menampilkan data lama di dalam tanda kurung, lalu user bisa mengetik data baru untuk menggantinya, mulai dari jabatan, status pegawai, gaji, alamat, sampai nomor HP. Setelah semua diisi, program menampilkan pesan bahwa data karyawan berhasil diubah.


9. <img width="906" height="410" alt="image" src="https://github.com/user-attachments/assets/088e9665-d2c8-4968-b9fb-87901c4b0f7c" />

Bagian kode ini dipakai untuk menghapus data karyawan. Program minta user memasukkan ID karyawan, lalu dilakukan pengecekan satu per satu di daftar. Kalau ID cocok, data karyawan langsung dihapus dari list dan muncul pesan sukses. Kalau tidak ada yang cocok, program menampilkan pesan bahwa ID karyawan tidak ditemukan.


10. <img width="676" height="286" alt="image" src="https://github.com/user-attachments/assets/352d2151-0603-4b9d-94ad-0af4c552fc6e" />

Bagian kode ini adalah akhir dari menu utama. Kalau user pilih 5, program akan menampilkan pesan "Keluar dari program..." lalu berhenti. Kalau user mengetik angka selain menu yang tersedia, bagian default akan jalan dan menampilkan "Pilihan tidak valid!". Program akan terus berulang selama pilihan tidak sama dengan 5, dan setelah selesai, scanner ditutup supaya tidak ada kebocoran input.










