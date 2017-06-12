package Memento;

import graphics.ZooPanel;

public class originator {
    private CopyZooPanel zoo;
   /* lots of memory consumptive private data that is not necessary to define the
    * state and should thus not be saved. Hence the small memento object. */

    public void setState(CopyZooPanel _zoo) {
        System.out.println("Originator: Setting state to " + _zoo);
        this.zoo = _zoo;
    }

    public ZooMemento save() {
        System.out.println("Originator: Saving to Memento.");
        return new ZooMemento(zoo);
    }
    public void restore(ZooMemento m) {
    	zoo = m.getState();
        System.out.println("Originator: State after restoring from Memento: " + zoo);
    }
}
