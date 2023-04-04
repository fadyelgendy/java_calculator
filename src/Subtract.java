public class Subtract implements CalculatorInterface{
    private float num1;

    private float num2;

    public Subtract(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void handle() {
        System.out.printf("Subtract %s from %s is %s: ", this.num2, this.num1, this.num1 - this.num2);
    }
}
