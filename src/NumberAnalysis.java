package coremathlibrary;

public class NumberAnalysis extends MathOperation {

    public boolean isPrime() {
        int num = (int) getOperand1();
        
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int factorial() {
        int num = (int) getOperand1();
        if (num < 0) {
            System.out.println("Error: Cannot find factorial of negative number.");
            return -1;
        }
        
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public String checkEvenOdd() {
        int num = (int) getOperand1();
        
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}