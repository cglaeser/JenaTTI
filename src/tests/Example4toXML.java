package tests;

import org.apache.jena.rdf.model.Model;
import org.junit.Test;

import examples.Example3;

public class Example4toXML {
	@Test
	public void test() {
	Model model = Example3.getBorg();
	model.write(System.out);
	}
}
