import java.util.Scanner;

class Main {
    private static Book[] bookList = new Book[100];
    private static Student[] userStudent = new Student[100];
    private static int numStudents = 0;
    private static int numBooks = 0;

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Admin");
            System.out.println("2. Login as Mahasiswa");
            System.out.println("3. Log Out");
            System.out.print("pilih (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    menuAdmin(scanner);
                    break;
                case 2:
                    inputNim(scanner);
                    break;
                case 3:
                    System.out.println("Cyaaa!");
                    break;
                default:
                    System.out.println("God damn it!! read it correctly!");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void inputNim(Scanner scanner) {
        System.out.print("Input NIM: ");
        String nim = scanner.next();

        if (checkNim(nim)) {
            System.out.println("Halo "+ nim);
            menuStudent(scanner);
        } else {
            System.out.println("Invalid NIM SMH. Please try again for God shake.");
        }
    }

    private static boolean checkNim(String nim) {
        return nim.length() == 15;
    }

    private static void menuAdmin(Scanner scanner) {
        int Choice;

        do {
            System.out.println("\n===== Menu Admin =====");
            System.out.println("1. Add Mahasiswa");
            System.out.println("2. List Mahasiswa");
            System.out.println("3. Log Out");
            System.out.print("Choose Option (1-3): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Please choose (1-3): ");
                scanner.next();
            }

            Choice = scanner.nextInt();

            switch (Choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    System.out.println("Cyaa!");
                    break;
                default:
                    System.out.println("please choose it correctly :(");
            }
        } while (Choice != 3);
    }

    private static void menuStudent(Scanner scanner) {
        int choice;

        do {
            System.out.println("\n===== Menu Mahasiswa =====");
            System.out.println("1. List Book");
            System.out.println("2. Logout");
            System.out.print("Choose option (1-2): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayBooks();
                    break;
                case 2:
                    System.out.println("Done!");
                    break;
                default:
                    System.out.println("Please choose it correctly.");
            }
        } while (choice != 2);
    }

    private static void addStudent(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Input Name: ");
        String nama = scanner.nextLine();

        System.out.print("Input NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Input Fakultas: ");
        String fakultas = scanner.nextLine();

        System.out.print("Input Prodi: ");
        String prodi = scanner.nextLine();

        if (checkNim(nim)) {
            userStudent[numStudents] = new Student(nama, nim, fakultas, prodi);
            numStudents++;
            System.out.println("Data Mahasiswa sudah di tambahkan");
        } else {
            System.out.println("Your NIM is wrong");
        }
    }

    private static void displayStudents() {
        System.out.println("\n===== List Mahasiswa =====");

        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + "." + "("+ userStudent[i].nama +")" + "(" + userStudent[i].nim + ")");
        }
    }

    private static void displayBooks() {

    }
}

class Book {
    String id;
    String judul;
    String author;
    int jumlah;

    Book(String id, String judul, String author, int jumlah) {
        this.id = id;
        this.judul = judul;
        this.author = author;
        this.jumlah = jumlah;
    }
}

class Student {
    String nama;
    String nim;
    String fakultas;
    String prodi;

    Student(String nama, String nim, String fakultas, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.fakultas = fakultas;
        this.prodi = prodi;
    }
}