package de.symo.oida.changehandler;

import oida.bridge.observerservice.changehandler.AbstractOidaContentAdapter;
import oida.ontology.manager.IOntologyManager;

public class SymoContentAdapter extends AbstractOidaContentAdapter {
	

	public SymoContentAdapter(IOntologyManager ontologyManager) {
		//The SymoContentAdapter loads the SymoChangeHaandler
		super(new SymoChangeHandler(), ontologyManager);
		
		
		// TODO Auto-generated constructor stub
	}



		
	

		
	
	
}
