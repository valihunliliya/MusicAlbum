package ParsingJason;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;


public class JacksonUsage {

	public static void main(String[] args) throws JsonParseException,
			JsonMappingException, IOException {
		InputStream input = new FileInputStream("src/album.json");
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		objectMapper
				.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		TypeFactory typeFactory = TypeFactory.defaultInstance();
		List<AlbumDTO> album = objectMapper.readValue(input, typeFactory
				.constructCollectionType(ArrayList.class, AlbumDTO.class));

		// printing out ArrayList
		//System.out.println(" ArrayList Elements");
		//System.out.println("\t" + album.toString());

		Collections.sort(album, new ComparatorClass());
		for (AlbumDTO song : album) {
			System.out.println(song.toString());
		}
	}

}
