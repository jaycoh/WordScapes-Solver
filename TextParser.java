import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static sun.misc.PostVMInitHook.run;

public class TextParser {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        TextParser tp = new TextParser();
        System.out.println("First size: " + tp.getText().size());
        tp.editText();
        System.out.println("Size after editing: " + tp.getText().size());
    }


    public List<String> getText() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("newWords.txt"));
        return lines;
    }

    public void editText() throws FileNotFoundException, UnsupportedEncodingException, IOException {
        List<String> lines = getText();

        PrintWriter writer = new PrintWriter("newWords.txt", "");
        for (String line : lines) {
            System.out.println(line);
            writer.println(line.toUpperCase());
        }

    }
}


