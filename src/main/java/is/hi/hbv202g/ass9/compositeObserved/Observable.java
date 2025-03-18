package is.hi.hbv202g.ass9.compositeObserved;

import java.util.List;

abstract class Observable {

    private List<Observer> observers;

    public Observable(List<Observer> observers) {
        this.observers = observers;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.getResult();
        }
    }
}