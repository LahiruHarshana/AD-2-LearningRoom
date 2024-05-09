package lk.ijse.gdse66;

/**
 * @author : L.H.J
 * @File: Rectangle
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-09, Thursday
 **/
public class Rectangle extends ShapeDecorator{
    public Rectangle(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a rectangle");
    }
}
