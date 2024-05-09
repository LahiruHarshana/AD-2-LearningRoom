package lk.ijse.gdse66;

/**
 * @author : L.H.J
 * @File: Circle
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-09, Thursday
 **/
public class Circle extends ShapeDecorator{
    public Circle(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a circle");
    }
}
