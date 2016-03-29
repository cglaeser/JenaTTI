package tests;

import static org.junit.Assert.*;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.junit.Test;

import examples.Example3;

public class Example3Test {

	@Test
	public void test() {
		Model model = Example3.getBorg();
		// list the statements in the graph
	    StmtIterator iter = model.listStatements();
	    
	    // print out the predicate, subject and object of each statement
	    while (iter.hasNext()) {
	        Statement stmt      = iter.nextStatement();         // get next statement
	        Resource  subject   = stmt.getSubject();   // get the subject
	        Property  predicate = stmt.getPredicate(); // get the predicate
	        RDFNode   object    = stmt.getObject();    // get the object
	        
	        System.out.print(subject.toString());
	        System.out.print(" " + predicate.toString() + " ");
	        if (object instanceof Resource) {
	            System.out.print(object.toString());
	        } else {
	            // object is a literal
	            System.out.print(" \"" + object.toString() + "\"");
	        }
	        System.out.println(" .");
	    }
	}

}
