public class DoorsFlipper {
    public static final String INVALID_NUMBER_OF_DOORS = "Number of doors must be strictly positive";
    public static final String INVALID_DOOR_POSITION = "Door position must be between 1 and doors size";
    private boolean opened[];
    public DoorsFlipper(int numberOfDoors) {
        assertValidNumberOfDoors(numberOfDoors);

        opened = new boolean[numberOfDoors];
    }

    private void assertValidNumberOfDoors(int numberOfDoors) {
        if(numberOfDoors <1) throw new IllegalArgumentException(INVALID_NUMBER_OF_DOORS);
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
