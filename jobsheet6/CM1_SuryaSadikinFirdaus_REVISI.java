import java.util.Scanner;

public class CM1_SuryaSadikinFirdaus_REVISI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // DATA
        String nama, nim, huruf1, status1, huruf2, status2, statusSem, akreditasi, beasiswa;
        double nilai1, nilai2, rata2, uts1, uts2, uas1, uas2, tugas1, tugas2;

        // INPUT BIODATA
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Masukkan nama kamu: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM kamu: ");
        nim = sc.nextLine();
        
        // INPUT NILAI SEKALIGUS VALIDASI2
        System.out.println("\n----- MATA KULIAH ALGORITMA DAN PEMOGRAMAN -----");
        System.out.print("Masukkan nilai UTS kamu   : ");
        uts1 = sc.nextDouble();
        if (uts1 < 0 || uts1 > 100) {
            System.out.println("\nERROR, nilai kamu harus dari rentang 0-100");
            sc.close();
            return;
        }
        System.out.print("Masukkan nilai UAS kamu   : ");
        uas1 = sc.nextDouble();
        if (uas1 < 0 || uas1 > 100) {
            System.out.println("\nERROR, nilai kamu harus dari rentang 0-100");
            sc.close();
            return;
        }
        System.out.print("Masukkan nilai TUGAS kamu : ");
        tugas1 = sc.nextDouble();
        if (tugas1 < 0 || tugas1 > 100) {
            System.out.println("\nERROR, nilai kamu harus dari rentang 0-100");
            sc.close();
            return;
        }
        
        System.out.println("\n----- MATA KULIAH STRUKTUR DATA -----");
        System.out.print("Masukkan nilai UTS kamu   : ");
        uts2 = sc.nextDouble();
        if (uts2 < 0 || uts2 > 100) {
            System.out.println("\nERROR, nilai kamu harus dari rentang 0-100");
            sc.close();
            return;
        }
        System.out.print("Masukkan nilai UAS kamu   : ");
        uas2 = sc.nextDouble();
        if (uas2 < 0 || uas2 > 100) {
            System.out.println("\nERROR, nilai kamu harus dari rentang 0-100");
            sc.close();
            return;
        }
        System.out.print("Masukkan nilai TUGAS kamu : ");
        tugas2 = sc.nextDouble();
        if (tugas2 < 0 || tugas2 > 100) {
            System.out.println("\nERROR, nilai kamu harus dari rentang 0-100");
            sc.close();
            return;
        }
        
        // ALGORITMA
        nilai1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        nilai2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);
        rata2 = (nilai1 + nilai2) / 2;

        // KONVERSI NILAI KE HURUF MATKUL 1
        if (nilai1 <= 39 && nilai1 >= 0) {
            huruf1 = "E";
        } else if (nilai1 > 39 && nilai1 <= 50) {
            huruf1 = "D";
        } else if (nilai1 > 50 && nilai1 <= 60) {
            huruf1 = "C";
        } else if (nilai1 > 60 && nilai1 <= 65) {
            huruf1 = "C+";
        } else if (nilai1 > 65 && nilai1 <= 73) {
            huruf1 = "B";
        } else if (nilai1 > 73 && nilai1 <= 80) {
            huruf1 = "B+";
        } else {
            huruf1 = "A";
        }

        // KONVERSI STATUS MATKUL 1
        if (nilai1 >= 60 && nilai1 <= 100) {
            status1 = "LULUS";
        } else {
            status1 = "TIDAK LULUS";
        }

        // KONVERSI NILAI HURUF MATKUL 2
        if (nilai2 <= 39 && nilai2 >= 0) {
            huruf2 = "E";
        } else if (nilai2 > 39 && nilai2 <= 50) {
            huruf2 = "D";
        } else if (nilai2 > 50 && nilai2 <= 60) {
            huruf2 = "C";
        } else if (nilai2 > 60 && nilai2 <= 65) {
            huruf2 = "C+";
        } else if (nilai2 > 65 && nilai2 <= 73) {
            huruf2 = "B";
        } else if (nilai2 > 73 && nilai2 <= 80) {
            huruf2 = "B+";
        } else {
            huruf2 = "A";
        }

        // KONVERSI STATUS MATKUL 2
        if (nilai2 >= 60 && nilai2 <= 100) {
            status2 = "LULUS";
        } else {
            status2 = "TIDAK LULUS";
        }

        // ALGORITMA SEMESTER
        if (nilai1 >= 60 && nilai2 >= 60) {
            if (rata2 >= 70 && rata2 <= 100) {
                statusSem = "LULUS";
            } else {
                statusSem = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSem = "TIDAK LULUS (Salah satu mata kuliah kamu tidak lulus)";
        }

        if (rata2 >= 85) {
            akreditasi = "Cumlaude";
            beasiswa = "Berhak";
        } else if (rata2 >= 70 && rata2 < 85) {
            akreditasi = "Baik";
            beasiswa = "Tidak Berhak";
        } else {
            akreditasi = "Perlu perbaikan";
            beasiswa = "Tidak Berhak";
        }
        
        sc.close();
        // OUTPUT
        System.out.println("\n==================== HASIL PENILAIAN AKADEMIK ====================");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("\nMATA KULIAH \t\tUTS \tUAS \tTUGAS \tNILAI AKHIR \tNILAI HURUF \tSTATUS");
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("ALGORITMA PEMOGRAMAN \t%.1f \t%.1f \t%.1f \t%.2f \t\t%s \t\t%s\n", uts1, uas1, tugas1, nilai1, huruf1, status1);
        System.out.printf("STRUKTUR DATA \t\t%.1f \t%.1f \t%.1f \t%.2f \t\t%s \t\t%s\n", uts2, uas2, tugas2, nilai2, huruf2, status2);
        System.out.println("\nRata-rata Nilai Akhir \t: " + rata2);
        System.out.println("Status Semester \t: " + statusSem);
        System.out.print("\nAkreditasi                      : " + akreditasi);
        System.out.print("\nBerhak mendapatkan beasiswa     : " + beasiswa);
    }
}