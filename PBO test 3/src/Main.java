public class Main {

    public static void main(String[] args) {
        // Deklarasi string
        String str1 = "Hello, world!";
        String str2 = "Selamat datang di Java!";

        // Menggabungkan string
        String str3 = str1 + " " + str2;

        // Mengubah string menjadi huruf besar
        String str4 = str3.toUpperCase();

        // Mengubah string menjadi huruf kecil
        String str5 = str4.toLowerCase();

        // Mencari panjang string
        int panjangStr5 = str5.length();

        // Menemukan karakter di posisi tertentu
        char karakter = str5.charAt(4);

        // Membandingkan dua string
        boolean sama = str1.equals(str2);

        // Menampilkan hasil
        System.out.println("String gabungan: " + str3);
        System.out.println("String huruf besar: " + str4);
        System.out.println("String huruf kecil: " + str5);
        System.out.println("Panjang string: " + panjangStr5);
        System.out.println("Karakter di posisi 4: " + karakter);
        System.out.println("Apakah string sama? " + sama);
    }
}
