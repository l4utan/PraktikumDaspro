import java.util.Scanner;

public class Kafe26 {

    public static void Menu(String namaPelanggan) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,0000");
        System.out.println("2. Cappucino - Rp 20,0000");
        System.out.println("3. Latte - Rp 22,0000");
        System.out.println("4. Teh Tarik - Rp 12,0000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
        System.out.println("Ketik 0 jika ingin berhenti memesan");
    }

    public static double[] hitungTotalHarga26(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        double diskon = 0;

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kamu mendapatkan tambahan diskon sebesar 50%");
            diskon = 0.5;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kamu mendapatkan tambahan diskon sebesar 30%");
            diskon = 0.3;
        } else if(!kodePromo.isEmpty()){
            System.out.println("Kode Invalid!");
        }
        
        double harga = hargaItems[pilihanMenu-1] * banyakItem;
        double hargaDiskon = harga * diskon;
        double hargaTotal = harga - hargaDiskon;
        return new double[] {hargaTotal, hargaDiskon, harga};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nama kamu: ");
        String namaPelanggan = sc.nextLine();

        Menu(namaPelanggan);
        int lanjut = 0;
        double grandTot = 0;
        double totalDiskon = 0;
        double totalSebelumDiskon = 0;
        System.out.print("Masukkan kode diskon yang anda punya: ");
        String kodePromo = sc.nextLine();

        do {
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            double[] hasil = hitungTotalHarga26(pilihanMenu, banyakItem, kodePromo);

            grandTot += hasil[0];
            totalDiskon += hasil[1];
            totalSebelumDiskon += hasil[2];

            sc.nextLine();
            System.out.print("Tekan 0 jika ingin keluar: ");
            lanjut = sc.nextInt();
            sc.nextLine();
            
        } while (lanjut != 0);
        
        


        System.out.println("Total harga sebelum diskon: Rp." + totalSebelumDiskon);
        System.out.println("Total diskon yang anda dapat: Rp." + totalDiskon);
        System.out.println("Total harga yang anda pesan: Rp." + grandTot);
    }
}
