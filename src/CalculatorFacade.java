public class CalculatorFacade {
    public static void calculate(float num1, float num2, String operator) throws NoStrategyException
    {
        CalculatorContext calculatorContext = new CalculatorContext();

        switch (operator) {
            case "+":
                calculatorContext.setStrategy(new Add(num1, num2));
                break;
            case "-":
                calculatorContext.setStrategy(new Subtract(num1, num2));
                break;
            case "/":
                calculatorContext.setStrategy(new Divide(num1, num2));
                break;
            case "*":
                calculatorContext.setStrategy(new Multiply(num1, num2));
                break;
            default:
                // Custom exception
                throw new NoStrategyException();
        }

        calculatorContext.executeStrategy();
    }
}
