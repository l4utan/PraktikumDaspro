import java.util.Scanner;
public class NilaiKelompok26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 1, j, nilai, kelompok = 0;
        float totalNilai, rataNilai, tertinggi = 0;

        while (i <= 6) {
            System.out.println("Kelompok " + i);
            
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;    
            }
            rataNilai = totalNilai/5;
            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);

            if (rataNilai >= tertinggi) {
                tertinggi = rataNilai;
                kelompok = i;
            }
            i++;
        }
        System.out.println("Kelompok dengan nilai tertinggi = " + kelompok);
        System.out.println("Nilai tertinggi = " + tertinggi);
    }
}
