import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.print("Masukkan jumlah pesanan: ");
        int order = sc.nextInt();
        
        String[] arrOrder = new String[order];
        int[] harga = new int[order];
        
        System.out.println();
        for (int i = 0; i < arrOrder.length; i++) {
            sc.nextLine();
            System.out.println("Pesanan Ke-" + (i+1));
            System.out.print("Masukkan nama pesanan: ");
            arrOrder[i] = sc.nextLine();
            System.out.print("Masukkan harga: ");
            harga[i] = sc.nextInt();
            System.out.println();

            total += harga[i];
        }

        System.out.println("\n----------LIST PESANAN----------");
        for (int i = 0; i < arrOrder.length; i++) {
            System.out.printf("Nama Makanan: %s\tHarga: Rp.%,d\n", arrOrder[i], harga[i]);
        }
        System.out.println();
        System.out.printf("Total biaya: Rp. %,d\n", total);
        System.out.println("-------------------------------------------");
    }
}
