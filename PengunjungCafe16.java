public class PengunjungCafe16 {
    static int hitungTotalBelanja(int... harga) {
        int total = 0;
        for (int h : harga) {
            total += h;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println("Total 1 barang: " + hitungTotalBelanja(15000));
        System.out.println("Total 3 barang: " + hitungTotalBelanja(15000, 20000, 10000));
        System.out.println("Total 5 barang: " + hitungTotalBelanja(15000, 20000, 10000, 5000, 25000));
    }
}