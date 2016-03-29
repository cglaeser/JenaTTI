package tests;

import org.apache.jena.rdf.model.Model;
import org.junit.Test;

import examples.Example3;
import examples.Example5readFile;

public class Example5fromXML {
	@Test
	public void test() {
	Model model = Example5readFile.readModel();
	model.write(System.out);
	}
}
