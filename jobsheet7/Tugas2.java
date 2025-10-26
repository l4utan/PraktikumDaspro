import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int jenis, durasi, total = 0;

       do {
           System.out.println("Masukkan jenis kendaran");
           System.out.println("1. Mobil");
           System.out.println("2. Motor");
           System.out.println("0. Keluar");
           System.out.print("Masukkan angka: ");
           jenis = sc.nextInt();

           if (jenis == 1 || jenis == 2) {
            System.out.print("Berapa lama kamu parkir?: ");
            durasi = sc.nextInt();
            if (durasi > 5) {
                total += 12500;
            }else if (jenis == 1) {
                total += durasi * 3000;
            }else if (jenis == 2) {
                total += durasi * 2000;
            }
           }
        
       } while (jenis != 0);
       System.out.println("Total parkir kamu: Rp." + total);
       
    }   
}
