import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    scanner.nextLine();
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nim = scanner.nextLine();
                    if (nim.length() != 15) {
                        System.out.println("NIM harus 15 digit!");
                    } else {
                        System.out.print("Masukkan jurusan mahasiswa: ");
                        String jurusan = scanner.nextLine();
                        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan);
                        daftarMahasiswa.add(mahasiswa);
                        System.out.println("Data mahasiswa berhasil ditambahkan.");
                    }
                    break;
                case 2:
                    System.out.println("Data Mahasiswa:");
                    System.out.println(Mahasiswa.tampilUniversitas());
                    for (Mahasiswa mahasiswa : daftarMahasiswa) {
                        System.out.println("Nama: " + mahasiswa.getNama() + ", NIM: " + mahasiswa.getNim() + ", Jurusan: " + mahasiswa.getJurusan());
                    }
                    break;
                case 3:
                    System.out.println("Adios, wes keluar mas");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);

        scanner.close();
    }
}
