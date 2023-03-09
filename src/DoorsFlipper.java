public class DoorsFlipper {
    private boolean opened[];
    public DoorsFlipper(int i) {
        opened = new boolean[i];
    }

    public boolean isClosed(int doorPosition) {
        return !opened[doorPosition-1];
    }

    public void flipAll() {
        for (int step = 1; step <= opened.length; step++)
            flipEvery(step);
    }

    private void flipEvery(int step) {
        for (int doorPosition = step -1; doorPosition < opened.length; doorPosition+= step)
            opened[doorPosition] = !opened[doorPosition];
    }
}
