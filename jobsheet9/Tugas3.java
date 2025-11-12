import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                         "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
        String[] historiPencarian = new String[7];
        String[] hasilPencarian = new String[7];
        int jumlahPencarian = 0;

        System.out.println("===== DAFTAR MENU KAFE =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.println("============================");
        System.out.println();
        
        String lanjut = "y";
        while (lanjut.equalsIgnoreCase("y")) {
            System.out.print("Masukkan nama makanan yang ingin dicari: ");
            String cariMakanan = sc.nextLine();
            
            historiPencarian[jumlahPencarian] = cariMakanan;
            
            boolean ditemukan = false;
            int posisi = -1;
            
            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(cariMakanan)) {
                    ditemukan = true;
                    posisi = i;
                    break;
                }
            }

            if (ditemukan) {
                hasilPencarian[jumlahPencarian] = "DITEMUKAN (posisi ke-" + (posisi + 1) + ")";
                System.out.println("Makanan \"" + cariMakanan + "\" tersedia di menu.");
            } else {
                hasilPencarian[jumlahPencarian] = "TIDAK DITEMUKAN";
                System.out.println("Maaf, makanan \"" + cariMakanan + "\" tidak ada di menu.");
            }
            jumlahPencarian++;
        
            System.out.println();
            System.out.print("Apakah ingin melakukan pencarian lagi? (y/n): ");
            lanjut = sc.nextLine();
            System.out.println();
        }
        
        
        if (jumlahPencarian > 0) {
            System.out.println("========================================");
            System.out.println("         HISTORI PENCARIAN");
            System.out.println("========================================");
            for (int i = 0; i < jumlahPencarian; i++) {
                System.out.println((i + 1) + ". Mencari: \"" + historiPencarian[i] + "\"");
                System.out.println("   Hasil: " + hasilPencarian[i]);
                System.out.println();
            }
            System.out.println("========================================");
            System.out.println("Total pencarian yang dilakukan: " + jumlahPencarian);
        } else {
            System.out.println("Tidak ada pencarian yang dilakukan.");
        }
    }
}
