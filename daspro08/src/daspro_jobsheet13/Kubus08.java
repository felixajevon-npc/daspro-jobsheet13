package daspro_jobsheet13;

public class Kubus08 {

    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        int sisi = 5;

        int volume = hitungVolume(sisi);
        System.out.println("Volume Kubus dengan sisi " + sisi + " adalah: " + volume);

        int luasPermukaan = hitungLuasPermukaan(sisi);
        System.out.println("Luas Permukaan Kubus dengan sisi " + sisi + " adalah: " + luasPermukaan);
    }
}
