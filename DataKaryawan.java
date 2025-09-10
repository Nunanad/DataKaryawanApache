/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class DataKaryawan {
    int idKaryawan;
    String nama;
    String jabatan;
    double gaji;
    String alamat;
    String noHP;
    String jenisKelamin;
    String statusPerkawinan;
    String statusKepegawaian;

    // Constructor
    public DataKaryawan(int idKaryawan, String nama, String jabatan, double gaji, String alamat, String noHP,
                        String jenisKelamin, String statusPerkawinan, String statusKepegawaian) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
        this.alamat = alamat;
        this.noHP = noHP;
        this.jenisKelamin = jenisKelamin;
        this.statusPerkawinan = statusPerkawinan;
        this.statusKepegawaian = statusKepegawaian;
    }

    // Menampilkan data karyawan
    public void tampilkanData() {
        System.out.println("ID             : " + idKaryawan);
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + jenisKelamin);
        System.out.println("Status Kawin   : " + statusPerkawinan);
        System.out.println("Jabatan        : " + jabatan);
        System.out.println("Status Pegawai : " + statusKepegawaian);
        System.out.println("Gaji           : Rp" + gaji);
        System.out.println("Alamat         : " + alamat);
        System.out.println("No HP          : " + noHP);
        System.out.println("-----------------------------------");
    }
}