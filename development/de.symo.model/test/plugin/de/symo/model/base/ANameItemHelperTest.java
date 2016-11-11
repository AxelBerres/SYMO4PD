package de.symo.model.base;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Ignore;

import de.symo.model.base.impl.ANameItemImpl;

public class ANameItemHelperTest extends ADataItemHelper {

	@Test
	public void testEqualsName() {
		
		// setup and check if there are 2 DataItems
		NameItem item1 = new NameItem();
		NameItem item2 = new NameItem();
		assertFalse(ANameItemHelper.equalsName(item1, item2));

		// test equality
		assertTrue(ANameItemHelper.equalsName(item1, item2));
		assertTrue(ANameItemHelper.equalsName(item1, item2));
		
		// change the id and test again
		item2.setName("NotTest");		
		assertFalse(ANameItemHelper.equalsName(item2, item2));		
	}
	
	@Ignore
	protected class NameItem extends ANameItemImpl {
		NameItem() {
			setName("Test");
		}		
	}
}
