public class Divide implements CalculatorInterface{
    private float num1;

    private float num2;

    public Divide(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void handle() {
        System.out.printf("Dividing %s by %s is: %s.", this.num1, this.num2, this.num1 / this.num2);
    }
}
