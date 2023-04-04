public class CalculatorContext {
    private CalculatorInterface calculatorInterface;

    public void setStrategy(CalculatorInterface calculatorInterface)
    {
        this.calculatorInterface = calculatorInterface;
    }

    public void executeStrategy()
    {
        this.calculatorInterface.handle();
    }
}
