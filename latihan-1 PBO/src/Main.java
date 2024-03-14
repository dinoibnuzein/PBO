import java.util.Scanner;
class Mobil{
String warna = "hitam";
String merek = "avanza";
int tahun = 2011;
}

class main{
    public static void main(String[] args) {

        Mobil objM1 = new Mobil();

        System.out.println("Mobil " + objM1.merek + " warna " + objM1.warna + " keluaran tahun " + objM1.tahun);
    }
}