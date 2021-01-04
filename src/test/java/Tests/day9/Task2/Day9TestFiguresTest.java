package Tests.day9.Task2;

import Tests.AbstractTest;
import day9.Task2.Circle;
import day9.Task2.Figure;
import day9.Task2.Rectangle;
import day9.Task2.TestFigures;
import day9.Task2.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day9TestFiguresTest extends AbstractTest {

    Figure[] f;

    @BeforeEach
    public void init() {
        f = new Figure[]{
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 20, 30, 10),
                new Triangle("Red", 20, 15, 10),
                new Rectangle("Red", 10, 5),
                new Rectangle("Orange", 15, 40),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };
    }

    @Test
    void calculateRedPerimeter() {
        assertEquals(192.9645943005142D, TestFigures.calculateRedPerimeter(f));
    }

    @Test
    void calculateRedArea() {
        assertEquals(530.344455747027D, TestFigures.calculateRedArea(f));
    }
}