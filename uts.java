import java.util.Scanner;
public class uts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlah;

        do {
            System.out.print("masukkan jumlah data nilai yang ingin di input: ");
            jumlah = sc.nextInt();

            if (jumlah < 5){
                System.out.print("jumlah data kurang!! (minimal 5 data)");
            }
        } while (jumlah < 5);

        int[] data = new int[jumlah];

        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan nilai data ke-" + (i + 1) + ": ");
            data[i] = sc.nextInt();
        }

        int tertinggi = data[0];
        int indeks = 0;


        for (int i = 1; i < data.length; i++) {
            if (data[i] > tertinggi) {
                tertinggi = data[i];
                indeks = i;
            }
        }

        System.out.println("\nNilai tertinggi = " + tertinggi);
        System.out.println("Berada pada indeks array ke:");

        for (int i = 0; i<data.length; i++){
            if (data[i] == tertinggi){
                System.out.println("berada pada data nilai ke-" + (i+1) + " dan indeks array ke-" + i);
            }
        }
    }
}
