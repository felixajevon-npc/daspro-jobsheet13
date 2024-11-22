package daspro_jobsheet13;

import java.util.Scanner;

public class Kafe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama Pelanggan: ");
        String namaPelanggan = sc.nextLine();
        System.out.print("Apakah Anda Member? (true/false): ");
        boolean isMember = sc.nextBoolean();
        sc.nextLine();
        System.out.print("Masukkan Kode Promo: ");
        String kodePromo = sc.nextLine();

        Menu();

        int totalKeseluruhan = 0;

        while (true) {
            System.out.print("\nMasukkan Nomor Menu Yang Anda Pesan (atau 0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();
            if (pilihanMenu == 0) {
                break;
            }

            System.out.print("Masukkan Jumlah Item Yang Ingin Dipesan: ");
            int banyakItem = sc.nextInt();

            int totalHargaPesanan = hitungTotalHarga08(pilihanMenu, banyakItem);
            totalKeseluruhan += totalHargaPesanan;

            System.out.println("Subtotal Pesanan: Rp " + totalHargaPesanan);
        }

        int totalDenganDiskon = hitungTotalHargaDenganDiskon(totalKeseluruhan, kodePromo);

        if (isMember) {
            totalDenganDiskon -= (totalDenganDiskon * 10 / 100);
            System.out.println("Diskon Member Diterapkan: 10%");
        }

        System.out.println("\n===== Total Akhir =====");
        System.out.println("Total Harga Sebelum Diskon: Rp " + totalKeseluruhan);
        System.out.println("Total Harga Setelah Diskon: Rp " + totalDenganDiskon);
        System.out.println("========================");
    }

    public static void Menu() {
        System.out.println("====== MENU RESTO KAFE ======");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==============================");
    }

    public static int hitungTotalHarga08(int pilihanMenu, int banyakItem) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static int hitungTotalHargaDenganDiskon(int totalHarga, String kodePromo) {
        if (kodePromo.equals("DISKON50")) {
            return totalHarga / 2;
        } else if (kodePromo.equals("DISKON30")) {
            return totalHarga - (totalHarga * 30 / 100);
        } else {
            System.out.println("Kode Promo Tidak Valid. Tidak Ada Diskon.");
            return totalHarga;
        }
    }

}
