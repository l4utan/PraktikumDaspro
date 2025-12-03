import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [][] survei = new int[10][6];
        
        System.out.println("===== SURVEY PELAYANAN =====");
        System.out.println("Masukkan nilai 1-5");

        for (int i = 0; i < survei.length; i++) {
            System.out.println("Pelanggan ke-" + (i+1));
            double totalPerResponden = 0;

            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Nilai ke-" + (j+1) + ": ");
                survei[i][j] = sc.nextInt();
                if (survei[i][j] < 1 || survei[i][j] > 5){
                    System.out.println("Nilai tidak sesuai, ulang lagi");
                    j--;
                    continue;
                }else {
                    totalPerResponden += survei[i][j];
                }
            }
            System.out.println("Nilai rata-rata responden: " + totalPerResponden/6 + "\n");
        }

        System.out.println("\nNILAI RATA-RATA PER PERTANYAAN");
        for (int j = 0; j < 6; j++) {
            double totalPerPertanyaan = 0;
            for (int i = 0; i < 10; i++) {
                totalPerPertanyaan += survei[i][j];
            }

            System.out.println("Rata-rata Nilai Pertanyaan ke-" + (j+1) + ": " + totalPerPertanyaan/10);
        }

        System.out.println("\nNILAI KESELURUHAN");
        for (int i = 0; i < survei.length; i++) {
            System.out.print("Pelanggan ke-" + (i + 1) + ": ");

            for (int nilai : survei[i]) {
                System.out.print(nilai + " ");
            }

            System.out.println();
        }
    }
}
