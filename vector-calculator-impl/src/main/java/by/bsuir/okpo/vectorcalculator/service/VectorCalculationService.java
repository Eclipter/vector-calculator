package by.bsuir.okpo.vectorcalculator.service;

import by.bsuir.okpo.vectorcalculator.exception.VectorCalculationException;
import by.bsuir.okpo.vectorcalculator.model.Vector;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class VectorCalculationService {

    public Vector add(Vector vectorA, Vector vectorB) {
        checkVectorLengths(vectorA, vectorB);
        return new Vector()
                .withValues(IntStream.range(0, vectorA.getValues().size())
                        .mapToObj(index -> vectorA.getValues().get(index) + vectorB.getValues().get(index))
                        .collect(Collectors.toList()));
    }

    public Vector subtract(Vector vector1, Vector vector2) {
        return add(vector1, scalarMultiplication(-1, vector2));
    }

    public Vector scalarMultiplication(Integer multiplier, Vector vector) {
        return new Vector().withValues(
                vector.getValues()
                        .stream()
                        .map(v -> multiplier * v)
                        .collect(Collectors.toList())
        );
    }

    public Double calculateVectorLength(Vector vector) {
        return Math.sqrt(vector.getValues().stream().mapToInt(v -> v * v).sum());
    }

    public Integer dotProduct(Vector vector1, Vector vector2) {
        checkVectorLengths(vector1, vector2);
        return IntStream.range(0, vector1.getValues().size())
                .mapToObj(index -> vector1.getValues().get(index) * vector2.getValues().get(index))
                .mapToInt(element -> element)
                .sum();
    }

    private void checkVectorLengths(Vector vector1, Vector vector2) {
        if (vector1.getValues().size() != vector2.getValues().size()) {
            throw new VectorCalculationException("Vectors have different lengths");
        }
    }
}
