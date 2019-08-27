import java.io.IOException;
import java.util.ArrayList;

public class Main {
    // Currently used for testing purposes

    public static void main(String[] args) throws IOException {

        Tile t1 = new Tile();
        Tile t2 = new Tile();
        Tile t3 = new Tile();
        Tile t4 = new Tile();
        Tile t5 = new Tile();
        Tile t6 = new Tile();
        Tile t7 = new Tile();
        Tile t8 = new Tile();
        Tile t9 = new Tile();
        Tile t10 = new Tile();
        Tile t11 = new Tile();
        Tile t12 = new Tile();
        Tile t13 = new Tile();
        Tile t14 = new Tile();
        Tile t15 = new Tile();
        Tile t16 = new Tile();
        Tile t17 = new Tile();
        Tile t18 = new Tile();
        Tile t19 = new Tile();


        ArrayList<Tile> w1 = new ArrayList<>();
        ArrayList<Tile> w2 = new ArrayList<>();
        ArrayList<Tile> w3 = new ArrayList<>();
        ArrayList<Tile> w4 = new ArrayList<>();
        ArrayList<Tile> w5 = new ArrayList<>();
        ArrayList<Tile> w6 = new ArrayList<>();
        ArrayList<Tile> w7 = new ArrayList<>();
        ArrayList<Tile> w8 = new ArrayList<>();

        w1.add(t1);
        w1.add(t2);
        w1.add(t3);
        w1.add(t4);

        w2.add(t3);
        w2.add(t5);
        w2.add(t6);

        w3.add(t6);
        w3.add(t7);
        w3.add(t8);

        w4.add(t1);
        w4.add(t9);
        w4.add(t10);


        w5.add(t11);
        w5.add(t12);
        w5.add(t10);

        w6.add(t12);
        w6.add(t13);
        w6.add(t14);

        w7.add(t8);
        w7.add(t15);
        w7.add(t16);

        w8.add(t17);
        w8.add(t14);
        w8.add(t18);
        w8.add(t19);

        Word first = new Word(w1);
        Word second = new Word (w2);
        Word third = new Word (w3);
        Word fourth = new Word (w4);
        Word fifth = new Word (w5);
        Word sixth = new Word (w6);
        Word seventh = new Word(w7);
        Word eighth = new Word(w8);



        ArrayList<Word> gameWords = new ArrayList<>();
        gameWords.add(eighth);
        gameWords.add(sixth);
        gameWords.add(fifth);
        gameWords.add(fourth);
        gameWords.add(first);
        gameWords.add(second);
        gameWords.add(third);
        gameWords.add(seventh);


        Layout wordLay = new Layout(gameWords);



        ArrayList<String> letters1 = new ArrayList<String>();
        letters1.add("B");
        letters1.add("E");
        letters1.add("A");
        letters1.add("T");

        Letters letters = new Letters(letters1);



        Board board = new Board(letters, 3, wordLay);
        board.solveBoard();





    }
}
