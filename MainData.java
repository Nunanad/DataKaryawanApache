/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author asus
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MainData {
    public static void main(String[] args) {
        ArrayList<DataKaryawan> daftarKaryawan = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        int nextId = 1; // auto increment ID

        do {
            System.out.println("\n=== MENU MANAJEMEN KARYAWAN ===");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Lihat Daftar Karyawan");
            System.out.println("3. Ubah Data Karyawan");
            System.out.println("4. Hapus Karyawan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== TAMBAH KARYAWAN ===");
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();

                    // Jenis kelamin hanya 2 pilihan
                    String jenisKelamin = "";
                    do {
                        System.out.println("Jenis Kelamin: ");
                        System.out.println("1. Pria");
                        System.out.println("2. Wanita");
                        System.out.print("Pilih: ");
                        int pilihJK = scanner.nextInt();
                        scanner.nextLine();
                        if (pilihJK == 1) jenisKelamin = "Pria";
                        else if (pilihJK == 2) jenisKelamin = "Wanita";
                        else System.out.println("Pilihan tidak valid, coba lagi.");
                    } while (jenisKelamin.equals(""));

                    // Status perkawinan hanya 2 pilihan
                    String statusPerkawinan = "";
                    do {
                        System.out.println("Status Perkawinan: ");
                        System.out.println("1. Sudah");
                        System.out.println("2. Belum");
                        System.out.print("Pilih: ");
                        int pilihKawin = scanner.nextInt();
                        scanner.nextLine();
                        if (pilihKawin == 1) statusPerkawinan = "Sudah";
                        else if (pilihKawin == 2) statusPerkawinan = "Belum";
                        else System.out.println("Pilihan tidak valid, coba lagi.");
                    } while (statusPerkawinan.equals(""));

                    System.out.print("Jabatan: ");
                    String jabatan = scanner.nextLine();

                    System.out.print("Status Kepegawaian (Tetap/Kontrak/Magang/Outsourcing): ");
                    String statusKepegawaian = scanner.nextLine();

                    System.out.print("Gaji: ");
                    double gaji = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Alamat: ");
                    String alamat = scanner.nextLine();

                    System.out.print("No HP: ");
                    String noHP = scanner.nextLine();

                    daftarKaryawan.add(new DataKaryawan(nextId++, nama, jabatan, gaji, alamat, noHP,
                            jenisKelamin, statusPerkawinan, statusKepegawaian));
                    System.out.println("Data karyawan berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n=== DAFTAR KARYAWAN ===");
                    if (daftarKaryawan.isEmpty()) {
                        System.out.println("Belum ada data karyawan.");
                    } else {
                        for (DataKaryawan k : daftarKaryawan) {
                            k.tampilkanData();
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n=== UBAH DATA KARYAWAN ===");
                    System.out.print("Masukkan ID karyawan yang ingin diubah: ");
                    int idUbah = scanner.nextInt();
                    scanner.nextLine();

                    boolean ditemukanUbah = false;
                    for (DataKaryawan k : daftarKaryawan) {
                        if (k.idKaryawan == idUbah) {
                            System.out.print("Nama baru (" + k.nama + "): ");
                            k.nama = scanner.nextLine();

                            // Jenis Kelamin edit
                            String jkBaru = "";
                            do {
                                System.out.println("Jenis Kelamin baru (" + k.jenisKelamin + "): ");
                                System.out.println("1. Pria");
                                System.out.println("2. Wanita");
                                System.out.print("Pilih: ");
                                int pilihJK = scanner.nextInt();
                                scanner.nextLine();
                                if (pilihJK == 1) jkBaru = "Pria";
                                else if (pilihJK == 2) jkBaru = "Wanita";
                                else System.out.println("Pilihan tidak valid, coba lagi.");
                            } while (jkBaru.equals(""));
                            k.jenisKelamin = jkBaru;

                            // Status Kawin edit
                            String kawinBaru = "";
                            do {
                                System.out.println("Status Kawin baru (" + k.statusPerkawinan + "): ");
                                System.out.println("1. Sudah");
                                System.out.println("2. Belum");
                                System.out.print("Pilih: ");
                                int pilihKawin = scanner.nextInt();
                                scanner.nextLine();
                                if (pilihKawin == 1) kawinBaru = "Sudah";
                                else if (pilihKawin == 2) kawinBaru = "Belum";
                                else System.out.println("Pilihan tidak valid, coba lagi.");
                            } while (kawinBaru.equals(""));
                            k.statusPerkawinan = kawinBaru;

                            System.out.print("Jabatan baru (" + k.jabatan + "): ");
                            k.jabatan = scanner.nextLine();

                            System.out.print("Status Pegawai baru (" + k.statusKepegawaian + "): ");
                            k.statusKepegawaian = scanner.nextLine();

                            System.out.print("Gaji baru (" + k.gaji + "): ");
                            k.gaji = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("Alamat baru (" + k.alamat + "): ");
                            k.alamat = scanner.nextLine();

                            System.out.print("No HP baru (" + k.noHP + "): ");
                            k.noHP = scanner.nextLine();

                            System.out.println("Data karyawan berhasil diubah!");
                            ditemukanUbah = true;
                            break;
                        }
                    }
                    if (!ditemukanUbah) {
                        System.out.println("Karyawan dengan ID tersebut tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("\n=== HAPUS KARYAWAN ===");
                    System.out.print("Masukkan ID karyawan yang ingin dihapus: ");
                    int idHapus = scanner.nextInt();
                    scanner.nextLine();

                    boolean ditemukanHapus = false;
                    for (int i = 0; i < daftarKaryawan.size(); i++) {
                        if (daftarKaryawan.get(i).idKaryawan == idHapus) {
                            daftarKaryawan.remove(i);
                            System.out.println("✅ Data karyawan berhasil dihapus!");
                            ditemukanHapus = true;
                            break;
                        }
                    }
                    if (!ditemukanHapus) {
                        System.out.println("❌ Karyawan dengan ID tersebut tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}