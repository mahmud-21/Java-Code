# High School General Knowledge Quiz

A simple, interactive Java console application that allows users to take a general knowledge quiz. The application reads questions dynamically from a text file, provides immediate feedback, and saves the player's score to a persistent record.

## 🚀 Features

* **Dynamic Question Loading:** Reads quiz questions, options, and answers from an external `questions.txt` file.
* **Interactive Gameplay:** Prompts the user for their name and input via the command line.
* **Instant Feedback:** Tells the user immediately if they are correct or wrong, and displays the correct answer if they miss it.
* **Score Tracking:** Calculates the final score based on total questions loaded.
* **Persistent Leaderboard:** Saves the player's name and score to a `scores.txt` file automatically.

## 📂 Project Structure

├── GeneralKnowledgeQuiz.java  # Main source code
├── questions.txt              # Data file containing quiz questions (You must create this)
├── scores.txt                 # Auto-generated file storing player results
└── README.md                  # Project documentation
## Source Code 
~~~
import java.io.*;
import java.util.Scanner;

public class GeneralKnowledgeQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int totalQuestions = 0;

        System.out.println("=== HIGH SCHOOL GENERAL KNOWLEDGE QUIZ ===");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("questions.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                totalQuestions++;
                System.out.println("Q" + totalQuestions + ": " + parts[0]);
                System.out.println("1. " + parts[1]);
                System.out.println("2. " + parts[2]);
                System.out.println("3. " + parts[3]);
                System.out.println("4. " + parts[4]);


                System.out.print("Your answer (1-4): ");
                int answer = scanner.nextInt();
                int correct = Integer.parseInt(parts[5]);


                if (answer == correct) {
                    System.out.println("Correct!\n");
                    score++;
                } else {
                    System.out.println("Wrong! Answer was: " + parts[correct] + "\n");
                }
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading questions.txt");
            return;
        }

        System.out.println("=================================");
        System.out.println("Player: " + name);
        System.out.println("Score: " + score + "/" + totalQuestions);
        System.out.println("=================================");

        try {
            FileWriter writer = new FileWriter("scores.txt", true);
            writer.write(name + " - " + score + "/" + totalQuestions + "\n");
            writer.close();
            System.out.println("Score saved to scores.txt");
        } catch (IOException e) {
            System.out.println("Error saving score");
        }

        scanner.close();
    }
}
~~~
# The Questions
~~~
What is the capital of France?|London|Berlin|Paris|Madrid|3
Which planet is known as the Red Planet?|Mars|Venus|Jupiter|Saturn|1
What is H2O?|Gold|Water|Silver|Oxygen|2
Who wrote Romeo and Juliet?|Dickens|Hemingway|Shakespeare|Chaucer|3
~~~
