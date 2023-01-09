package BugFixPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleUtilitiesTest {

    @Test
    void isEquilateral() {
        assertFalse(TriangleUtilities.isEquilateral(2,3,4));
        assertFalse(TriangleUtilities.isEquilateral(2,3,3));
        assertTrue(TriangleUtilities.isEquilateral(4,4,4));
    }
}