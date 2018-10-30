package by.bsuir.okpo.vectorcalculator.model;

public class VectorMultiplicationRequest {

    private Vector vector;
    private Integer multiplier;

    public Vector getVector() {
        return vector;
    }

    public void setVector(Vector vector) {
        this.vector = vector;
    }

    public Integer getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Integer multiplier) {
        this.multiplier = multiplier;
    }
}
