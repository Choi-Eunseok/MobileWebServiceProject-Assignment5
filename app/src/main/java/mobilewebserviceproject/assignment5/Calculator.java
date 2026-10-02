package mobilewebserviceproject.assignment5;

public class Calculator {
    public static final String ERROR_INPUT = "숫자 2개를 입력하시오.";
    public static final String ERROR_DIVIDE_BY_ZERO = "0으로 나눌 수 없습니다.";

    private final FourBasicOpt opt = new FourBasicOpt();

    public String calculate(String a, String b, char op) {
        double x, y;
        try {
            x = Double.parseDouble(a.trim());
            y = Double.parseDouble(b.trim());
        } catch (NumberFormatException e) {
            return ERROR_INPUT;
        }
        try {
            switch (op) {
                case '+': return format(opt.add(x, y));
                case '-': return format(opt.subtract(x, y));
                case '/': return format(opt.divide(x, y));
                case '*': return format(opt.multiply(x, y));
                default: return "";
            }
        } catch (ArithmeticException e) {
            return ERROR_DIVIDE_BY_ZERO;
        }
    }

    public String describe(String a, String b, char op) {
        String result = calculate(a, b, op);
        if (result.equals(ERROR_INPUT) || result.equals(ERROR_DIVIDE_BY_ZERO)) {
            return result;
        }
        return a.trim() + " " + op + " " + b.trim() + " = " + result;
    }

    static String format(double value) {
        if (value == Math.rint(value) && Math.abs(value) < 1e15) {
            return String.valueOf((long) value);
        }
        return String.valueOf(value);
    }
}
