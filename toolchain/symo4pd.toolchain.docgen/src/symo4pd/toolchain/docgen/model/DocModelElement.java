package symo4pd.toolchain.docgen.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Michael.Shamiyeh
 *
 */
public class DocModelElement {
	public static final String TYPE_ECOREMODEL = "EcoreModel";
	public static final String TYPE_EPACKAGE = "EPackage";
	public static final String TYPE_ECLASS = "EClass";
	public static final String TYPE_EENUM = "EEnum";
	public static final String TYPE_EDATATYPE = "EDataType";

	public static final String ENTRYNAME_DESCRIPTION = "Description";
	public static final String ENTRYNAME_MODIFIER = "Modifier";
	public static final String ENTRYNAME_BASE = "Base-Class";
	public static final String ENTRYNAME_KNOWNSUBS = "Known Sub-Classes";

	public static final String MODIFIER_INTERFACE = "Interface";
	public static final String MODIFIER_ABSTRACT = "Abstract";

	private String name;
	private String type;
	
	private Boolean createDocEntry = true;

	private Map<String, String> docEntries;

	private DocModelElement parent;
	private List<DocModelElement> children;

	DocModelElement(String name, String type) {
		setName(name);
		setType(type);

		docEntries = new HashMap<String, String>();
		children = new ArrayList<DocModelElement>();
	}

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}
	
	public Boolean getCreateDocEntry() {
		return createDocEntry;
	}

	public void setCreateDocEntry(Boolean createDocEntry) {
		this.createDocEntry = createDocEntry;
	}

	public Map<String, String> getDocEntries() {
		return docEntries;
	}

	public void setDocEntries(Map<String, String> docEntries) {
		this.docEntries = docEntries;
	}

	public DocModelElement getParent() {
		return parent;
	}

	public void setParent(DocModelElement parent) {
		this.parent = parent;
	}

	public List<DocModelElement> getChildren() {
		return children;
	}

	public void setChildren(List<DocModelElement> children) {
		this.children = children;
	}

	/**
	 * Adds a child to the children list and sets the parent property for the
	 * child element.
	 * 
	 * @param child
	 *            The child DocModel element.
	 */
	public void addChild(DocModelElement child) {
		this.children.add(child);
		child.setParent(this);
	}

	/**
	 * Determines the hierarchy level of the element. The hierarchy level
	 * corresponds to the number of nested parents.
	 * 
	 * @return The number of nested parents, 0 if the element has no parent.
	 */
	public int getHierarchyLevel() {
		int level = 0;

		DocModelElement current = this;
		while (current.getParent() != null) {
			current = current.getParent();
			level++;
		}

		return level;
	}
}
