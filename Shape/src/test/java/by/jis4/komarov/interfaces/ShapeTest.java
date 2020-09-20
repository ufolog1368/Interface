package by.jis4.komarov.interfaces;

import by.jis4.komarov.bean.AbstractShape;
import by.jis4.komarov.bean.Circle;
import by.jis4.komarov.bean.Square;
import by.jis4.komarov.bean.Triangle;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ShapeTest {
private final Logger log = LoggerFactory.getLogger(ShapeTest.class);

    @Test
    public void demonstrationOfshapes() {
        Circle circle = new Circle(5.2);
        Square square = new Square(2.0);
        Triangle triangle = new Triangle(4.0, 5.0);
        AbstractShape[] geometricalFigure = {circle, square,  triangle};


        for (AbstractShape abstractShape : geometricalFigure) {
            log.info("figure = {}", abstractShape);
        }
        }
    }

