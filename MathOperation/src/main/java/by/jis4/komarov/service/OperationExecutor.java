package by.jis4.komarov.service;

import by.jis4.komarov.interfaces.MathOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OperationExecutor {
    Logger logger = LoggerFactory.getLogger(OperationExecutor.class);

    public void execute(MathOperation[] operations, double a, double b){
        for (MathOperation mathOperation : operations) {
            logger.info("{} : {}", mathOperation.getClass(), mathOperation.compute(a ,b));
        }
    }
}
