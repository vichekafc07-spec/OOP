package user_exc.calculator;

public class CalculateException extends Exception {
    private final double ex;

    public CalculateException(double ex) {
        this.ex = ex;
    }

    public double getEx() {
        return ex;
    }
}
