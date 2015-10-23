package Bridge.solution;

import Bridge.solution.colours.Blue;
import Bridge.solution.colours.Colour;
import Bridge.solution.colours.Red;
import Bridge.solution.shapes.Circle;
import Bridge.solution.shapes.Shape;
import Bridge.solution.shapes.Square;

public class BridgeSolution {

    public static void main(String args[]) {
        Colour blue = new Blue();
        Colour red = new Red();

        Shape square = new Square(blue);
        Shape circle = new Circle(red);

        square.applyColour();
        circle.applyColour();
    }
}
