import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, totKuadrat;
        System.out.print("Masukkan nilai n = ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            totKuadrat = 0;
            System.out.print("n = " + i + " -> jumlah kuadrat = ");
            if (i == 1) {
                System.out.println("1");
            } else if (i > 1) {
                for (int j = 1; j <=i; j++) {
                    totKuadrat += j*j;
                    System.out.print(j*j);
                    if (j < i) {
                        System.out.print(" + ");
                    }
                }
                System.out.println(" = " + totKuadrat);
            }
        }
    }
}
