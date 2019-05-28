import java.util.ArrayList;

public class Board {

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

    public ArrayList<String> solve() { //change void later
        int maxWordLength = this.letters.getLength();
        this.words = this.letters.makeWords(this.minWordSize, maxWordLength);
        this.solution = new BoardSolution(this.layout, this.words);
        return this.solution.solve();
       // generateSolution();


    }

}
