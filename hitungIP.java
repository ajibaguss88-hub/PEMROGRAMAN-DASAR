import java.util.Scanner;
public class hitungIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //variabel
        Double IPS=0.0;

        //input IPS
        System.out.println("Masukkan IPS: ");
        IPS = scanner.nextDouble();

        //percabangan
        if (IPS >= 3.50) {
            System.out.println("SKS= 24");
        } else if (IPS <= 3.49 && IPS >= 3.00) {
            System.out.println("SKS= 22");
        } else if (IPS <= 2.99 && IPS >= 2.00) {
            System.out.println("SKS= 20");
        } else if (IPS <2.00) {
            System.out.println("SKS= 18");
        }
    }
}
