package BugFixPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleUtilitiesTest {

    @Test
    void getArea() {
        int height= 2;
        int width = 6;
        int expected = 12;
        int actual= RectangleUtilities.getArea(height,width);
    }

    @Test
    void getPerimeter() {
        int height=10;
        int width=20;
        int expected =60;
        int actual = RectangleUtilities.getPerimeter(height,width);
        assertEquals(expected,actual);
    }
}