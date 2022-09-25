package home_work_2.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SortsUtilsTest {
    @Test
    public void bubble(){
        int[] arr = {1,2,3,4,5,6};
        SortsUtils.bubble(arr);
        int[] arrExpected = {1,2,3,4,5,6};
        Assertions.assertArrayEquals(arrExpected, arr);
    }

    @Test
    public void bubble2(){
        int[] arr = {1,1,1,1};
        SortsUtils.bubble(arr);
        int[] arrExpected = {1,1,1,1};
        Assertions.assertArrayEquals(arrExpected, arr);
    }

    @Test
    public void bubble3(){
        int[] arr = {9,1,5,99,9,9};
        SortsUtils.bubble(arr);
        int[] arrExpected = {1,5,9,9,9,99};
        Assertions.assertArrayEquals(arrExpected, arr);
    }

    @Test
    public void bubble4(){
        int[] arr = {};
        SortsUtils.bubble(arr);
        int[] arrExpected = {};
        Assertions.assertArrayEquals(arrExpected, arr);
    }

    @Test
    public void bubble5(){
        int[] arr = {6,5,4,3,2,1};
        SortsUtils.bubble(arr);
        int[] arrExpected = {1,2,3,4,5,6};
        Assertions.assertArrayEquals(arrExpected, arr);
    }

    @Test
    public void bubble6(){
        int[] arr = null;
        Throwable throwable = assertThrows(NullPointerException.class,
                () -> SortsUtils.bubble(arr));
        assertEquals("Переданный массив равен null", throwable.getMessage());
    }

    @Test
    public void bubble7(){
        int[] arr = {-9,5,0,6,-11,19,3};
        SortsUtils.bubble(arr);
        int[] arrExpected = {-11,-9,0,3,5,6,19};
        Assertions.assertArrayEquals(arrExpected, arr);
    }

    @Test
    public void bubble8(){
        int[] arr = {0,-1,-2,-3,-4,-5,-6};
        SortsUtils.bubble(arr);
        int[] arrExpected = {-6,-5,-4,-3,-2,-1,0};
        Assertions.assertArrayEquals(arrExpected, arr);
    }

    @Test
    public void bubble9(){
        int[] arr = {2};
        SortsUtils.bubble(arr);
        int[] arrExpected = {2};
        Assertions.assertArrayEquals(arrExpected, arr);
    }

    @Test
    public void shake(){
        int[] arr = {1,2,3,4,5,6};
        SortsUtils.shake(arr);
        int[] arrExpected = {1,2,3,4,5,6};
        Assertions.assertArrayEquals(arrExpected, arr);
    }

    @Test
    public void shake2(){
        int[] arr = {1,1,1,1};
        SortsUtils.shake(arr);
        int[] arrExpected = {1,1,1,1};
        Assertions.assertArrayEquals(arrExpected, arr);
    }

    @Test
    public void shake3(){
        int[] arr = {9,1,5,99,9,9};
        SortsUtils.shake(arr);
        int[] arrExpected = {1,5,9,9,9,99};
        Assertions.assertArrayEquals(arrExpected, arr);
    }

    @Test
    public void shake4(){
        int[] arr = {};
        SortsUtils.shake(arr);
        int[] arrExpected = {};
        Assertions.assertArrayEquals(arrExpected, arr);
    }

    @Test
    public void shake5(){
        int[] arr = {6,5,4,3,2,1};
        SortsUtils.shake(arr);
        int[] arrExpected = {1,2,3,4,5,6};
        Assertions.assertArrayEquals(arrExpected, arr);
    }

    @Test
    public void shake6(){
        int[] arr = null;
        Throwable throwable = assertThrows(NullPointerException.class,
                () -> SortsUtils.shake(arr));
        assertEquals("Переданный массив равен null", throwable.getMessage());
    }

    @Test
    public void shake7(){
        int[] arr = {-9,5,0,6,-11,19,3};
        SortsUtils.shake(arr);
        int[] arrExpected = {-11,-9,0,3,5,6,19};
        Assertions.assertArrayEquals(arrExpected, arr);
    }

    @Test
    public void shake8(){
        int[] arr = {0,-1,-2,-3,-4,-5,-6};
        SortsUtils.shake(arr);
        int[] arrExpected = {-6,-5,-4,-3,-2,-1,0};
        Assertions.assertArrayEquals(arrExpected, arr);
    }

    @Test
    public void shake9(){
        int[] arr = {2};
        SortsUtils.shake(arr);
        int[] arrExpected = {2};
        Assertions.assertArrayEquals(arrExpected, arr);
    }


}
