import java.util.ArrayList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BoardSolution {
    // Class used to solve the board.

    private ArrayList<String> potentialWords;
    private Layout layout;

    public BoardSolution(Layout layout, ArrayList<String> potentialWords) {
        this.potentialWords = potentialWords;
        this.layout = layout;

    }

    public void getPotentialWords() {

        System.out.println(potentialWords);
    }

    public boolean validWord(String word, Word placement) {
        // Determines if a word is valid for a specific placement. Depends on length of word and previously set tiles

        if (correctLength(word, placement)) {
                return matchesTiles(word, placement);
        }
        return false;
    }

    public boolean correctLength(String word, Word placement) {

        return (word.length() == placement.getWordLength());

    }

    public boolean matchesTiles(String word, Word placement) {

        int count = 0;

        while (count < placement.getWordLength()) {
            if (placement.getTile(count).getLetter() != null) {
                if (!sameLetter(word, placement, count)) {
                    return false;
                }

            }
            count++;
        }
        return true;
    }



    public boolean sameLetter(String word, Word placement, int index) {
        return placement.getTile(index).getLetter().equals(word.charAt(index) + "");
    }

    public ArrayList<Word> solveBoard(ArrayList<Word> wordSpaces) {
        if (isFinished(wordSpaces)) {
            return wordSpaces;
        }

            ArrayList<String> containedWords = containedWords(wordSpaces);
            Word wordToSolve = findNextWord(wordSpaces);
            ArrayList<Tile> currentLetters = wordToSolve.getLetters();
            ArrayList<String> potentialWords = validNextWords(wordToSolve, containedWords);

            for (String potentialWord : potentialWords) {
                wordToSolve.setWord(potentialWord);
                ArrayList<Word> check = solveBoard(wordSpaces);
                if (check != null) {
                    return check;
                }
                wordToSolve.setWord(currentLetters);
            }
            return null;
    }

    public ArrayList<Word> solve() {
        return solveBoard(layout.getWords());
    }

    public ArrayList<String> validNextWords(Word wordToSolve, ArrayList<String> usedWords) {
        ArrayList<String> wordChoices = new ArrayList<>();
        for (String word : this.potentialWords) {
            if (!usedWords.contains(word) && validWord(word, wordToSolve)) {
                wordChoices.add(word);
            }
        }
        return wordChoices;
    }



    public Word findNextWord(ArrayList<Word> wordList) {
        for (Word word : wordList) {
            if (!word.isComplete()) {
                return word;
            }
        }
        return null;
    }

    public ArrayList<String> containedWords(ArrayList<Word> listOfWord) {
        ArrayList<String> containedWords = new ArrayList<String>();
        for (Word word : listOfWord) {
            if (word.isComplete()) {
                containedWords.add(word.returnWordString());
            }
        }
        return containedWords;
    }

    public boolean isFinished(ArrayList<Word> wordList) {
        for (Word word : wordList) {
            if (!word.isComplete()) {
                return false;
            }
        }
        return true;
    }
}
