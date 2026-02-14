
package pos;
public class Main {
    public static void main(String[] args) {

        Kasir kasir = new Kasir("admin");
        kasir.login("admin", "123");
        kasir.displayMenu();

        Produk p1 = new Produk(1, "Buku", 5000, 10);
        Produk p2 = new Produk(2, "Pulpen", 3000, 20);

        Transaksi transaksi = new Transaksi();
        transaksi.tambahProduk(p1);
        transaksi.tambahProduk(p2);

        transaksi.cetakStruk();
    }
}
