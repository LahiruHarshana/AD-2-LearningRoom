package lk.ijse.gdse66;

/**
 * @author : L.H.J
 * @File: DecoratorPatternTest
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-09, Thursday
 **/
public class DecoratorPatternTest {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
    }
}
