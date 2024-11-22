package daspro_jobsheet13;

import java.util.Scanner;
import java.util.ArrayList;

public class ModifikasiKodeNomor3 {

    private static ArrayList<String> menuItems = new ArrayList<>();
    private static ArrayList<int[]> dataPenjualan = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

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
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            menuItems.add(scanner.nextLine());
        }

        for (int i = 0; i < jumlahMenu; i++) {
            int[] penjualanPerMenu = new int[jumlahHari];
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Masukkan penjualan " + menuItems.get(i) + " pada hari ke-" + (j + 1) + ": ");
                penjualanPerMenu[j] = scanner.nextInt();
            }
            dataPenjualan.add(penjualanPerMenu);
        }
    }

    public static void tampilanSeluruhData() {
        System.out.println("Menu\t\t" + "Hari-Hari");
        for (int i = 0; i < dataPenjualan.size(); i++) {
            System.out.print(menuItems.get(i) + "\t");
            for (int j = 0; j < dataPenjualan.get(i).length; j++) {
                System.out.print(dataPenjualan.get(i)[j] + "\t");
            }
            System.out.println();
        }
    }

    public static void penjualanTertinggi() {
        int maxTotal = 0;
        String maxMenu = "";

        for (int i = 0; i < dataPenjualan.size(); i++) {
            int total = 0;
            for (int j = 0; j < dataPenjualan.get(i).length; j++) {
                total += dataPenjualan.get(i)[j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                maxMenu = menuItems.get(i);
            }
        }

        System.out.println("Menu dengan penjualan tertinggi: " + maxMenu);
        System.out.println("Total penjualan: " + maxTotal);
    }

    public static void rataRataPenjualan() {
        for (int i = 0; i < dataPenjualan.size(); i++) {
            double total = 0;
            for (int j = 0; j < dataPenjualan.get(i).length; j++) {
                total += dataPenjualan.get(i)[j];
            }
            double average = total / dataPenjualan.get(i).length;
            System.out.printf("%s: %.2f\n", menuItems.get(i), average);
        }
    }
}
