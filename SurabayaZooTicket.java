import java.util.Scanner;

public class SurabayaZooTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] kategori = new String[100];
        int[] harga = new int[100];
        int[] jumlahBeli = new int[100];

        int jumlahData = 0;
        int pilihan;

        do {
            System.out.println("\n=== Pemesanan Tiket SurabayaZoo ===");
            System.out.println("1. Input Kategori dan Harga");
            System.out.println("2. Input Jumlah Beli");
            System.out.println("3. Lihat Total Bayar");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Berapa kategori: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Nama kategori: ");
                        kategori[jumlahData] = sc.nextLine();

                        System.out.print("Harga: ");
                        harga[jumlahData] = sc.nextInt();
                        sc.nextLine();

                        jumlahData++;
                    }
                    break;

                case 2:
                    if (jumlahData == 0) {
                        System.out.println("Isi data dulu di menu 1.");
                        break;
                    }

                    for (int i = 0; i < jumlahData; i++) {
                        System.out.println(kategori[i] + " | Harga: " + harga[i]);
                        System.out.print("Jumlah beli: ");
                        jumlahBeli[i] = sc.nextInt();
                    }
                    break;

                case 3:
                    int total = 0;
                    int totalTiket = 0;

                    System.out.println("\n=== Detail ===");
                    for (int i = 0; i < jumlahData; i++) {
                        int subtotal = harga[i] * jumlahBeli[i];
                        total += subtotal;
                        totalTiket += jumlahBeli[i];

                        System.out.println(kategori[i] +
                                " | " + harga[i] +
                                " x " + jumlahBeli[i] +
                                " = " + subtotal);
                    }

                    double diskon = 0;

                    if (totalTiket >= 4) {
                        diskon = 0.20 * total;
                        System.out.println("Diskon keluarga 20%: -" + (int)diskon);
                    }

                    double totalBayar = total - diskon;

                    System.out.println("Total sebelum diskon: " + total);
                    System.out.println("Total bayar: " + (int)totalBayar);
                    break;

                case 4:
                    System.out.println("Keluar program.");
                    break;

                default:
                    System.out.println("Pilihan salah.");
            }

        } while (pilihan != 4);

        sc.close();
    }
}