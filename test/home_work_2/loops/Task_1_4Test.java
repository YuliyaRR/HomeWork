package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_4Test {
    @Test
    public void numBeforeOverflow() {
        Assertions.assertEquals("Значение до переполнения 4052555153018976267",
                Task_1_4.numBeforeOverflow(4052555153018976267L));
    }

    @Test
    public void numAfterOverflow() {
        Assertions.assertEquals("Значение после переполнения -6289078614652622815",
                Task_1_4.numAfterOverflow(-6289078614652622815L));
    }

    @Test
    public void multiplyToOverflow(){
        Assertions.assertEquals("При умножении на ноль результат равен ноль. Переполнения не будет.",
                Task_1_4.multiplyToOverflow(0));
    }

    @Test
    public void multiplyToOverflow2(){
        Assertions.assertEquals("При умножении на единицу(минус единицу) переполнения не будет.",
                Task_1_4.multiplyToOverflow(1));
    }

    @Test
    public void multiplyToOverflow3(){
        Assertions.assertEquals("При умножении на единицу(минус единицу) переполнения не будет.",
                Task_1_4.multiplyToOverflow(-1));
    }

    @Test
    public void multiplyToOverflow4(){
        Assertions.assertEquals("Значение до переполнения 4052555153018976267\n" +
                        "Значение после переполнения -6289078614652622815",
                Task_1_4.multiplyToOverflow(3));
    }

    @Test
    public void multiplyToOverflow5(){
        Assertions.assertEquals("Значение до переполнения 1560496482665168896\n" +
                        "Значение после переполнения -1774566438301073408",
                Task_1_4.multiplyToOverflow(188));
    }

    @Test
    public void multiplyToOverflow6(){
        Assertions.assertEquals("Значение до переполнения 799006685782884121\n" +
                        "Значение после переполнения 3265617043834753317",
                Task_1_4.multiplyToOverflow(-19));
    }

    @Test
    public void multiplyToOverflow7(){
        Assertions.assertEquals("Значение до переполнения 1000000000000000000\n" +
                        "Значение после переполнения -8446744073709551616",
                Task_1_4.multiplyToOverflow(10));
    }

    @Test
    public void multiplyToOverflow8(){
        Assertions.assertEquals("Значение до переполнения 490317952361693184\n" +
                        "Значение после переполнения -7319516071845691392",
                Task_1_4.multiplyToOverflow(888));
    }

    @Test
    public void multiplyToOverflow9(){
        Assertions.assertEquals("Значение до переполнения 45726860540371968\n" +
                        "Значение после переполнения 5987576072171229184",
                Task_1_4.multiplyToOverflow(2148));
    }

    @Test
    public void multiplyToOverflow10(){
        Assertions.assertEquals("Значение до переполнения 1000000000000000\n" +
                        "Значение после переполнения 7766279631452241920",
                Task_1_4.multiplyToOverflow(100_000));
    }
}
