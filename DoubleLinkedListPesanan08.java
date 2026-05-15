public class DoubleLinkedListPesanan08 {
    // Node untuk double linked list Pesanan
    NodePesanan08 head, tail;

    // Method untuk mengecek apakah daftar pesanan kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Method untuk menambahkan pesanan ke dalam daftar pesanan
    public void tambahPesanan(Pesanan08 pesanan) {
        NodePesanan08 newNode = new NodePesanan08(null, pesanan, null);

        // Jika daftar pesanan kosong, maka pesanan menjadi head dan tail
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Method untuk mengurutkan pesanan berdasarkan nama pesanan menggunakan bubble sort
    public void sortingNamaPesanan() {
        if (head == null) {
            return;
        }

        boolean tukar;

        // Melakukan bubble sort pada daftar pesanan
        do {
            tukar = false;
            NodePesanan08 current = head;

            // Membandingkan nama pesanan dengan nama pesanan berikutnya
            while (current.next != null) {

                // Jika nama pesanan saat ini lebih besar dari nama pesanan berikutnya, maka tukar posisi
                if (current.data.namaPesanan.compareToIgnoreCase(
                        current.next.data.namaPesanan) > 0) {

                    Pesanan08 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;

                    tukar = true;
                }

                // Pindah ke pesanan berikutnya
                current = current.next;
            }

        } while (tukar);
    }

    // Method untuk menampilkan daftar pesanan beserta total pendapatan
    public void tampilPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }

        sortingNamaPesanan();

        // Menampilkan daftar pesanan beserta total pendapatan
        NodePesanan08 temp = head;
        int total = 0;

        System.out.println("=== LAPORAN PESANAN ===");

        // Menampilkan daftar pesanan beserta total pendapatan
        while (temp != null) {
            System.out.println(
                    temp.data.kodePesanan + " | " +
                    temp.data.namaPesanan + " | " +
                    temp.data.harga + " | " +
                    temp.data.namaPembeli);

            total += temp.data.harga;
            temp = temp.next;
        }

        System.out.println("Total Pendapatan : " + total);
    }
}