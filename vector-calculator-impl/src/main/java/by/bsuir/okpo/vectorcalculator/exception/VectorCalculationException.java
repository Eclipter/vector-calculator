package by.bsuir.okpo.vectorcalculator.exception;

public class VectorCalculationException extends RuntimeException {

    public VectorCalculationException() {
    }

    public VectorCalculationException(String message) {
        super(message);
    }

    public VectorCalculationException(String message, Throwable cause) {
        super(message, cause);
    }

    public VectorCalculationException(Throwable cause) {
        super(cause);
    }
}
