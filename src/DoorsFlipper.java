public class DoorsFlipper {
    private boolean opened[];
    public DoorsFlipper(int i) {
        opened = new boolean[i];
    }

    public boolean isClosed(int i) {
        return !opened[i-1];
    }

    public void flipAll() {
        for (int i = 1; i <= opened.length; i++) {
            flipEvery(i);
        }
    }

    private void flipEvery(int step) {
        for (int j = step -1; j < opened.length; j+= step)
            opened[j] = !opened[j];
    }
}
