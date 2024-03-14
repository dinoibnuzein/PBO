import java.util.Scanner;

class manusia{
    String nama = "Dino";
    int umur = 20;
    String alamat;
    int no_hp;
    char jk;

    void berjalan(){
        System.out.println("lurus");
    }
    void makan(){
        System.out.println("suka mukbang");
    }
}
class mahasiswa {
    int nim = 2023;
    String nama = "Dinoo";

    void belajar() {
        System.out.println("di rumah");
    }

    void tugas() {
        System.out.println("chat gpt");
    }
}

class main {
    public static void main(String[] args) {

        manusia objmanusia = new manusia();
        mahasiswa objmahasiswa = new mahasiswa();
        System.out.println(objmanusia.nama);
        System.out.println(objmanusia.umur + " tahun");
        objmanusia.berjalan();

        System.out.println(objmahasiswa.nim);
        System.out.println(objmahasiswa.nama);
        objmahasiswa.belajar();
    }
}