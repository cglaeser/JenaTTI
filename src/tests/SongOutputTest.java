package tests;

import static org.junit.Assert.*;

import org.apache.jena.rdf.model.Model;
import org.junit.Test;

import BookType.Song;
import examples.Example3;

public class SongOutputTest {

	@Test
	public void test() {
		Model model = Song.createSong();
		model.write(System.out);
	}

}
