package BoardSetup;

import java.util.ArrayList;

// Class representing the letters on the board of a game, and the methods operating on them.

public class Letters {

    private ArrayList<String> letters;


    public Letters(ArrayList<String> letters) {
        this.letters = letters;
    }

    public ArrayList<String> makeWordsGivenBase(String base, ArrayList<String> remainingLetters, int lettersToAdd ) {
        // Creates words of a certain size from a list of letters, operates with natural recursion
        ArrayList<String> wordsOfSize = new ArrayList<String>();

        if (lettersToAdd == 1) {
            // Base case
            for (String letter : remainingLetters) {
                String nextWord = base + letter;
                wordsOfSize.add(nextWord);
            }

        } else {

            for (int count = 0; count < remainingLetters.size(); count++) {
                // Natural Recursion
                wordsOfSize.addAll(
                        makeWordsGivenBase(base + remainingLetters.get(count),
                                removeIndex(remainingLetters, count), lettersToAdd - 1));


            }

        }
        return wordsOfSize;
    }

    public ArrayList<String> makeWords(int minLength, int maxLength) {
        // make the words with a range of sizes
        ArrayList<String> wordList = new ArrayList<String>();
       
        for (int count = minLength; count <= maxLength; count++) {

            wordList.addAll(makeWordsGivenBase("", this.letters, count));
        }
        return wordList;
    }

    public ArrayList<String> removeIndex(ArrayList<String> letters, int i) {
        // Returns a new ArrayList with a removed index i. Used to remove a letter from the array of letters.
        int count = 0;
        ArrayList<String> newLetters = new ArrayList<String>();
        while (count < letters.size()) {
            if (!(count == i)) {
                newLetters.add(letters.get(count));
            }
            count++;
        }
        return newLetters;
    }


    public int getLength() {
        return letters.size();
    }
}
