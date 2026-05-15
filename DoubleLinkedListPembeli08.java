// Double Linked List untuk antrean pembeli
public class DoubleLinkedListPembeli08 {
    NodePembeli08 head, tail;
    int nomor = 1;

    // Method untuk mengecek apakah antrian kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Method untuk menambahkan pembeli ke dalam antrian
    public void tambahAntrian(String nama, String hp) {
        Pembeli08 pembeli = new Pembeli08(nomor++, nama, hp);
        NodePembeli08 newNode = new NodePembeli08(null, pembeli, null);

        // Jika antrian kosong, maka pembeli menjadi head dan tail
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Antrian berhasil ditambahkan!");
    }

    // Method untuk mencetak daftar antrian pembeli
    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        // Menampilkan antrian pembeli
        NodePembeli08 temp = head;

        System.out.println("=== DAFTAR ANTRIAN ===");

        while (temp != null) {
            System.out.println(
                    "No : " + temp.data.noAntrian +
                    " | Nama : " + temp.data.namaPembeli +
                    " | HP : " + temp.data.noHp);
            temp = temp.next;
        }
    }

    // Method untuk menghapus pembeli dari antrian 
    public Pembeli08 hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }

        // Menyimpan data pembeli yang akan dihapus
        Pembeli08 data = head.data;

        // Menghapus pembeli dari antrian
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return data;
    }
}