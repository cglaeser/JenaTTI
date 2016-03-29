package examples;

import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.*;

public class Example3 {
	
	public static Model getBorg(){
	
	String personURI = "http://voyager/AnnikaHanson";
	String givenName = "Seven of Nine";
	String familyName = "Tertiary Attribute of Unimatrix 01, Borg";
	String fullName = givenName + ", " + familyName;
	
	Model model = ModelFactory.createDefaultModel();
	
	Resource borgMember = model.createResource(personURI)
			 .addProperty(VCARD.FN, fullName)
             .addProperty(VCARD.N, 
                      model.createResource()
                           .addProperty(VCARD.Given, givenName)
                           .addProperty(VCARD.Family, familyName));
	
	
	return model;
	}
}
