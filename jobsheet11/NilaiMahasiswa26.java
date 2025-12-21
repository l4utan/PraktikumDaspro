import java.util.Scanner;

public class NilaiMahasiswa26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");

        int mahasiswa = sc.nextInt();
        int[] nilai = new int [mahasiswa];

        isianArray(nilai, sc);
        tampilArray(nilai);
        int total = hitTot(nilai);

        System.out.print("Total nilai para mahasiswa: " + total);
    }

    public static void isianArray(int[] nilai, Scanner sc) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }

    public static void tampilArray(int[] nilai) {
        System.out.println("\n===== DAFTAR NILAI =====");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }

    public static int hitTot(int[] nilai) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }

        return total;
    }
}
