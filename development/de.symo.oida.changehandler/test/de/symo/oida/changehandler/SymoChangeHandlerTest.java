package de.symo.oida.changehandler;

import static org.eclipse.emf.common.notify.Notification.ADD;
import static org.eclipse.emf.common.notify.Notification.ADD_MANY;
import static org.eclipse.emf.common.notify.Notification.MOVE;
import static org.eclipse.emf.common.notify.Notification.NO_INDEX;
import static org.eclipse.emf.common.notify.Notification.REMOVE;
import static org.eclipse.emf.common.notify.Notification.REMOVE_MANY;
import static org.eclipse.emf.common.notify.Notification.REMOVING_ADAPTER;
import static org.eclipse.emf.common.notify.Notification.RESOLVE;
import static org.eclipse.emf.common.notify.Notification.SET;
import static org.eclipse.emf.common.notify.Notification.UNSET;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import de.symo.model.element.ElementFactory;
import de.symo.model.element.MetaData;
import de.symo.model.symo.ProjectRepository;
import de.symo.model.symo.SymoFactory;
import de.symo.model.symo.SystemElement;

import oida.bridge.observerservice.changehandler.IChangeHandler;

import oida.ontology.manager.IOntologyManager;
import oida.ontology.owl.manager.OwlOntologyManager;
import oida.ontology.owl.manager.OwlOntologyManagerFactory;
import oida.ontologyMgr.OntologyFile;
import oida.ontologyMgr.OntologyMgrFactory;
import oida.test.util.OntologyTestHelper;

/**
 * 
 * @author Martin Glas, Michael Shamiyeh
 * @since 2017-01-20
 *
 */
public class SymoChangeHandlerTest {
	private IChangeHandler symoChangeHandler;
	
	private OntologyFile testFileEntry;
	
	private ProjectRepository projectRepository;
	
	IOntologyManager owlOntologyManager;
	
	private final static String MODEL_ONTOLOGY_TEST_FILE_NAME="test_model_ontology.owl";
	
	@Before
	public void setUp() throws Exception {
		
		
		owlOntologyManager = new OwlOntologyManagerFactory().getNewManager();
		
		testFileEntry = OntologyMgrFactory.eINSTANCE.createOntologyFile();
		testFileEntry.setPath(OntologyTestHelper.getTestOntologyFilePath());
		testFileEntry.setFileName(MODEL_ONTOLOGY_TEST_FILE_NAME);
		
		owlOntologyManager.createOntology(testFileEntry);
		
		
		
		projectRepository=SymoFactory.eINSTANCE.createProjectRepository();
		MetaData projectName=ElementFactory.eINSTANCE.createMetaData();
		//TODO the following attribute should be part of the meta model ontology
		projectName.setName("Project name");
		
		projectName.setValue("Test project");
		projectRepository.getMetaData().add(projectName);
		
		//TODO Hooking the listener to ARepository Instances should be a standard feature.
		EContentAdapter adapter = new SymoContentAdapter(owlOntologyManager);
		projectRepository.eAdapters().add(adapter);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHandleAdd() {
		SymoFactory symoFactory=SymoFactory.eINSTANCE;
		
		SystemElement leftWingSystemElement = symoFactory.createSystemElement();
		leftWingSystemElement.setName("Left wing");
		
		projectRepository.getSystems().add(leftWingSystemElement);
		assertNotNull(owlOntologyManager.getClass("LeftWing"));
	}

	@Test
	public void testHandleAddMany() {
		fail("Not yet implemented");
	}

	@Test
	public void testHandleMove() {
		fail("Not yet implemented");
	}

	@Test
	public void testHandleNoIndex() {
		fail("Not yet implemented");
	}

	@Test
	public void testHandleRemove() {
		fail("Not yet implemented");
	}

	@Test
	public void testHandleRemoveMany() {
		fail("Not yet implemented");
	}

	@Test
	public void testHandleRemovingAdapter() {
		fail("Not yet implemented");
	}

	@Test
	public void testHandleResolve() {
		fail("Not yet implemented");
	}

	@Test
	public void testHandleSet() {
		fail("Not yet implemented");
	}

	@Test
	public void testHandleUnset() {
		fail("Not yet implemented");
	}

}
