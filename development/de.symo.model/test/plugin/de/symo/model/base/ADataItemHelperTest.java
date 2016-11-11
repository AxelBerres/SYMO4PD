package de.symo.model.base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Ignore;

import de.symo.model.base.impl.ADataItemImpl;

public class ADataItemHelperTest extends ADataItemHelper {

	@Test
	public void testCreateID() {		
		String id = ADataItemHelper.createID();
		assertNotNull(id);
		assertEquals(36, id.length());
		assertNotEquals("1362ff4e-66ca-4ee2-bcb5-0d58e861efa6", id);
	}

	@Test
	public void testEqualsID() {
		
		// setup and check if there are 2 DataItems
		DataItem item1 = new DataItem();
		DataItem item2 = new DataItem();
		assertFalse(ADataItemHelper.equalsID(item1, item2));

		// test equality
		assertTrue(ADataItemHelper.equalsID(item1, item1));
		assertTrue(ADataItemHelper.equalsID(item2, item2));
		
		// change the id and test again
		item2.setId(ADataItemHelper.createID());		
		assertFalse(ADataItemHelper.equalsID(item2, item2));		
	}
	
	@Ignore
	protected class DataItem extends ADataItemImpl {
		DataItem() {
			setName("Test");
			setId(ADataItemHelper.createID());
		}		
	}
}
