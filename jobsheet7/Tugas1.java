import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totHarga = 0, hargaAkhir;
        int tiket, totTiket = 0;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (Ketik 'batal' jika ingin keluar / membatalkan): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("transaksi dibatalkan");
                break;
            }
            System.out.print("Mau beli berapa tiket? (ketik menggunakan angka): ");
            tiket = sc.nextInt();
            double harga = 50000;

            if (tiket > 4 && tiket <= 10) {
                harga *= tiket;
                hargaAkhir = harga - (harga * 0.1);
                totTiket += tiket;
                totHarga += hargaAkhir;
                System.out.println("Tiket yang dibeli: " + tiket);
                System.out.println("Total Pembayaran:\n " + hargaAkhir);
            }else if (tiket > 10) {
                harga *= tiket;
                hargaAkhir = harga - (harga * 0.15);
                totTiket += tiket;
                totHarga += hargaAkhir;
                System.out.println("Tiket yang dibeli: " + tiket);
                System.out.println("Total Pembayaran:\n " + hargaAkhir);
            }else if (tiket < 0) {
                System.out.println("Angka tidak valid. Ulang");
                continue;
            }else {
                harga *= tiket;
                hargaAkhir = harga;
                totTiket += tiket;
                totHarga += hargaAkhir;
                System.out.println("Tiket yang dibeli: " + tiket);
                System.out.println("Total Pembayaran:\n " + hargaAkhir);
            }
            sc.nextLine();

        } while (true);
        System.out.println("Total penjualan tiket: " + totTiket);
        System.out.println("Total pendapatan: " + totHarga);
        
    }
}
