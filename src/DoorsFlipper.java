public class DoorsFlipper {
    private boolean closed = true;
    public DoorsFlipper(int i) {

    }

    public boolean isClosed(int i) {
        return closed;
    }

    public void flipAll() {
        closed = false;
    }
}
