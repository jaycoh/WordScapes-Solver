import java.util.ArrayList;

public class Layout {
    // Class for the layout of the words in a game, an ArrayList<Word>

    private ArrayList<Word> words;

    public Layout(ArrayList<Word> words) {

        this.words = words;
    }

    public ArrayList<Word> getWords() {

        return this.words;
    }

    public Word getWord(int index) {
        return this.words.get(index);
    }

    public void printWords() {
        for (Word word : this.words) {
            word.toPrint();
        }
    }


}

