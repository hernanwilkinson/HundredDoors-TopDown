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
        for (int doorPosition = step -1; doorPosition < opened.length; doorPosition+= step)
            opened[doorPosition] = !opened[doorPosition];
    }
}
