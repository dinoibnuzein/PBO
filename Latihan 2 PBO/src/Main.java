import java.util.Scanner;

class Motor {
    String[] aktifitas;
    int kecepatan = 0;


}

class main {
    public static void main(String[] args) {



        Motor objMotor = new Motor();

        if (objMotor.kecepatan == 0) {
            objMotor.aktifitas[] = "Parkir";
        } else if (objMotor.kecepatan == 1) {
            objMotor.aktifitas[] = "Berjalan";
        }

        System.out.println("Kecepatan anda adalah " + objMotor.aktifitas);

    }
}