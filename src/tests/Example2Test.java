package tests;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.junit.Test;

public class Example2Test {

	@Test
	public void test() {
		Resource borg = examples.Example2.getBorg();
			List<Statement> s = borg.listProperties().toList();
			System.out.println(s);
	}

}
