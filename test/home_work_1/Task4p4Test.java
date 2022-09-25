package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task4p4Test {
    @Test
    public void checkInputNumber() {
        Assertions.assertTrue(Task4p4.checkInputNumber(10));
    }

    @Test
    public void checkInputNumber2() {
        Assertions.assertTrue(Task4p4.checkInputNumber(0));
    }

    @Test
    public void checkInputNumber3() {
        Assertions.assertFalse(Task4p4.checkInputNumber(-100));
    }

    @Test
    public void checkInputSymbol() {
        Assertions.assertEquals("k", Task4p4.checkInputSymbol("k"));
    }

    @Test
    public void checkInputSymbol2() {
        Assertions.assertEquals("b", Task4p4.checkInputSymbol("b"));
    }

    @Test
    public void checkInputSymbol3() {
        Assertions.assertEquals("k", Task4p4.checkInputSymbol("K"));
    }

    @Test
    public void checkInputSymbol4() {
        Assertions.assertEquals("b", Task4p4.checkInputSymbol("B"));
    }

    @Test
    public void checkInputSymbol5() throws IllegalArgumentException {
        Throwable thrown = assertThrows(IllegalArgumentException.class,
                () -> Task4p4.checkInputSymbol(""));
        assertNotNull(thrown.getMessage());
    }

    @Test
    public void checkInputSymbol6() throws IllegalArgumentException {
        Throwable thrown = assertThrows(IllegalArgumentException.class,
                () -> Task4p4.checkInputSymbol("-"));
        assertNotNull(thrown.getMessage());
        }

    @Test
    public void checkInputSymbol7() throws IllegalArgumentException {
        Throwable thrown = assertThrows(IllegalArgumentException.class,
                () -> Task4p4.checkInputSymbol("l"));
        assertNotNull(thrown.getMessage());
    }

    @Test
    public void convertBytesToKilobytes() {
        Assertions.assertEquals(0.0009765625, Task4p4.convertBytesToKilobytes(1));
    }

    @Test
    public void convertBytesToKilobytes2() {
        Assertions.assertEquals(3.1260986328125, Task4p4.convertBytesToKilobytes(3201.125));
    }

    @Test
    public void convertBytesToKilobytes3() {
        Assertions.assertEquals(0, Task4p4.convertBytesToKilobytes(0));
    }

    @Test
    public void convertBytesToKilobytes4() {
        Assertions.assertEquals(1, Task4p4.convertBytesToKilobytes(1024));
    }

    @Test
    public void convertKilobytesToBytes() {
        Assertions.assertEquals(1024, Task4p4.convertKilobytesToBytes(1));
    }

    @Test
    public void convertKilobytesToBytes2() {
        Assertions.assertEquals(0, Task4p4.convertKilobytesToBytes(0));
    }

    @Test
    public void convertKilobytesToBytes3() {
        Assertions.assertEquals(512, Task4p4.convertKilobytesToBytes(0.5));
    }

    @Test
    public void convertKilobytesToBytes4() {
        Assertions.assertEquals(3201.125, Task4p4.convertKilobytesToBytes(3.1260986328125));
    }
}
