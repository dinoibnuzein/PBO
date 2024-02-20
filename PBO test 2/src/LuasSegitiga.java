import java.util.Scanner;

public class LuasSegitiga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta masukan dari user
        System.out.print("Masukkan alas segitiga: ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        // Menghitung luas segitiga
        double luas = (alas * tinggi) / 2;

        // Menampilkan hasil
        System.out.println("Luas segitiga adalah: " + luas);
    }
}
