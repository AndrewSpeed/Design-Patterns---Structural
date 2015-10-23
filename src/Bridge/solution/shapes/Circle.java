package Bridge.solution.shapes;

import Bridge.solution.colours.Colour;

public class Circle extends Shape {

    public Circle(Colour colour) {
        super(colour);
    }

    @Override
    public void applyColour() {
        colour.applyColour();
    }
}
