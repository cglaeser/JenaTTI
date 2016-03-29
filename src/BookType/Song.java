package BookType;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.DC;
import org.apache.jena.vocabulary.VCARD;

public class Song {
	public static Model createSong(){
		String SongURI = "http://asong/candle";
		String Title="Candle in the Wind";
		String Subject="Diana, Princess of Wales";
		String Date="1997";
		String Creator="John, Elton";
		String Type="sound";
		String Description="Tribute to a dead princess";
		String Relation="IsVersionOf Elton John's 1976 song Candle in the Wind";
		
		Model model = ModelFactory.createDefaultModel();
		
		Resource song = model.createResource(SongURI)
				 .addProperty(DC.title, Title)
	            .addProperty(DC.subject,Subject)
	            .addProperty(DC.date,Date)
	            .addProperty(DC.creator,Creator)
	            .addProperty(DC.type,Type)
	            .addProperty(DC.description,Description)
	            .addProperty(DC.relation,Relation);
		
		
		return model;
	}
}
