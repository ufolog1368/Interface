package by.jis4.komarov.service;

import by.jis4.komarov.interfaces.MathOperation;

public class AdditionOperation implements MathOperation {

    @Override
    public double compute(double a, double b) {
        return a + b;
    }
}
