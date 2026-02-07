package coremathlibrary;

public class Geometry extends MathOperation {

    //circle
    public double circleArea() {
        double radius = getOperand1();
        if (radius < 0) {
            System.out.println("Error: Radius cannot be negative.");
            return 0;
        }
        return Math.PI * radius * radius;
    }

    public double circleCircumference() {
        double radius = getOperand1();
        if (radius < 0) {
            return 0;
        }
        return 2 * Math.PI * radius;
    }

    //rectangle
    public double rectangleArea() {
        double length = getOperand1();
        double width = getOperand2();
        
        if (length < 0 || width < 0) {
            System.out.println("Error: Dimensions cannot be negative.");
            return 0;
        }
        return length * width;
    }

    public double rectanglePerimeter() {
        double length = getOperand1();
        double width = getOperand2();
        
        if (length < 0 || width < 0) {
            return 0;
        }
        return 2 * (length + width);
    }

}
