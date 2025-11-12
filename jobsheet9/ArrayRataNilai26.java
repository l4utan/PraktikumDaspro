import java.util.Scanner;

public class ArrayRataNilai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs;
        double total = 0;
        double rata2;
        int mhsLulus = 0, mhsGagal = 0;
        int banyakMhs;
        double lulus = 0, gagal = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        banyakMhs = sc.nextInt();

        nilaiMhs = new int[banyakMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                mhsLulus ++;
                lulus += nilaiMhs[i];
            }else if (nilaiMhs[i] <= 70) {
                mhsGagal ++;
                gagal += nilaiMhs[i];
            }
        }
        
        double rataLulus = lulus/mhsLulus;
        double rataGagal = gagal/mhsGagal;

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataGagal);
    }
}
