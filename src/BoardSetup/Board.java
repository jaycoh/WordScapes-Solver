package BoardSetup;

import Solver.BoardSolution;
import TextParser.TextParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;



public class Board {
    // Class for the board of a game. Constructor receives same information shown at start of a level: the letters,
    // minimum word size, and the layout of the solution. If no minimum word size given, assume 3.


    private Letters letters;
    private int minWordSize;
    private Layout layout;
    private final LinkedList<String> realWords = new TextParser().getAllWords();



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
        System.out.println("Letter combinations:");
        System.out.println(letterCombinations);
        ArrayList<String> realWords = getRealWords(letterCombinations);
        BoardSolution boardSolve = new BoardSolution(this.layout, realWords);
        System.out.println("Solving with words:");
        System.out.println(realWords);
        boardSolve.solve();

        for (Word word : this.layout.getWords()) {
            word.toPrint();
        }
    }

    public ArrayList<String> getRealWords(ArrayList<String> letterCombinations) {
        ArrayList<String> realWordCombinations = new ArrayList<>();

        for (String word : letterCombinations) {
            if (realWords.contains(word)) {
                realWordCombinations.add(word);
            }
        }
        System.out.println(realWordCombinations);
        return realWordCombinations;
    }
}
