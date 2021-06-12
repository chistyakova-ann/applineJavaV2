import java.util.Scanner;

/**
 * Created by appline in 10.06.2021
 * @author ACHistyakova
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите, что хотите сделать");
        System.out.println("1-Запустить калькулятор, 2-Поиск максимального слова");
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();
        if(choose==1){calc();}
        else if(choose==2){
            maxElement();
        } else System.out.println("Такого пункта нет");
    }

    public static void maxElement() {
        System.out.print("Введите количество слов: ");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String[] str = new String[count];
        int max = 0;
        int index = 0;
        String[] word = null;
        for (int i = 0; i < count; i++) {
            System.out.print("Введите " + (i + 1) + " слово: ");
            str[i] = in.next();
        }
        for (int i = 0; i < count; i++) {
            if (str[i].length() >= max) {
                max = str[i].length();
                index = i;
            }

        }

        System.out.println("Самое длинное слово: "+str[index]);

    }

    public static void calc() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double x = in.nextDouble();
        System.out.println("Введите символ арифметической операции: ");
        String arifSymbols = in.next();
        System.out.println("Введите второе число: ");
        double y = in.nextDouble();

        double res = 0;
        switch (arifSymbols) {
            case "+":
                res = x + y;
                break;
            case "-":
                res = x - y;
                break;
            case "*":
                res = x * y;
                break;
            case "/":
                if (y != 0) {
                    res = x / y;
                } else {
                    System.out.println("На ноль делить нельзя!!");
                    return;
                }
                break;
            default:
                System.out.println("Такого знака нет:)");
                return;
        }
        System.out.print("Результат: " + x + arifSymbols + y + "=");
        System.out.printf("%.4f", res);

    }
}
