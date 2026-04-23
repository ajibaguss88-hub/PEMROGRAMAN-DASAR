import java.util.Scanner;
public class latihanMandiri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // //soal 1
        System.out.print("Masukkan jumlah data: ");
        int n = sc.nextInt();

        int[] angka = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            angka[i] = sc.nextInt();
        }

        int max = angka[0];

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }

        System.out.println("Nilai tertinggi: " + max);

        //soal 2
        // System.out.print("Masukkan jumlah data: ");
        // int n = sc.nextInt();

        // int[] angka = new int[n];

        // for (int i = 0; i < n; i++) {
        //     System.out.print("Masukkan angka ke-" + (i+1) + ": ");
        //     angka[i] = sc.nextInt();
        // }

        // System.out.print("Masukkan angka yang dicari: ");
        // int cari = sc.nextInt();

        // boolean ditemukan = false;

        // for (int i = 0; i < angka.length; i++) {
        //     if (angka[i] == cari) {
        //         ditemukan = true;
        //         break;
        //     }
        // }

        // if (ditemukan) {
        //     System.out.println("Angka ditemukan dalam array");
        // } else {
        //     System.out.println("Angka tidak ditemukan");
        // }

        //soal 3
        // System.out.print("Masukkan jumlah data: ");
        // int n = sc.nextInt();

        // int[] angka = new int[n];

        // for (int i = 0; i < n; i++) {
        //     System.out.print("Masukkan angka ke-" + i + ": ");
        //     angka[i] = sc.nextInt();
        // }

        // for (int i = angka.length - 1; i >= 0; i--) {
        //     System.out.print(angka[i] + " ");
        // }
    
        
    }
}
