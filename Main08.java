import java.util.Scanner;

// Main class untuk menjalankan program
public class Main08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Membuat objek antrian pembeli dan daftar pesanan
        DoubleLinkedListPembeli08 antrian = new DoubleLinkedListPembeli08();
        DoubleLinkedListPesanan08 pesanan = new DoubleLinkedListPesanan08();

        int pilih;

        // Menu utama untuk mengelola antrian pembeli dan pesanan
        do {
            System.out.println("\n===== ROYAL DELISH =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Input Pesanan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            // Menangani pilihan menu yang dipilih oleh pengguna
            switch (pilih) {

                // Menu untuk menambahkan pembeli ke dalam antrian
                case 1:

                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP : ");
                    String hp = sc.nextLine();

                    antrian.tambahAntrian(nama, hp);

                    break;

                    // Menu untuk mencetak daftar antrian pembeli
                case 2:

                    antrian.cetakAntrian();

                    break;

                    // Menu untuk menghapus pembeli dari antrian dan memasukkan pesanan
                case 3:

                    Pembeli08 p = antrian.hapusAntrian();

                    if (p != null) {

                        System.out.println("Pembeli dipanggil:");
                        System.out.println(p.noAntrian + " - " + p.namaPembeli);

                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();

                        System.out.print("Harga : ");
                        int harga = sc.nextInt();

                        System.out.print("Jumlah : ");
                        int jumlah = sc.nextInt();  //update quiz 2
                        sc.nextLine();
                        
                        // Membuat objek pesanan dan menambahkannya ke dalam daftar pesanan
                        Pesanan08 ps = new Pesanan08(
                            kode,
                            namaPesanan,
                            harga,
                            p.namaPembeli,

                            jumlah); // update quiz 2

                        pesanan.tambahPesanan(ps);

                        System.out.println("Pesanan berhasil ditambahkan");
                    }

                    break;

                    // Menu untuk menampilkan daftar pesanan beserta total pendapatan
                case 4:

                    pesanan.tampilPesanan();

                    break;

                    // Menu untuk keluar dari program
                case 5:

                    System.out.println("Program selesai");

                    break;

                default:
                    System.out.println("Menu tidak valid");
            }

        } while (pilih != 5);
    }
}