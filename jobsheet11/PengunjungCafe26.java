public class PengunjungCafe26 {
    static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar nama pengunjung:");
        for (String pen : namaPengunjung) {
            System.out.println("- " + pen);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");

    }
}
