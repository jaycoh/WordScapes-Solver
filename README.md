# WordScapes-Solver
Generates a potential solution for the mobile game WordScapes. In this game the player is given a set of letters and have to find words that interconnect in a crossword-style layout.

Classes:

Board - The class representing the overall board of a level. A board consists of a layout (of type Layout), the letters given (of type Letters), and the minimum word length. If no minimum length is given, the default is 3. The only method this class has is solve(), which returns the solved board.

Letters - The class representing the letters in the game, an ArrayList<String> that consists of each letter. This class creates all the potential words in the game using natural recursion.
  
Word - Class representing an individual word in the board layout. Consists of a word length and will be refactored to include all the connecting points (of type Connecting Point) to other words.

Layout - Represents the layout of the whole board. Is an ArrayList<Word>.
  
ConnectingPoint (in progress) - Represents the connecting point between words. Currently consists of the index of the word that the connection occurs and a unique key to identify which two words connect. Will be refactored to also include the letter that occurs at that connection.

BoardSolution - Consumes the layout and the potential words and produces a solution using a Search algorithm.




