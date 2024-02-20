import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double panjang, luas, lebar;

        System.out.print("Masukkan panjang balok : ");
        panjang = input.nextDouble();

        System.out.print("Masukkan lebar balok : ");
        lebar = input.nextDouble();

        luas = (panjang * lebar);

        System.out.print("luas balok anda adalah : " + luas);

    }
}