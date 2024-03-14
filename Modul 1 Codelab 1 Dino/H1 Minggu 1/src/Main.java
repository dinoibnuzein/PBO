//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int komisi;

        System.out.print("Masukkan Total Penjualan : ");
        int totPenjualan = sc.nextInt();

        System.out.print("Masukkan Jumlah Orang : ");
        int totOrang = sc.nextInt();

        if (totOrang <= 5){
            komisi = totPenjualan / 20;
        } else if (totOrang > 5 && totOrang <= 10) {
            komisi = totPenjualan / 10;
        } else {
            komisi = totPenjualan / 20 * 3;
        }

        System.out.println("Total Penjualan : " + totPenjualan);
        System.out.println("Jumlah Orang : " + totOrang);
        System.out.println("Komisi Yang Anda Dapatkan : " + komisi);
    }
}