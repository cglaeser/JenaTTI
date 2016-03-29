package tests;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.junit.Test;

public class Example1Test {

	@Test
	public void test() {
		Resource jd = examples.JohnDoe.makeDoe();
			List<Statement> s = jd.listProperties().toList();
			System.out.println(s);
	}

}
