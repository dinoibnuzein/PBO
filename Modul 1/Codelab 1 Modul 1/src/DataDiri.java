import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data diri
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);
        String jenisKelaminLengkap;

        if (jenisKelamin == 'P'){
            jenisKelaminLengkap = "Perempuan";
        } else {
            jenisKelaminLengkap = "Laki-Laki";
        }

        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirString = scanner.next();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString);

        // Hitung umur
        LocalDate hariIni = LocalDate.now();
        Period selisih = Period.between(tanggalLahir, hariIni);
        int umurtahun = selisih.getYears();
        int umurbulan = selisih.getMonths();

        // Output data diri dan umur
        System.out.println("\n===== Data Diri =====");
        System.out.println("Nama Anda : " + nama);
        System.out.println("Jenis Kelamin Anda: " + jenisKelaminLengkap);
        System.out.println("Tanggal Lahir Anda: " + tanggalLahir);
        System.out.print("Umur Anda : " + umurtahun + " tahun " + umurbulan + " bulan");


    }
}