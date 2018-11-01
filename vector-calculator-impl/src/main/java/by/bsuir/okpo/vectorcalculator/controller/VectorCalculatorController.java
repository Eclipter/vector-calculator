package by.bsuir.okpo.vectorcalculator.controller;

import by.bsuir.okpo.vectorcalculator.model.Vector;
import by.bsuir.okpo.vectorcalculator.model.VectorCalculationRequest;
import by.bsuir.okpo.vectorcalculator.model.VectorMultiplicationRequest;
import by.bsuir.okpo.vectorcalculator.service.VectorCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VectorCalculatorController {

    @Autowired
    private VectorCalculationService vectorCalculationService;

    @PostMapping("/add")
    public Vector add(@RequestBody VectorCalculationRequest vectorPair) {
        return vectorCalculationService.add(vectorPair.getVectorA(), vectorPair.getVectorB());
    }

    @PostMapping("/subtract")
    public Vector subtract(@RequestBody VectorCalculationRequest vectorPair) {
        return vectorCalculationService.subtract(vectorPair.getVectorA(), vectorPair.getVectorB());
    }

    @PostMapping("/dot-product")
    public Integer dotProduct(@RequestBody VectorCalculationRequest vectorPair) {
        return vectorCalculationService.dotProduct(vectorPair.getVectorA(), vectorPair.getVectorB());
    }

    @PostMapping("/scalar-multiply")
    public Vector scalarMultiply(@RequestBody VectorMultiplicationRequest vectorAndScalar) {
        return vectorCalculationService.scalarMultiplication(vectorAndScalar.getMultiplier(), vectorAndScalar.getVector());
    }

    @PostMapping("/length")
    public Double length(@RequestBody Vector vector) {
        return vectorCalculationService.calculateVectorLength(vector);
    }
}
