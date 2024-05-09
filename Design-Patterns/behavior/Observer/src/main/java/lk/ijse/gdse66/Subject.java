package lk.ijse.gdse66;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : L.H.J
 * @File: Subject
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-09, Thursday
 **/
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
