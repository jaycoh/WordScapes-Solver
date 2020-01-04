package Tests;

import BoardSetup.Letters;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestLetters {


    private Letters letters;

    @BeforeEach
    void beforeEachTest() {
        ArrayList<String> lettersToUse = new ArrayList<>();

        lettersToUse.add("A");
        lettersToUse.add("B");
        lettersToUse.add("C");

        letters = new Letters(lettersToUse);
    }

    @Test
    void testGetLength() {
        ArrayList<String> testWords = new ArrayList<>();
        testWords.add("a");
        testWords.add("b");
        testWords.add("c");
        testWords.add("d");
        testWords.add("e");
        Letters testLetters = new Letters(testWords);

        assert(letters.getLength() == 3);
        assert(testLetters.getLength() == 5);

    }

    @Test
    void testNoDuplicates() {

    }



}
