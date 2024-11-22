package daspro_jobsheet13;

import java.util.Scanner;

public class Percobaan6_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan Panjang : ");
        p = sc.nextInt();
        System.out.print("Masukkan Lebar : ");
        l = sc.nextInt();
        System.out.print("Masukkan Tinggi : ");
        t = sc.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang Adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok Adalah " + vol);
    }

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
}
