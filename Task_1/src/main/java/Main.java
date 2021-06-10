import java.util.Scanner;

/**
 * Created by appline in 10.06.2021
 * @author ACHistyakova
 *
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double x = in.nextDouble();
        System.out.println("Введите символ арифметической операции: ");
        String arif_symbols = in.next();
        System.out.println("Введите второе число: ");
        double y = in.nextDouble();

        double res=0;
        switch(arif_symbols){
            case "+":
                res = x+y;
                break;
            case "-":
                res=x-y;
                break;
            case "*":
                res=x*y;
                break;
            case "/":
                if(y!=0) {
                    res=x/y;
                }else {  System.out.println("На ноль делить нельзя!!");return;}
                break;
            default:
            System.out.println("Такого знака нет:)");return;
        }
        System.out.print("Результат: "+x+arif_symbols+y+"=");
        System.out.printf("%.4f",res);
    }
}
