package Bridge.demo;

public class BridgeDemo {

    public static void main(String args[]) {
        Circle circle = new BlueCircle();

        Square square = new RedSquare();

        circle.applyColour();
        square.applyColour();
    }
}
