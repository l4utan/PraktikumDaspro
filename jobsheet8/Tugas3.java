import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Jumlah cabang kafe: ");
        int cab = sc.nextInt();
        int totPel = 0, itemSemua = 0;
        
        System.out.println("\n=== Input Penjualan Per Cabang ===\n");
        for (int i = 1; i <= cab; i++) {
            System.out.println("--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int pel = sc.nextInt();
            int totItem = 0;
            totPel += pel;
            for (int j = 1; j <= pel; j++) {
                System.out.print("Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totItem += item;
            }
            
            System.out.println("Cabang " + i);
            System.out.println("- Pelanggan " + pel);
            System.out.println("- Item terjual " + totItem);
            System.out.println();
            itemSemua += totItem;
        }
        System.out.println("Total Seluruh Cabang:");
        System.out.println("Pelanggan: " + totPel + " orang");
        System.out.println("Item terjual: " + itemSemua + " item");
    }
}
