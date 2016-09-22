package de.symo.ontology.git;

import java.io.IOException;

import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

public class OntologyRepositoryManager {
	public OntologyRepositoryManager() {
		FileRepositoryBuilder repositoryBuilder = new FileRepositoryBuilder();
		repositoryBuilder.setMustExist( true );
		//repositoryBuilder.setGitDir("");
		try {
			Repository repository = repositoryBuilder.build();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
