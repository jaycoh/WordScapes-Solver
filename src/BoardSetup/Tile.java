package BoardSetup;

public class Tile {

    private String letter;

    public Tile() {
        this.letter = null;
    }

    public Tile(String letter) {
        this.letter = letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public void makeNull() {
        this.letter = null;
    }

    public String getLetter() {
        return this.letter;
    }

    public void removeLetter() {
        this.letter = null;
    }

    public boolean hasLetter() {
        return this.letter != null;
    }
}
