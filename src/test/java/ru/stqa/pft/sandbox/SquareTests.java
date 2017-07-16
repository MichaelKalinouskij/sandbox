package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

/**
 * Created by NotePad.by on 11.07.2017.
 */
public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(5);
        assert s.area() == 25;
    }
}
