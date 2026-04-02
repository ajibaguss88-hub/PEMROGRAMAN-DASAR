import java.util.Scanner;
public class hitungIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //variabel
        Double IPS=0.0;
        int SKS=0;

        //input IPS
        System.out.println("Masukkan IPS: ");
        IPS = scanner.nextDouble();

        //percabangan
        if (IPS <= 4 && IPS >= 3.50) {
            System.out.println("SKS yang dapat di ambil 24");
            SKS=24;
        } else if (IPS <= 3.49 && IPS >= 3.00) {
            System.out.println("SKS yang dapat diambil 22");
            SKS=22;
        } else if (IPS <= 2.99 && IPS >= 2.00) {
            System.out.println("SKS yang dapat diambil 20");
            SKS=20;
        } else if (IPS <2.00 && IPS >=0) {
            System.out.println("SKS yang dpaat diambil= 18");
            SKS=18;
        } else {
            System.out.println("IPS tidak valid!");
            System.out.println("Tidak ada SKS yang dapat diambil");
            SKS=0;
        }

        //switch case
        switch (SKS) {
            case 24:
                System.out.println("Baik Sekali");
                break;
            case 22:
                System.out.println("Baik");
                break;
            case 20:
                System.out.println("Cukup");
                break;
            case 18:
                System.out.println("Kurang");
                break;
        
            default:
                break;
        }
        
    }
}
