//import class
import java.util.Scanner;
public class latihanScanner {
    public static void main(String[] args) {
        //delarasi scanner
        Scanner scanner = new Scanner(System.in);

        //input
        String namabarang ="";
        int harga=0, jumlah=0, beli=0, total=0;

        //teks input
        System.out.print("Nama Barang: ");
        namabarang = scanner.nextLine();
        System.out.print("Harga: ");
        harga = scanner.nextInt();
        System.out.print("Jumlah Barang: ");
        jumlah = scanner.nextInt();

        //output
        System.out.println();
        total = harga*jumlah;
        System.out.println("Total Bayar"+total);

        //close scanner
        scanner.close();
    }
}