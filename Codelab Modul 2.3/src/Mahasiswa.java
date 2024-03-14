public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private static String universitas = "Universitas Muhammadiyah Malang";

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public static String tampilUniversitas() {
        return universitas;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }
}