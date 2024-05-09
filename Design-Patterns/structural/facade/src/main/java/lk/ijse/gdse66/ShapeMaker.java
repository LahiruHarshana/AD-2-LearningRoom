package lk.ijse.gdse66;

/**
 * @author : L.H.J
 * @File: ShapeMaker
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-09, Thursday
 **/
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
