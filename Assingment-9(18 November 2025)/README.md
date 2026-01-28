# MathPuzzle

**MathPuzzle** is an interactive Java console game that tests your mathematical skills. It loads questions dynamically from a text file, quizzes you based on your selected difficulty level, and saves your results to a permanent scorecard.

## 🎮 Game Features

* **Dynamic Question Loading:** Reads quiz questions from an external file (`questions.txt`).
* **Difficulty Levels:**
    * **Easy:** 5 Questions
    * **Medium:** 7 Questions
    * **Hard:** 10 Questions
* **Score Tracking:** Appends your name, difficulty choice, and final score to a `score.txt` file.

---

## ⚙️ Setup Instructions (Important)

**Before running the game**, you must create a file named `questions.txt` in the same directory as your Java code. This file contains the math problems the game will ask.

### File Format
Write one question per line in the format: `Question = Answer`

### Example `questions.txt` content:

5 + 5 = 10
12 * 2 = 24
100 / 4 = 25
15 - 7 = 8
3 * 3 + 1 = 10
50 + 50 = 100
9 * 9 = 81
120 / 10 = 12
2 * 2 * 2 = 8
10 + 20 + 30 = 60

# Source Code
~~~
import java.io.*;
import java.util.*;

public class MathPuzzle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter difficulty (easy / medium / hard): ");
        String difficulty = input.nextLine().toLowerCase();

        int questionsToAsk = 5;
        if (difficulty.equals("medium")) questionsToAsk = 7;
        else if (difficulty.equals("hard")) questionsToAsk = 10;

        int score = 0;

        try {
            File qFile = new File("questions.txt");
            Scanner qReader = new Scanner(qFile);

            List<String> questions = new ArrayList<>();
            List<Integer> answers = new ArrayList<>();

            while (qReader.hasNextLine()) {
                String line = qReader.nextLine();
                String[] parts = line.split("=");
                questions.add(parts[0].trim());
                answers.add(Integer.parseInt(parts[1].trim()));
            }

            qReader.close();

            for (int i = 0; i < questionsToAsk && i < questions.size(); i++) {
                System.out.print(questions.get(i) + "= ");
                int userAns = input.nextInt();

                if (userAns == answers.get(i)) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! Correct answer: " + answers.get(i));
                }
            }

            FileWriter writer = new FileWriter("score.txt", true);
            writer.write(name + " | Difficulty: " + difficulty + " | Score: " + score + "\n");
            writer.close();

            System.out.println("\nGame Over! Your score has been saved.");

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
~~~

