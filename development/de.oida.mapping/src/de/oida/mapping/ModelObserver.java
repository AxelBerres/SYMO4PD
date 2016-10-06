package de.oida.mapping;

import java.util.Observable;
import java.util.Observer;

public class ModelObserver implements Observer {
	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("Observed change in " + arg0.toString());
	}
}
