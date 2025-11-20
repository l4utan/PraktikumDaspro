import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n=== Menu Bioskop ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                        System.out.println("Nomor baris/kolom tidak tersedia!");
                        continue;
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi oleh penonton lain!");
                        System.out.println("Silakan pilih kursi lain!");
                        continue;
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan!");
                    }

                    System.out.print("Input penonton lainya? (y/n): ");
                    next = sc.nextLine();
                    if (next.equalsIgnoreCase("y")) {
                        continue;

                    } else {
                        break;
                    }
                }
            } else if (pilihan == 2) {
                System.out.println("\n=== Daftar Penonton ===");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String namaPenonton = penonton[i][j];
                        if (namaPenonton == null) {
                            namaPenonton = "***";
                        }
                        System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + ": " + namaPenonton);
                    }
                }
            } else if (pilihan == 3) {
                System.out.println("Terima Kasih");
                break;
            } else {
                System.out.println("\nPilihan tidak valid");
                System.out.println("Pilih yang benar");
                continue;
            }
        }
    }
}
