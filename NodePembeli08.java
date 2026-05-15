// node untuk pembeli
public class NodePembeli08 {
    Pembeli08 data;
    NodePembeli08 prev, next;

    // Node untuk double linked list pembeli
    public NodePembeli08(NodePembeli08 prev, Pembeli08 data, NodePembeli08 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}