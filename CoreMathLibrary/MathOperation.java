package coremathlibrary;

public class MathOperation {
    // ENCAPSULATION: Attributes are private
    private double operand1;
    private double operand2;

    // Public Getters and Setters
    public void setOperand1(double value) {
        this.operand1 = value;
    }

    public double getOperand1() {
        return this.operand1;
    }

    public void setOperand2(double value) {
        this.operand2 = value;
    }

    public double getOperand2() {
        return this.operand2;
    }
}