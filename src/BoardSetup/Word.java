package BoardSetup;

import java.util.*;

public class Word {
    // Class for each blank word in a layout. Each word has a length of type int and consists of an
    // ArrayList<BoardLayout.Tile>. Will be updated to include more
    // information later.

    private int wordLength;
    private ArrayList<Tile> letters;

    public Word(ArrayList<Tile> letters) {
        this.letters = letters;
        this.wordLength = letters.size();
    }

    public void makeNull() {
        for (Tile letter : this.letters) {
            letter.makeNull();
        }
    }

    public int getWordLength() {

        return wordLength;
    }

    public boolean isComplete() {
        for (Tile letter : this.letters) {
            if (letter.getLetter() == null) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Tile> getLetters() {

        return this.letters;
    }

    public Tile getTile(int index) {

        return this.letters.get(index);
    }

    public void setWord(String word) {
        int count = 0;
        while (count < word.length()) {
            getTile(count).setLetter(word.charAt(count) + "");
            count++;
        }
    }

    public void setWord(ArrayList<Tile> letters) {
        this.letters = letters;
    }

    public String returnWordString() {
        String wordString = "";
        for (Tile letter : this.letters) {
            if (letter.getLetter() == null) {
                wordString += "_";
            } else {
                wordString += letter.getLetter();
            }
        }
        return wordString;
    }

    public void toPrint() {
        System.out.println(returnWordString());
    }
}
