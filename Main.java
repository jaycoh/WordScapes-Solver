import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
       ArrayList<String> letters = new ArrayList<String>();
       ArrayList<Word> wordLengths = new ArrayList<Word>();
       Word first = new Word(3);
       Word second = new Word(4);
       Word third = new Word(3);
       Word fourth = new Word(5);
       wordLengths.add(first);
       wordLengths.add(second);
       wordLengths.add(third);
       wordLengths.add(fourth);

       Layout layout = new Layout(wordLengths);
       letters.add("a");
       letters.add("b");
       letters.add("c");
       letters.add("d");
       letters.add("e");
       Letters letters1 = new Letters(letters);
       Board gameBoard = new Board(letters1, 3, layout );
       ArrayList<String> words = letters1.makeWords(3, 5);
       BoardSolution newSol = new BoardSolution(layout, words);
       ArrayList<String> xd = new ArrayList<String>();
       System.out.println(newSol.solveBoard(xd, wordLengths));


    }
}