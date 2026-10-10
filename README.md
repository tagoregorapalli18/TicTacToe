# Tic-Tac-Toe Java Project

## 1. Project Overview

Tic-Tac-Toe is a simple two-player game developed using Java. The game is played on a 3×3 board where players take turns marking positions with `X` and `O`.

The objective is to place three marks in a horizontal, vertical, or diagonal line before the opponent does.

## 2. Objectives

- Develop a simple game using Java.
- Understand object-oriented programming concepts.
- Practice loops, conditional statements, arrays, and methods.
- Implement winner and draw detection.
- Validate user input and prevent invalid moves.

## 3. Technologies Used

- **Programming Language:** Java
- **IDE:** Eclipse IDE
- **User Interface:** Console-based
- **Input Handling:** Java Scanner

## 4. Project Structure

```text
TicTacToe/
├── src/
│   └── TicTacToe.java
└── README.md
```

## 5. Features

- Two-player gameplay.
- Player 1 uses `X`.
- Player 2 uses `O`.
- Interactive 3×3 game board.
- Input validation for positions 1–9.
- Prevents players from selecting occupied positions.
- Detects horizontal, vertical, and diagonal wins.
- Detects a draw when all positions are filled.

## 6. Game Rules

1. The game starts with Player 1 (`X`).
2. Players take turns selecting a position from 1 to 9.
3. Each position can be selected only once.
4. A player wins by placing three marks in a row, column, or diagonal.
5. If all nine positions are occupied and nobody wins, the game ends in a draw.

## 7. How to Run the Project in Eclipse

1. Open Eclipse IDE.
2. Select **File → New → Java Project**.
3. Enter the project name `TicTacToe`.
4. Click **Finish**.
5. Right-click the `src` folder and select **New → Class**.
6. Enter `TicTacToe` as the class name.
7. Paste the Java source code into `TicTacToe.java`.
8. Save the file using **Ctrl + S**.
9. Right-click `TicTacToe.java`.
10. Select **Run As → Java Application**.
11. Enter your moves in the Eclipse Console.

## 8. Sample Output

```text
=== Tic-Tac-Toe ===
Player 1: X | Player 2: O

 1 | 2 | 3
---+---+---
 4 | 5 | 6
---+---+---
 7 | 8 | 9

Player X, choose a position (1-9): 1
```

The board updates after each valid move. When a player wins, the program displays the winner. If neither player wins, it displays a draw message.

## 9. Future Enhancements

- Add a graphical user interface using Java Swing or JavaFX.
- Add a single-player mode against the computer.
- Add a replay option.
- Track player scores across multiple games.
- Improve the design with colors and animations.

## 10. Conclusion

The Tic-Tac-Toe Java project demonstrates fundamental Java programming concepts through an interactive game. It provides practical experience with arrays, loops, methods, conditional statements, and user input validation.

This project is suitable for beginners learning Java and for academic mini-project demonstrations.
