package by.jis4.komarov.service;

import by.jis4.komarov.interfaces.MathOperation;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperationExecutorTest {

    @Test
    public void execute() {
        var operation = new OperationExecutor();
        var division = new DivisionOperation();
        var multiplication = new MultiplicationOperation();
        var subtraction = new SubtractionOperation();
        var addition = new AdditionOperation();

        MathOperation[] math = {division, multiplication, subtraction, addition};
        operation.execute(math, 5, 3);
    }
}