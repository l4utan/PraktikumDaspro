
import java.util.Scanner;

public class RekapPenjualanCafe26 {

    static Scanner sc = new Scanner(System.in);
    static int[][] penjualan;
    static String[] menu;
    static int jumlahMenu;
    static int jumlahHari;

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah menu: ");
        jumlahMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        jumlahHari = sc.nextInt();
        sc.nextLine();

        penjualan = new int[jumlahMenu][jumlahHari];
        menu = new String[jumlahMenu];

        inputData();
        tampilData();
        tampilMenuTertinggi();
        tampilRataRata();
    }

    public static void inputData() {
        System.out.println("\n===== INPUT DATA PENJUALAN KAFE =====");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();

            System.out.println("Masukkan data penjualan untuk " + menu[i] + ": ");
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
    }

    public static void tampilData() {
        System.out.println("\n===== REKAP PENJUALAN KAFE =====");
        System.out.println();

        System.out.print("Menu             ");
        for (int i = 0; i < jumlahHari; i++) {
            System.out.print("| Hari ke " + (i + 1) + " ");
        }
        System.out.println("|");

        System.out.print("-----------------");
        for (int i = 0; i < jumlahHari; i++) {
            System.out.print("|-------------");
        }
        System.out.println("|");

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.printf("%-17s", menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.printf("| %-12d", penjualan[i][j]);
            }
            System.out.println("|");
        }
        System.out.println();
    }

    public static void tampilMenuTertinggi() {
        System.out.println("\n=== MENU DENGAN PENJUALAN TERTINGGI ===");

        int indexTertinggi = 0;
        int totalTertinggi = 0;

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }

            if (total > totalTertinggi) {
                totalTertinggi = total;
                indexTertinggi = i;
            }
        }

        System.out.println("Menu dengan penjualan tertinggi: " + menu[indexTertinggi]);
        System.out.println("Total penjualan selama " + jumlahHari + " hari: " + totalTertinggi + " porsi");
        System.out.println();
    }

    public static void tampilRataRata() {
        System.out.println("\n=== RATA-RATA PENJUALAN SETIAP MENU ===");

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }

            double rataRata = (double) total / jumlahHari;
            System.out.printf("%s: %.2f porsi/hari\n", menu[i], rataRata);
        }
        System.out.println();
    }
}
