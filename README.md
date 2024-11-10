# Introduction - Tic-Tac-Toe
This project is a Tic-Tac-Toe game in Java. The project contains all the rules of Tic-Tac-Toe, such as playing with an 'X' or an 'O', and all the possible win, loss, and draw scenarios.

# Installation
Download the .java file named TicTacToe.java. Be sure to uncomment the first line in the .java file containing "package tictactoe;." Change the package name to the name of the package on your local machine, if necessary.

# Usage
To play, run the code. You will then be prompted with a welcoming introduction and for Player 1 (X) to make their move. Enter your move. The format for entering your move is row and column. The first row is row 0, the second row is row 1, and the third row is row 3. The first column is column 0, the second column is column 1, and the third column is column 2. So, an example input can be "1 2." This indicates row 2, column 3. If your move is invalid (the spot on the board is already taken), you will be prompted to re-enter your move. The program then asks Player 2 (O) to make their move. The game repeats between Player 1 (X) and Player 2 (O) until there is a winner or a draw.

**Example of move 1 2:** (https://imgur.com/a/FORFd9w)

**Example of Player 1 (X) win:** (https://imgur.com/a/crxQV6s)

# Limitations
Be sure to enter the input in the **EXACT** format as listed in the Usage section. Failure to follow the exact format will crash the program.

# Method Explanation
**checkWinner()** is a boolean method that determines if there is a winner or not. It checks every possible win case for Player 1 (X) and Player 2 (O) through the use of if statements and the board array. First, the method initializes int returnCounter to 0. Then, using if statements, it goes through each of the possible win scenarios (horizontal, vertical, and diagonal) and sets returnCounter to 1 if any of these win scenarios are true. After checking all the possible win scenarios, the method runs an if-else statement and returns false (no winner) if returnCounter is 0. Otherwise, the method returns true (yes winner).

**Example of Player 1 (X) win across on first row:** (https://imgur.com/nCe3SEH)

# Support
For support or contact, reach out to Saif Chaudhry via chaudhrysa@g.cofc.edu or saifchaudhry2@gmail.com.

# Roadmap
In the future, the progarm will include error handling to prevent the program from crashing if the user enters an invalid input format.

# Contribution
Other developers may contribute, edit, or further develop the program, but must cite Saif Chaudhry and chaudhrysa@g.cofc.edu.

# Authors and Acknowledgment
**Anurag Tiwari:** Provided starter code such as method names and some variables.

**Saif Chaudhry:** Wrote code to complete the starter code. Utilized all these methods together in the main method.

# License
Student Programming Project for College of Charleston
