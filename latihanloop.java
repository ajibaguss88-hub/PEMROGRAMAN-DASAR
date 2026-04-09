import java.util.Scanner;
public class latihanloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String[] data = new String[x];
        for (int i = 0;i<x ; i++) {
            System.out.println("masukkan nama barang: ");
            String nama = scanner.nextLine();
            nama = scanner.nextLine();
            System.out.println("masukkan jumlah barang: ");
            int jumlah = scanner.nextInt();
            System.out.println("masukkan harga satuan barang: ");
            int harga = scanner.nextInt();
            int total = harga*jumlah;

            System.out.println("total belanjaan: ");
            System.out.println(total);
            data[i] = nama+jumlah+harga+total;

            
        }

    }
}
