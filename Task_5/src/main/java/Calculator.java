import static Operation.Devide.devide;
import static Operation.Minus.minus;
import static Operation.Multiplication.multiplication;
import static Operation.Plus.plus;

/**
 * Created by appline in 10.06.2021
 *
 * @author ACHistyakova
 * Class Calculator
 */
public class Calculator {
    /**
     * @param firstNumber первое число
     * @param secondNumber второе число
     * @param arifSymbol арифметический знак + - * /
     */
    private double firstNumber;
    private double secondNumber;
    private String arifSymbol;

    public Calculator(double firstNumber, String arifSymbol, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.arifSymbol = arifSymbol;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public String getArifSymbol() {
        return arifSymbol;
    }


    public void Calculator() {
        if (getArifSymbol().equals("+")) {
            System.out.print(getFirstNumber() + " " + getArifSymbol() + " " + getSecondNumber() + "= ");
            System.out.printf("%.4f", plus(getFirstNumber(), getSecondNumber()));
        } else if (getArifSymbol().equals("-")) {
            System.out.print(getFirstNumber() + " " + getArifSymbol() + " " + getSecondNumber() + "= ");
            System.out.printf("%.4f", minus(getFirstNumber(), getSecondNumber()));
        } else if (getArifSymbol().equals("*")) {
            System.out.println(getFirstNumber() + " " + getArifSymbol() + " " + getSecondNumber() + "= ");
            System.out.printf("%.4f", multiplication(getFirstNumber(), getSecondNumber()));
        } else if (getArifSymbol().equals("/")) {
            if (getSecondNumber() == 0) {
                try {
                    throw new ArithmeticException("На ноль делить нельзя!!!");
                    //  System.out.println("На ноль делить нельзя!!!");
                    //   } else {
                //    System.out.println(getFirstNumber() + " " + getArifSymbol() + " " + getSecondNumber() + "= ");
                 //   System.out.printf("%.4f", devide(getFirstNumber(), getSecondNumber()));
                }catch (ArithmeticException e) {
                    System.out.println("На ноль делить нельзя!!!"+e);
                }
            }else{
                System.out.println(getFirstNumber() + " " + getArifSymbol() + " " + getSecondNumber() + "= ");
                System.out.printf("%.4f", devide(getFirstNumber(), getSecondNumber()));
            }
        }
    }
}
