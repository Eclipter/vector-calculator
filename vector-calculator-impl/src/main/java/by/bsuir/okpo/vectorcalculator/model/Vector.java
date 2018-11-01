package by.bsuir.okpo.vectorcalculator.model;

import java.util.List;

public class Vector {

    private List<Integer> values;

    public List<Integer> getValues() {
        return values;
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }

    public Vector withValues(List<Integer> values) {
        this.values = values;
        return this;
    }
}
