package Bridge.solution.shapes;

import Bridge.solution.colours.Colour;

public class Square extends Shape {

    public Square(Colour colour) {
        super(colour);
    }

    public void applyColour() {
        colour.applyColour();
    }
}
