import java.security.PrivateKey;
import  java.util.ArrayList;
import java.util.Scanner;

class mahasiswa{
static String nama;
static String nim;
static String jurusan;
static String tampilUniversitas = "Universitas Muhammadiyah Malang";

}

public class Main {
    public static void main(String[] args) {


        ArrayList<String> daftarNama = new ArrayList<>();
        ArrayList<String> daftarNim = new ArrayList<>();
        ArrayList<String> daftarJurusan = new ArrayList<>();

        int count = 0;
        boolean validNim = false;
        Scanner masuk = new Scanner(System.in);

        while (true) {
            System.out.println("\nMain :");
            System.out.println("1. Tambahkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3) : ");
            int choice = masuk.nextInt();

            mahasiswa objMahasiswa = new mahasiswa();

            if (choice == 1){
                System.out.print("Masukkan nama mahasiswa : ");
                mahasiswa.nama = masuk.nextLine();
                daftarNama.add(mahasiswa.nama);


                while (!validNim) {
                    System.out.print("Masukkan NIM (15 digit): ");
                    mahasiswa.nim = masuk.next();

                    if (mahasiswa.nim.length() < 15) {
                        System.out.println("NIM harus 15 digit!");
                    } else if (mahasiswa.nim.length() == 15) {
                        daftarNim.add(mahasiswa.nim);
                        break;
                    }
                }

                System.out.print("Masukkan Jurusan : ");
                mahasiswa.jurusan = masuk.next();
                daftarJurusan.add(mahasiswa.jurusan);

            } else if (choice == 2){
                System.out.println("Data mahasiswa :");
                System.out.println(objMahasiswa.tampilUniversitas);
                System.out.println("Nama : " + daftarNama);
                System.out.println("NIM : " + daftarNim);
                System.out.println("Jurusan : " + daftarJurusan);
            } else if (choice == 3) {
                System.out.println("Adios Yo!!!");
                break;
            }
        }


    }
}
