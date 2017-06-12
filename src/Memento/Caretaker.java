package Memento;

import java.util.ArrayList;

public class Caretaker {
    private ArrayList<ZooMemento> mementos = new ArrayList<>();

    public void addMemento(ZooMemento m) {
        mementos.add(m);
    }

    public ZooMemento getMemento() {
        return mementos.get(0);
    }
}
