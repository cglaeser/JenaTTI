package examples;

import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.*;

public class Example2 {
	
	public static Resource getBorg(){
	
	String personURI = "http://voyager/AnnikaHanson";
	String givenName = "Seven of Nine";
	String familyName = "Borg";
	String fullName = "Seven of Nine, Tertiary Attribute of Unimatrix 01";
	
	Model model = ModelFactory.createDefaultModel();
	
	Resource borgMember = model.createResource(personURI)
			 .addProperty(VCARD.FN, fullName)
             .addProperty(VCARD.N, 
                      model.createResource()
                           .addProperty(VCARD.Given, givenName)
                           .addProperty(VCARD.Family, familyName));
	return borgMember;
	}
}
