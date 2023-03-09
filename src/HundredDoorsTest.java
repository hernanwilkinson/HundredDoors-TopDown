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

    @Test
    public void shouldPassThroughDoorsWithStep() {
        var doorsFlipper = new DoorsFlipper(4);
        doorsFlipper.flipAll();

        assertFalse(doorsFlipper.isClosed(1));
        assertTrue(doorsFlipper.isClosed(2));
        assertTrue(doorsFlipper.isClosed(3));
        assertFalse(doorsFlipper.isClosed(4));
    }

    @Test
    public void numberOfDoorsMustBeStrictlyPositive() {
        var exception = assertThrows(
                IllegalArgumentException.class,
                ()->new DoorsFlipper(0));
        assertEquals(DoorsFlipper.INVALID_NUMBER_OF_DOORS,exception.getMessage());
    }

}