import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner angka = new Scanner(System.in);

        int panjang, tinggi, hasil;

        System.out.print("Program Menghitung Luas Segitiga\n\n");

        System.out.print("Masukkan panjang segitiga : ");
        panjang = angka.nextInt();

        System.out.print("Masukkan tinggi segitiga : ");
        tinggi = angka.nextInt();

        hasil = (panjang * tinggi) /2;

        System.out.print("\nPanjang segitiga adalah " + panjang);
        System.out.print("\nTinggi segitiga adalah " + tinggi);
        System.out.print("\nHasil luas segitiga anda adalah : " + hasil);
    }
}