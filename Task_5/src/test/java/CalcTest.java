import org.junit.Test;

import static Operation.Devide.devide;
import static Operation.Minus.minus;
import static Operation.Multiplication.multiplication;
import static Operation.Plus.plus;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class CalcTest {
    @Test
    public void PlusTest() {
        assertEquals("Сложение двух положительных чисел выполняется некорректно!",8.154, plus(3.154, 5), 0);
    }
    @Test
    public void MinusTest() {
        assertEquals("Вычитание двух чисел выполняется некорректно!",-1.846, minus(3.154, 5), 0);
    }
    @Test
    public void DevideTest() {
        assertEquals("Деление двух чисел выполняется некорректно!",0.6308, devide(3.154, 5), 0);
    }
    @Test
    public void MultTest() {
        assertEquals("Умножение двух чисел выполняется некорректно!",15.77, multiplication(3.154, 5), 0);
    }
    @Test
    public void DevideByZero() {
        assertEquals("Деление на 0 выполняется некорректно!",true,Double.isInfinite(devide(3.154, 0)));
    }
    @Test
    public void DevisonOfZero() {
        assertEquals("Деление нуля выполняется некорректно!",0.0, devide(0, 54.6),0);
    }
    @Test
    public void MultOfZero() {
        assertEquals("Умножение на 0 выполняется некорректно!",0.0, multiplication(0, 54.6),0);
    }
}
