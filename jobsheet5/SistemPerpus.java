package jobsheet5;

import java.util.Scanner;

public class SistemPerpus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah kamu punya KTM? (true/false): ");
        boolean ktm = sc.nextBoolean();
        System.out.print("Apakah kamu udah registrasi online? (true/false): ");
        boolean regOnline = sc.nextBoolean();

        if (ktm || regOnline) {
            System.out.println("silahkan masuk");
        }else{
            System.out.println("Maaf, kamu tidak boleh masuk");
        }
    }
}
