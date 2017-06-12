package Memento;

import java.util.ArrayList;

import animals.Animal;
import graphics.ZooFrame;
import graphics.ZooPanel;

public class ZooMemento {

 	    private CopyZooPanel zoo;
	 	//our state in this state is ZooPanel ( which means we save all the current data including the food ,animals).
	    public ZooMemento(CopyZooPanel _zoo) {
	    	this.zoo=_zoo;
	    }

	    public CopyZooPanel getState() {
	    	System.out.println("trying to restore..");
	        return zoo;
	    }  
	}
