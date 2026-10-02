package mobilewebserviceproject.assignment5;

public class FourBasicOpt {
    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        if (y == 0) throw new ArithmeticException("Division by zero");
        return x / y;
    }
}
