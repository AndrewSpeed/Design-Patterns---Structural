package Bridge.solution.shapes;

import Bridge.solution.colours.Colour;

public abstract class Shape {

    public Colour colour;

    public Shape(Colour instance) {
        this.colour = instance;
    }

    abstract public void applyColour();
}
