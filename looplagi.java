import java.util.Scanner;
public class looplagi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //variabel
        int soal, input;
        

        //percabangan
        System.out.println("pilih soal (1-4): ");
        soal = scanner.nextInt();
        switch (soal) {
            case 1:
                // soal 1
                System.out.print("masukkan input: ");
                input = scanner.nextInt();
                for (int i = 0; i < input; i++) {
                    for (int j = 0; j < input; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 2:
                // soal 2
                System.out.print("masukkan input: ");
                input = scanner.nextInt();
                for (int i = 1; i <= input; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();
                break;

            case 3:
                //soal 3
                System.out.print("masukkan input: ");
                input = scanner.nextInt();
                for (int i = input; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();
                break;

            case 4:
                //soal 4
                System.out.print("masukkan input: ");
                input = scanner.nextInt();
                for (int i = 1; i <= input; i++) {
                    for (int j = 1; j <= input - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();
                break;

            default:
                System.out.println("pilih soal (1-4): ");
                soal = scanner.nextInt();
                break;
        }
    }
}
