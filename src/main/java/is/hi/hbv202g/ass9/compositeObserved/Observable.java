package is.hi.hbv202g.ass9.compositeObserved;

import java.util.List;

abstract class Observable {

    private List<Observer> observers;

    public Observable(List<Observer> observers) {
        this.observers = observers;
    }
}
