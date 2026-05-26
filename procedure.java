import java.util.Scanner;

public class procedure {

    static Scanner sc = new Scanner(System.in);

    static void cetakGaris() {
        for (int i = 1; i <= 30; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    static void tampilkanMahasiswa(String nama, String nim, double ipk) {
        System.out.println("\n===== DATA MAHASISWA =====");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("IPK  : " + ipk);
        System.out.println("==========================");
    }

    static void cetakTabel(int angka) {

        System.out.println("\n================================");
        System.out.println("      TABEL PERKALIAN " + angka);
        System.out.println("================================");

        for (int i = 1; i <= 10; i++) {

            System.out.printf("| %2d | x | %2d | = | %3d |\n",
                    angka, i, (angka * i));

        }

        System.out.println("================================");
    }

    public static void main(String[] args) {

        cetakGaris();
        System.out.println("PROGRAM JAVA");
        cetakGaris();

        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();

        System.out.print("Masukkan NIM  : ");
        String nim = sc.nextLine();

        System.out.print("Masukkan IPK  : ");
        double ipk = sc.nextDouble();

        tampilkanMahasiswa(nama, nim, ipk);

        System.out.print("\nMasukkan angka perkalian : ");
        int angka = sc.nextInt();

        cetakTabel(angka);

        cetakGaris();
    }
}