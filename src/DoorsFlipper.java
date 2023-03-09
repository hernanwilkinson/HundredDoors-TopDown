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
            for (int j = i; j < opened.length; j+=i+1)
                opened[j] = !opened[j];
        }
    }
}
