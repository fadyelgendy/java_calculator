import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws NoStrategyException {
        Scanner scanner = new Scanner(System.in);

        float input1;
        float input2;
        String operator;

        System.out.print("Enter First Number: ");
        input1 = scanner.nextFloat();

        System.out.print("Choose operator [+,-,/,*]: ");
        operator = scanner.next();

        System.out.print("Enter Second Number: ");
        input2 = scanner.nextFloat();

        CalculatorFacade.calculate(input1, input2, operator);
    }
}
