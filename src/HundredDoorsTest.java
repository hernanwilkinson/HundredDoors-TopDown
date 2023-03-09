import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HundredDoorsTest {
    @Test
    public void doorsStartClosed() {
        var doorsFlipper = new DoorsFlipper(1);

        assertTrue(doorsFlipper.isClosed(1));
    }

    @Test
    public void shouldOpenFirstDoorWhenFlippingOneDoor() {
        var doorsFlipper = new DoorsFlipper(1);
        doorsFlipper.flipAll();

        assertFalse(doorsFlipper.isClosed(1));
    }

    @Test
    public void shouldPassThroughDoorsTheDoorsSize() {
        var doorsFlipper = new DoorsFlipper(2);
        doorsFlipper.flipAll();

        assertFalse(doorsFlipper.isClosed(1));
        assertTrue(doorsFlipper.isClosed(2));
    }
}