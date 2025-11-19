import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[][]survei = new int[2][6];

        System.out.println("Survey Kepuasan Pelanggan");
        System.out.println();
        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < survei[i].length; j++) {
                do {
                    System.out.print("Pertanyaan ke-" +(j + 1)+ " (1 - 5) : ");
                    survei[i][j] = sc.nextInt();
                } while (survei[i][j] < 1 || survei[i][j] > 5);
            }
        }
        System.out.println();
        System.out.println("Data Hasil Survei");
        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden "+(i+1)+ ": ");
            for (int j = 0; j < survei[i].length; j++) {
                System.out.println(survei[i][j]+ "");
            }
            System.out.println();
        }
        System.out.println("\n=== Rata-rata tiap responden ===");
        for (int i = 0; i < survei.length; i++) {
            double totalPerResponden = 0;
            for (int j = 0; j < survei[i].length; j++) {
                totalPerResponden += survei[i][j];
            }
            double avgResponden = totalPerResponden / survei[i].length;
            System.out.println("Responden "+(i+1)+" : "+String.format("%.1f", avgResponden));
        }

        System.out.println("\n=== Rata-rata tiap pertanyaan ===");
        for (int j = 0; j < survei[0].length; j++) {
            double totalPerPertanyaan = 0;
            for (int i = 0; i < survei.length; i++) {
                totalPerPertanyaan += survei[i][j];
            }
            double avgPertanyaan = totalPerPertanyaan / survei.length;
            System.out.println("Pertanyaan "+(j+1)+" : "+String.format("%.1f", avgPertanyaan));
        }

        System.out.println("\n=== Rata-rata keseluruhan survei ===");
        double totalKeseluruhan = 0;
        int jumlahData = survei.length * survei[0].length;
        for (int i = 0; i < survei.length; i++) {
            for (int j = 0; j < survei[i].length; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }
        double avgKeseluruhan = totalKeseluruhan / jumlahData;
        System.out.println("Nilai rata-rata keseluruhan: " + String.format("%.2f", avgKeseluruhan));
        sc.close();
    }
}
