# WordScapes-Solver

# Background

This is my first programming project, with the bulk of it being completed within June 2019, with one programming course (that used a learner language) under my belt and approximately one month of self-studying java online. Certain aspects, such as the file reader, were updated in August, once I had a course on software construction and Object Oriented Programming.

# Purpose

Generates a potential solution for the mobile game WordScapes. In this game the player is given a set of letters and use them to find words that interconnect in a crossword-style layout.

# Classes:

Board - The class representing the overall board of a level. A board consists of a layout (of type Layout), the letters given (of type Letters), and the minimum word length. If no minimum length is given, the default is 3. The only non-helper method this class has is solve(), which outputs a solved board.

BoardSolution - Takes in a list of potential words and a layout and generates a valid solution for the layout using the words given. Board is solved in the solve() method using search algorithms.


Layout - Represents the layout of the whole board. Consists of an ArrayList<Word>.
 
Letters - The class representing the letters in the game, an ArrayList<String> that consists of each letter. This class creates all the potential words in the game using natural recursion.
  
TextParser - Used to retrieve the list of words used as a dictionary by the program.

Tile - Represents the tile in a word. Has a field of type string that either has the value of a single upper-case letter or null (if the tile has not yet been assigned a letter).
  
Word - Class representing an individual word in the board layout. Consists of a list of tiles, which must be in the order they appear in the actual word they represent.

# Sources

The following resources aided me in the completion of this project:

  - http://moocfi.github.io/courses/2013/programming-part-1/
  - Code given to me by the course I was taking later in the summer to retrieve data from text files*
  - a minor suggestion from a peer**

# Limitations

There were two main factors that limited my ability to create an effective program:

 - The game does not use a standard dictionary. There are many cases where a word is recognized as valid in one level, and then not        recognized in another. Additionally, there are some slang words used that do not show up in dictionaries. As a result, I have to use    a large dictionary that will contain most of the words used in the game.
 
 - There is no way to know (without hard coding it in) the exact solution for any given level. Because of this, the program outputs the    first viable solution found.



* Code given:
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("inputfile.txt"));;
        PrintWriter writer = new PrintWriter("outputfile.txt","UTF-8");
        lines.add("Trey Coordinator");
        for (String line : lines){
            ArrayList<String> partsOfLine = splitOnSpace(line);
            System.out.print("Name: "+partsOfLine.get(0)+" ");
            System.out.println("Role: "+partsOfLine.get(1));
            writer.println(line);
        }
        writer.close(); //note -- if you miss this, the file will not be written at all.
    }


    public static ArrayList<String> splitOnSpace(String line){
        String[] splits = line.split(" ");
        return new ArrayList<>(Arrays.asList(splits));
    }
  
** The suggestion was to use a system of shared tiles to model the layout of the board. Before this suggestion, I had been trying to create a connecting point within each word that would let the program know when and which words overlap. You can see the very start of this implementation in an older push. This peer in no way wrote any code or designed anyting for this program.

