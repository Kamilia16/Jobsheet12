package Jobsheet12;

import java.util.Scanner;
public class Kafe16 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
    }
    public static int hitungTotalHarga16(int pilihanMenu, int banyakItem, boolean isMember, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (isMember) {
            hargaTotal = hargaTotal - (hargaTotal * 10 / 100);
        }

        if (kodePromo.equals("DISKON50")) {
            hargaTotal = hargaTotal - (hargaTotal * 50 / 100);
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
        } else {
            System.out.println("Kode promo tidak valid, tidak ada diskon tambahan.");
        }
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);
        System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        sc.nextLine(); // buang enter
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        int totalBayar = hitungTotalHarga16(pilihanMenu, banyakItem, true, kodePromo);
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalBayar);
        sc.close();
    }
}