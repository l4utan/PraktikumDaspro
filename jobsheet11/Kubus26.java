import java.util.Scanner;

public class Kubus26 {
    public static void hitungVol(int sisi) {
        int vol = sisi*sisi*sisi;

        System.out.println("Volume kubus adalah " + vol);
    }

    public static void hitungLuas(int sisi) {
        int luas = sisi*sisi;
        
        System.out.println("Luas permukaan kubus adalah " + luas);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = sc.nextInt();

        hitungVol(sisi);
        hitungLuas(sisi);

        sc.close();
    }
}
