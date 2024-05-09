package lk.ijse.gdse66;

/**
 * @author : L.H.J
 * @File: ShapeDecorator
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-09, Thursday
 **/
public class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }
    @Override
    public void draw() {
        this.decoratedShape.draw();
    }
}
