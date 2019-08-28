package BoardSetup;

import java.util.ArrayList;

// Class representing the letters on the board of a game, and the methods operating on them.

public class Letters {

    private ArrayList<String> letters;
    private ArrayList<String> WordScapeWords;

    public Letters(ArrayList<String> letters) {
        this.letters = letters;
    }

    public ArrayList<String> makeWords_base(String base, ArrayList<String> remainingLetters, int lettersToAdd ) {
        // Creates words of a certain size from a list of letters, operates with natural recursion
        ArrayList<String> wordsOfSize = new ArrayList<String>();
        if (lettersToAdd == 1) {
            // Base case
            for (String letter : remainingLetters) {
                String nextWord = base + letter;
                wordsOfSize.add(nextWord);
            }

        } else {

            int count = 0;
            while (count < remainingLetters.size()) {
                // Natural Recursion
                combineArray(wordsOfSize,
                        makeWords_base(base + remainingLetters.get(count),
                                removeIndex(remainingLetters, count), lettersToAdd - 1));

                count++;
            }

        }


        return wordsOfSize;
    }

    public ArrayList<String> makeWords(int minLength, int maxLength) {
        // Abstract function to make the words with a range of sizes
        ArrayList<String> wordList = new ArrayList<String>();
        int count = minLength;

        while (count <= maxLength) {
            combineArray(wordList, makeWords_base("", this.letters, count ));
            count++;
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


    public void combineArray(ArrayList<String> arr1, ArrayList<String> arr2) {
        // Appends second array to end of first array
        for (String element : arr2) {
            arr1.add(element);
        }
    }



    public ArrayList<String> removeDuplicates(ArrayList<String> originalArray) {
        // Removes all duplicates from an array
        ArrayList<String> newArray = new ArrayList<String>();
        for (String element : originalArray) {
            if (!newArray.contains(element)) {
                newArray.add(element);
            }
        }
        return newArray;
    }

    public int getLength() {
        return letters.size();
    }
}
