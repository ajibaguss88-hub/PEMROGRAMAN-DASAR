import java.util.Scanner;
public class latihanIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //variabel
        String namabarang="";
        double jumlah=0.0, harga=0.0, total=0.0, diskon=0.0, grandtotal=0.0;

        //daftar member
        String nama="", alamat="", nohp="";
        String jawab="";

        System.out.println("Join Member? (Y/N)");
        jawab = scanner.nextLine();

        //cek jawaban
        if (jawab.equalsIgnoreCase("Y")) {
            System.out.print("Nama Anda: ");
            nama = scanner.nextLine();
            System.out.print("Alamat Anda: ");
            alamat = scanner.nextLine();
            System.out.println("Nomor HP: ");
            nohp = scanner.nextLine();

            //konfirm
            System.out.println("Ingin Lanjut Berbelanja? (Y/T)");
            jawab = scanner.nextLine();
            if (jawab.equalsIgnoreCase("Y")) {
                System.out.print("Nama Barang: ");
                namabarang = scanner.nextLine();
                System.out.print("Harga: ");
                harga = scanner.nextDouble();
                System.out.print("Jumlah Barang: ");
                jumlah = scanner.nextDouble();
                
                //output
                System.out.println();
                total= harga*jumlah;
                System.out.print("Total: "+total);

                //diskon
                if (total > 100000.0) {
                    System.out.println();
                    System.out.println("Selamat anda mendapat diskon 5% dengan tambahan diskon member 2%");
                    diskon = total*0.07;

                } else if (total > 300000.0) {
                    System.out.println("Selamat anda mendapat diskon 10% dengan tambahan diskon member 2%");
                    diskon = total*0.12;
                }
                
                grandtotal=total-diskon;
                System.out.println("Total yang harus dibayar:"+grandtotal);
            }

        } else {
            System.out.println("Happy Shopping :)");

            System.out.println();
            System.out.print("Nama Barang: ");
                namabarang = scanner.nextLine();
                System.out.print("Harga: ");
                harga = scanner.nextDouble();
                System.out.print("Jumlah Barang: ");
                jumlah = scanner.nextDouble();
                
                //output
                System.out.println();
                total= harga*jumlah;
                System.out.print("Total: "+total);

                //diskon
                if (total > 100000.0) {
                    System.out.println();
                    System.out.println("Selamat anda mendapat diskon 5%");
                    diskon = total*0.05;

                } else if (total > 300000.0) {
                    System.out.println("Selamat anda mendapat diskon 10%");
                    diskon = total*0.10;
                }
                
                //grand total
                System.out.println();
                grandtotal=total-diskon;
                System.out.println("Total yang harus dibayar:"+grandtotal);
        }

        
    }
}
