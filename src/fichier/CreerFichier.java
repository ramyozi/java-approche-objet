package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/ramzi/Downloads/recensement.csv");
		
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        List<String> first100Lines = lines.subList(0, Math.min(100, lines.size()));

		 for (String line : first100Lines) {
	            System.out.println(line);
	        }

	}

}
