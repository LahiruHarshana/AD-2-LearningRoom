package lk.ijse.gdse66;

/**
 * @author : L.H.J
 * @File: BinaryObserver
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-09, Thursday
 **/
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Binary String: "+Integer.toBinaryString(subject.getState()));
    }
}
