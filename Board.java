import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Board {
    // Class for the board of a game. Constructor receives same information shown at start of a level: the letters,
    // minimum word size, and the layout of the solution. If no minimum word size given, assume 3.


    private Letters letters;
    private int minWordSize;
    private Layout layout;
    private ArrayList<String> words;
    private BoardSolution solution;


    public Board(Letters letters, int minWordSize, Layout layout) {
        this.letters = letters;
        this.minWordSize = minWordSize;
        this.layout = layout;

    }

    public Board(Letters letters, Layout layout) {
        this.letters = letters;
        this.minWordSize = 3;
        this.layout = layout;

    }

    public void solveBoard() throws IOException {
        ArrayList<String> letterCombinations = letters.makeWords(minWordSize, this.letters.getLength());
        ArrayList<String> realWords = getRealWords(letterCombinations);
        BoardSolution boardSolve = new BoardSolution(this.layout, realWords);
        boardSolve.solve();

        for (Word word : this.layout.getWords()) {
            word.toPrint();
        }
    }

    public ArrayList<String> getRealWords(ArrayList<String> letterCombinations) throws IOException {
        ArrayList<String> realWordCombinations = new ArrayList<>();
        TextParser tp = new TextParser();
        List<String> realWords = tp.getText();
        for (String word : letterCombinations) {
            if (realWords.contains(word)) {
                realWordCombinations.add(word);
            }
        }
        return realWordCombinations;
    }
}
