package soc.interfaces;

public abstract interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}