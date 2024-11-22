package daspro_jobsheet13;

import java.util.Scanner;

public class IbuMariana08 {

    private static int[][] dataPenjualan = new int[5][7];
    private static String[] menuItems = { "Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan" };

    public static void main(String[] args) {
        dataMasuk();
        System.out.println("\n=== Data Penjualan ===");
        tampilanSeluruhData();
        System.out.println("\n=== Menu dengan Penjualan Tertinggi ===");
        penjualanTertinggi();
        System.out.println("\n=== Rata-rata Penjualan per Menu ===");
        rataRataPenjualan();
    }

    public static void dataMasuk() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan data penjualan:");

        dataPenjualan[0] = new int[] { 20, 20, 25, 20, 10, 60, 10 }; // Kopi
        dataPenjualan[1] = new int[] { 30, 80, 40, 10, 15, 20, 25 }; // Teh
        dataPenjualan[2] = new int[] { 5, 9, 20, 25, 10, 5, 45 }; // Es Degan
        dataPenjualan[3] = new int[] { 50, 8, 17, 18, 10, 30, 6 }; // Roti Bakar
        dataPenjualan[4] = new int[] { 15, 10, 16, 15, 10, 10, 55 }; // Gorengan
    }

    public static void tampilanSeluruhData() {
        System.out.println("Menu\t\tH1\tH2\tH3\tH4\tH5\tH6\tH7");
        for (int i = 0; i < dataPenjualan.length; i++) {
            System.out.print(menuItems[i] + "\t");
            if (menuItems[i].length() < 8)
                System.out.print("\t");
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                System.out.print(dataPenjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void penjualanTertinggi() {
        int maxTotal = 0;
        String maxMenu = "";

        for (int i = 0; i < dataPenjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                total += dataPenjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                maxMenu = menuItems[i];
            }
        }

        System.out.println("Menu dengan penjualan tertinggi: " + maxMenu);
        System.out.println("Total penjualan: " + maxTotal);
    }

    public static void rataRataPenjualan() {
        for (int i = 0; i < dataPenjualan.length; i++) {
            double total = 0;
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                total += dataPenjualan[i][j];
            }
            double average = total / dataPenjualan[i].length;
            System.out.printf("%s: %.2f\n", menuItems[i], average);
        }
    }
}
