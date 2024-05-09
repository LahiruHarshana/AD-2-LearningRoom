package lk.ijse.gdse66;

/**
 * @author : L.H.J
 * @File: HexaObserver
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-09, Thursday
 **/
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Hex String: "+Integer.toHexString(subject.getState()).toUpperCase());
    }
}
