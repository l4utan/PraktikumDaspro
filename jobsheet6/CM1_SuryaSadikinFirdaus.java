import java.util.Scanner;

public class CM1_SuryaSadikinFirdaus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DATA
        String nama, nim, huruf1, status1, huruf2, status2, statusSem;
        double nilai1, nilai2, rata2, uts1, uts2, uas1, uas2, tugas1, tugas2;

        //INPUT
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Masukkan nama kamu: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM kamu: ");
        nim = sc.nextLine();

        System.out.println("\n----- MATA KULIAH ALGORITMA DAN PEMOGRAMAN -----");
        System.out.print("Masukkan nilai UTS kamu   : ");
        uts1 = sc.nextDouble();
        System.out.print("Masukkan nilai UAS kamu   : ");
        uas1 = sc.nextDouble();
        System.out.print("Masukkan nilai TUGAS kamu : ");
        tugas1 = sc.nextDouble();

        System.out.println("\n----- MATA KULIAH STRUKTUR DATA -----");
        System.out.print("Masukkan nilai UTS kamu   : ");
        uts2 = sc.nextDouble();
        System.out.print("Masukkan nilai UAS kamu   : ");
        uas2 = sc.nextDouble();
        System.out.print("Masukkan nilai TUGAS kamu : ");
        tugas2 = sc.nextDouble();

        //ALGORITMA
        nilai1 = (uts1*0.3) + (uas1*0.4) + (tugas1*0.3);
        nilai2 = (uts2*0.3) + (uas2*0.4) + (tugas2*0.3);
        rata2 = (nilai1 + nilai2)/2;
        
        // KONVERSI NILAI KE HURUF MATKUL 1
        if (nilai1 <= 39 && nilai1 >= 0) {
            huruf1 = "E";
        }else if (nilai1 > 39 && nilai1 <= 50) {
            huruf1 = "D";
        }else if (nilai1 > 50 && nilai1 <= 60) {
            huruf1 = "C";
        }else if (nilai1 > 60 && nilai1 <= 65) {
            huruf1 = "C+";
        }else if (nilai1 > 65 && nilai1 <= 73) {
            huruf1 = "B";
        }else if(nilai1 > 73 && nilai1 <= 80) {
            huruf1 = "B+";
        }else if (nilai1 > 80 && nilai1 <= 100) {
            huruf1 = "A";
        }else{
            huruf1 = "ERROR";
        }

        // KONVERSI STATUS MATKUL 1
        if (nilai1 > 60 && nilai2 <= 100) {
            status1 = "LULUS";
        }else {
            status1 = "TIDAK LULUS";
        }

        // KONVERSI NILAI HURUF MATKUL 2
        if (nilai2 <= 39 && nilai2 >= 0) {
            huruf2 = "E";
        }else if (nilai2 > 39 && nilai2 >= 50) {
            huruf2 = "D";
        }else if (nilai2 > 50 && nilai2 >= 60) {
            huruf2 = "C";
        }else if (nilai2 > 60 && nilai2 >= 65) {
            huruf2 = "C+";
        }else if (nilai2 > 65 && nilai2 >= 73) {
            huruf2 = "B";
        }else if (nilai2 > 73 && nilai2 >= 80) {
            huruf2 = "B+";
        }else if (nilai2 > 80 && nilai2 <= 100) {
            huruf2 = "A";
        }else{
            huruf2 = "ERROR";
        }

        // KONVERSI STATUS MATKUL 2
        if (nilai2 > 60 && nilai2 <= 100) {
            status2 = "LULUS";
        }else {
            status2 = "TIDAK LULUS";
        }
        
        // ALGORITMA SEMESTER
        if (nilai1 > 60 && nilai2 > 60) {
            if (rata2 >= 70 && rata2 <= 100) {
                statusSem = "LULUS";
            }else{
                statusSem ="TIDAK LULUS (Rata-rata < 70)";
            }
        }else{
            statusSem = "TIDAK LULUS (Salah satu mata kuliah kamu tidak lulus)";
        }
        sc.close();

        //OUTPUT
        System.out.println("\n==================== HASIL PENILAIAN AKADEMIK ====================");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("\nMATA KULIAH \t\tUTS \tUAS \tTUGAS \tNILAI AKHIR \tNILAI HURUF \tSTATUS");
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("ALGORITMA PEMOGRAMAN \t%.1f \t%.1f \t%.1f \t%.2f \t\t%s \t\t%s\n", uts1, uas1, tugas1, nilai1, huruf1, status1);
        System.out.printf("STRUKTUR DATA \t\t%.1f \t%.1f \t%.1f \t%.2f \t\t%s \t\t%s\n", uts2, uas2, tugas2, nilai2, huruf2, status2);
        System.out.println("\nRata-rata Nilai Akhir \t: " + rata2);
        System.out.println("Status Semester \t: " + statusSem);
    }
}