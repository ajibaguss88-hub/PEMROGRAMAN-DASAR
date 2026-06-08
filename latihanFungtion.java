import java.util.Scanner;
public class latihanFungtion {
    static Scanner sc = new Scanner(System.in);

    // static int hitungLuas(int p, int l) {
    //     int L = p*l;
    //     return L;
    // }

    // public static void main(String[] args) {
    //     System.out.print("masukkan panjang: ");
    //     int p = sc.nextInt();
    //     System.out.print("masukkan lebar: ");
    //     int l = sc.nextInt();
    //     System.out.print("luas= " + hitungLuas(p, l));
    // }

    // static boolean cekGanjil(int angka) {
    //     return angka % 2 != 0;
    // }

    // public static void main(String[] args) {
    //     System.out.println("true = ganjil");
    //     System.out.println("false = genap");
    //     System.out.println("contoh:");
    //     System.out.println("5 = " + cekGanjil(5));
    //     System.out.println("8 = " + cekGanjil(8));
    //     System.out.println("3 = " + cekGanjil(3));
    //     System.out.print("masukkan angkamu: ");
    //     int angka = sc.nextInt();
    //     System.out.print(cekGanjil(angka));
    // }

    static int getNilaiMax(int [] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[1] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("contoh:");
        System.out.println("nilai: 12, 74, 23, 78, 41");
        int[] data = {12, 74, 23, 78, 41};
        System.out.println("nilai terbesar: " + getNilaiMax(data));

        System.out.print("masukkan jumlah data: ");
        int jumlah = sc.nextInt();

        int[] datauser = new int[jumlah];

        for (int i = 0; i < datauser.length; i++) {
            System.out.print("masukkan nilai ke-" + (i+1) + ": ");
            datauser[i] = sc.nextInt();
        }

        System.out.print("nilai tertinggi: " + getNilaiMax(datauser));
    }
}
