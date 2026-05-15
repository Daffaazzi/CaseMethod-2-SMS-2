// Node untuk double linked list Pesanan
public class NodePesanan08 {
    Pesanan08 data;
    NodePesanan08 prev, next;

    // Node untuk double linked list pesanan
    public NodePesanan08(NodePesanan08 prev, Pesanan08 data, NodePesanan08 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}