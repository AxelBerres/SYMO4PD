package de.symo.oida.changehandler;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.symo.model.element.ElementFactory;
import de.symo.model.element.MetaData;
import de.symo.model.symo.ProjectRepository;
import de.symo.model.symo.SymoFactory;
import de.symo.model.symo.SystemElement;
import oida.ontology.manager.IOntologyManager;
import oida.ontology.owl.manager.OwlOntologyManagerFactory;
import oida.ontologyMgr.OntologyFile;
import oida.ontologyMgr.OntologyMgrFactory;

/**
 * 
 * @author Martin Glas, Michael Shamiyeh
 * @since 2017-01-20
 *
 */
public class SymoChangeHandlerTest {
	private final String SYMOCHANGEHANDLER_TESTONTOLOGY_IRI = "http://de.symo/oida/changehandler/test/ontology#";
	
	//private IModelChangeHandler symoChangeHandler;
	
	private OntologyFile testFileEntry;
	
	private ProjectRepository projectRepository;
	
	IOntologyManager owlOntologyManager;
	
	private final static String MODEL_ONTOLOGY_TEST_FILE_NAME="test_model_ontology.owl";
	
	@Before
	public void setUp() throws Exception {
		
		
		owlOntologyManager = new OwlOntologyManagerFactory().getNewManager();
		
		testFileEntry = OntologyMgrFactory.eINSTANCE.createOntologyFile();
		//testFileEntry.setPath(OntologyTestHelper.getTestOntologyFilePath());
		testFileEntry.setFileName(MODEL_ONTOLOGY_TEST_FILE_NAME);
		
		owlOntologyManager.createOntology(SYMOCHANGEHANDLER_TESTONTOLOGY_IRI);
		
		projectRepository=SymoFactory.eINSTANCE.createProjectRepository();
		MetaData projectName=ElementFactory.eINSTANCE.createMetaData();
		//TODO the following attribute should be part of the meta model ontology
		projectName.setName("Project name");
		
		projectName.setValue("Test project");
		projectRepository.getMetaData().add(projectName);
		
//		symoChangeHandler = new SymoChangeHandler();
//		
//		//TODO Hooking the listener to ARepository Instances should be a standard feature.
//		projectRepository.eAdapters().add(new EContentAdapter() {
//
//			@Override
//			public void notifyChanged(Notification notification) {
//				switch (notification.getEventType()) {
//				case ADD:
//					symoChangeHandler.handleAdd(notification, owlOntologyManager);
//					break;
//				case ADD_MANY:
//					symoChangeHandler.handleAddMany(notification, owlOntologyManager);
//					break;
//				case MOVE:
//					symoChangeHandler.handleMove(notification, owlOntologyManager);
//					break;
//				case NO_INDEX:
//					symoChangeHandler.handleNoIndex(notification, owlOntologyManager);
//					break;
//				case REMOVE:
//					symoChangeHandler.handleRemove(notification, owlOntologyManager);
//					break;
//				case REMOVE_MANY:
//					symoChangeHandler.handleRemoveMany(notification, owlOntologyManager);
//					break;
//				case REMOVING_ADAPTER:
//					symoChangeHandler.handleRemovingAdapter(notification, owlOntologyManager);
//					break;
//				case RESOLVE:
//					symoChangeHandler.handleResolve(notification, owlOntologyManager);
//					break;
//				case SET:
//					symoChangeHandler.handleSet(notification, owlOntologyManager);
//					break;
//				case UNSET:
//					symoChangeHandler.handleUnset(notification, owlOntologyManager);
//					break;
//				default:
//					System.out.println("Uncovered notification type: " + notification.getEventType());
//					break;
//				}
//			}
//		});
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
