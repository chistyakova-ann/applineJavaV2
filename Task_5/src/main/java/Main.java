import java.util.Scanner;
/**
 * Created by appline in 10.06.2021
 * @author ACHistyakova
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double x = in.nextDouble();
        System.out.println("Введите символ арифметической операции: ");
        String arifSymbols = in.next();
        System.out.print("Введите второе число: ");
        double y = in.nextDouble();
        Calculator calculator = new Calculator(x, arifSymbols, y);
        calculator.Calculator();

    }
}
