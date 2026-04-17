import java.util.Scanner;
public class kuis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0, hari= 1;

        while (true) {
            System.out.print("masukkan jumlah pengunjung di hari ke-" +hari+": ");
            int pengunjung = sc.nextInt();
            hari++;

            if (pengunjung == -1) {
                break;
            }
            total += pengunjung;
        }
        System.out.println("total pengunjung di hari ke-"+(hari-2)+": "+total);
    }
}
