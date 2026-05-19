// Class untuk menyimpan data pesanan
public class Pesanan08 {
    int kodePesanan;
    String namaPesanan;
    int harga;
    String namaPembeli;
    int jumlah;

     // Konstruktor pesanan
    public Pesanan08(int kodePesanan, String namaPesanan, int harga, String namaPembeli, int jumlah) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.namaPembeli = namaPembeli;
        this.jumlah = jumlah;
    }

    //update quiz 2
    public int hitungTotal() {
        return harga * jumlah;
    }

    public void tampilLaporan() {
        System.out.println("================================");
        System.out.println(" Laporan Pesanan");
        System.out.println("================================");
        System.out.println("Kode Pesanan : " + kodePesanan);
        System.out.println("Nama Pesanan : " + namaPesanan);
        System.out.println("Harga : " + harga);
        System.out.println("Jumlah : " + jumlah + " item");
        System.out.println("Total : " + hitungTotal());
        System.out.println("Nama Pembeli : " + namaPembeli);
        System.out.println("================================");

    }
}
