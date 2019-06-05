public class ConnectPoint {
    // Class for the connecting point of two words. ConnectingPoint contains:
    // - int key: unique value to map together the ConnectingPoint of 2 words
    // - int index: value for character index of the word that contains
    // - String letter: String representing the letter at that connecting point

    private int key;
    private int index;
    private String letter;

    public ConnectPoint(int key, int index) {
        this.key = key;
        this.index = index;
    }
}
