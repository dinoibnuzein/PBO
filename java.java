import java.util.Scanner;
public class modulePractice {
    public static void main(String[] args) {
        int belanjaan, diskon, bayar;
        String kartu;
        Scanner scan = new Scanner(System.in);

        System.out.print("Apakah ada kartu member : ");
        belanjaan = scan.nextLine();
        system.out.print("Total belanjaan : ");
        belanjaan = scan.nextInt();

        if (belanjaan > 500000) {
            diskon = 50000;
        } else if (belanjaan > 100000){
            diskon = 15000;
        } else {
            diskon = 0;
        }

        if (belanjaan > 100000) {
            diskon = 5000;
        } else {
            diskon = 0;
        }
    }

    bayar = belanjaan - diskon;
    System.out.println("Total bayar : Rp " + bayar);

}
}