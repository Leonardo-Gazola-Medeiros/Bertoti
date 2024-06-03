package soc.classes;
import java.util.ArrayList;
import java.util.List;


import soc.interfaces.Subject;
import soc.interfaces.Observer;

public class QuadroView extends Quadro implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void changeState() {
        notifyObservers();
    }
}
