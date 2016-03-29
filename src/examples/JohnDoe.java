package examples;

import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.*;

public class JohnDoe extends Object {
	// some definitions
	static String personURI    = "http://haw-hamburg.de/JohnDoe";
	static String fullName     = "John Doe";
	
	public static Resource makeDoe(){
	// create an empty Model
	Model model = ModelFactory.createDefaultModel();

	// create the resource
	Resource johnDoe = model.createResource(personURI);

	// add the property
	johnDoe.addProperty(VCARD.FN, fullName);
	
	return johnDoe;
	}
 
}
