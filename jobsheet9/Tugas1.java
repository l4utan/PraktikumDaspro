import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tinggi = 0, rendah = 100;
        int total = 0;

        System.out.print("Masukkan banyak nilai yang akan diinput: ");
        int nilai = sc.nextInt();

        int[] nilaiMhs = new int[nilai];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];

            if (nilaiMhs[i] > tinggi) {
                tinggi = nilaiMhs[i];
            }

            if (nilaiMhs[i] < rendah) {
                rendah = nilaiMhs[i];
            }
        }

        double rata2 = total/nilaiMhs.length;

        System.out.println("\nRata-rata nilai: " + rata2);
        System.out.println("Nilai tertinggi: " + tinggi);
        System.out.println("Nilai terendah: " + rendah);
        System.out.println("\n----- NILAI YANG TELAH DIMASUKKAN ----");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai ke-" + (i+1) + ": " + nilaiMhs[i]);
        }
        System.out.println("--------------------------------------");
    }
}
