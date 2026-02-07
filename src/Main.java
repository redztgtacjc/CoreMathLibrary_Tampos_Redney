package coremathlibrary;

public class Main {

    public static void main(String[] args) {
        
        // --- ARITHMETIC ---
        Arithmetic calc = new Arithmetic();
        
        // 1. Addition
        calc.setOperand1(15.0);
        calc.setOperand2(10.0);
        System.out.println("The Sum of [" + calc.getOperand1() + ", " + calc.getOperand2() + "] is: " + calc.add() + ".");

        // 2. Division (Undefined check)
        calc.setOperand1(20.0);
        calc.setOperand2(0.0);
        double divResult = calc.divide();
        
        System.out.print("The Quotient [" + calc.getOperand1() + ", " + calc.getOperand2() + "] is: ");
        if (Double.isNaN(divResult)) {
            System.out.println("Undefined.");
        } else {
            System.out.println(divResult + ".");
        }

        // --- GEOMETRY ---
        Geometry shape = new Geometry();

        // 3. Circle Area (Positive)
        shape.setOperand1(5.0);
        System.out.println("Calculated area for radius [" + shape.getOperand1() + "] is: " + shape.circleArea() + ".");

        // 4. Circle Area (Negative)
        shape.setOperand1(-3.0);
        double areaResult = shape.circleArea();
        
        System.out.print("Calculated area for radius [" + shape.getOperand1() + "] is: ");
        if (areaResult == -1.0) {
            System.out.println("This circle has a negative radius.");
        } else {
            System.out.println(areaResult + ".");
        }

        // --- NUMBER ANALYSIS ---
        NumberAnalysis numOp = new NumberAnalysis();

        // 5. Prime Check (7.0)
        numOp.setOperand1(7.0);
        System.out.print("The number [" + numOp.getOperand1() + "] is: ");
        if (numOp.isPrime()) {
            System.out.println("A prime number.");
        } else {
            System.out.println("Not a prime number.");
        }

        // 6. Prime Check (10.0)
        numOp.setOperand1(10.0);
        System.out.print("The number [" + numOp.getOperand1() + "] is: ");
        if (numOp.isPrime()) {
            System.out.println("A prime number.");
        } else {
            System.out.println("Not a prime number.");
        }

        // 7. Factorial (5.0)
        numOp.setOperand1(5.0);
        System.out.println("The factorial of the number [" + numOp.getOperand1() + "] is: " + numOp.factorial() + ".");
    }
}