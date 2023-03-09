public class DoorsFlipper {
    private boolean opened[];
    public DoorsFlipper(int i) {
        opened = new boolean[i];
    }

    public boolean isClosed(int i) {
        return !opened[i-1];
    }

    public void flipAll() {
        for (int i = 0; i < opened.length; i++) {
            opened[i] = !opened[i];
        }
        for (int i = 1; i < opened.length; i++) {
            opened[i] = !opened[i];
        }
    }
}
