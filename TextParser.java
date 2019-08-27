import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class TextParser {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        TextParser tp = new TextParser();
        System.out.println(tp.getAllWords().size());

    }


    public List<String> getText(String fileName) throws IOException {
        return Files.readAllLines(Paths.get(fileName));

    }


    public LinkedList<String> getAllWords() {
        try {
            LinkedList<String> allWordsCapitalized = new LinkedList<>();

            allWordsCapitalized.addAll(getText("Words1.txt"));

            for (String word : getText("Words2.txt")) {
                allWordsCapitalized.add(word.toUpperCase());
            }

            return allWordsCapitalized;

        } catch (Exception e) {
            return null;
        }
    }
}


