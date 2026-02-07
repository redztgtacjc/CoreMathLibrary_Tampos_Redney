package coremathlibrary;

public class Main {

    public static void main(String[] args) {
        
        //arithmetic
        Arithmetic calc = new Arithmetic();
        
        //add
        calc.setOperand1(15.0);
        calc.setOperand2(10.0);
        System.out.println("The Sum of [" + calc.getOperand1() + ", " + calc.getOperand2() + "] is: " + calc.add() + ".");

        //divide
        calc.setOperand1(20.0);
        calc.setOperand2(0.0);
        double divResult = calc.divide();
        
        System.out.print("The Quotient [" + calc.getOperand1() + ", " + calc.getOperand2() + "] is: ");
        if (Double.isNaN(divResult)) {
            System.out.println("Undefined.");
        } else {
            System.out.println(divResult + ".");
        }

        //geometry
        Geometry shape = new Geometry();

        //circle area positive
        shape.setOperand1(5.0);
        System.out.println("Calculated area for radius [" + shape.getOperand1() + "] is: " + shape.circleArea() + ".");

        //circle area negative
        shape.setOperand1(-3.0);
        double areaResult = shape.circleArea();
        
        System.out.print("Calculated area for radius [" + shape.getOperand1() + "] is: ");
        if (areaResult == -1.0) {
            System.out.println("This circle has a negative radius.");
        } else {
            System.out.println(areaResult + ".");
        }

        //number analysis
        NumberAnalysis numOp = new NumberAnalysis();

        //check prime
        numOp.setOperand1(7.0);
        System.out.print("The number [" + numOp.getOperand1() + "] is: ");
        if (numOp.isPrime()) {
            System.out.println("A prime number.");
        } else {
            System.out.println("Not a prime number.");
        }

        //check prime
        numOp.setOperand1(10.0);
        System.out.print("The number [" + numOp.getOperand1() + "] is: ");
        if (numOp.isPrime()) {
            System.out.println("A prime number.");
        } else {
            System.out.println("Not a prime number.");
        }

        //factorial
        numOp.setOperand1(5.0);
        System.out.println("The factorial of the number [" + numOp.getOperand1() + "] is: " + numOp.factorial() + ".");
    }

}
