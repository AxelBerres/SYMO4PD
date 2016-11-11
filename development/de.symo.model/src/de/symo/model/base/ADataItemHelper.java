package de.symo.model.base;

import java.util.UUID;

public class ADataItemHelper {

	public static final String createID() {
		return UUID.randomUUID().toString();		
	}
	
	public static final boolean equalsID(final ADataItem item1, final ADataItem item2) {		
		return item1.getId().equals(item2.getId());		
	}	
}
