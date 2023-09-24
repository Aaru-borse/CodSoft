package Aarti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class Question {
    private String questionText;
    private List<String> options;
    private int correctOptionIndex;

    public Question(String questionText, List<String> options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }
}

class Quiz {
    private List<Question> questions;
    private int currentQuestionIndex;
    private int score;
    private Timer timer;

    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.currentQuestionIndex = 0;
        this.score = 0;
    }

    public void start() {
        if (currentQuestionIndex < questions.size()) {
            Question currentQuestion = questions.get(currentQuestionIndex);
            displayQuestion(currentQuestion);

           
            timer = new Timer();
            timer.schedule(new TimerTask() {
              
                public void run() {
                    System.out.println("Time's up! Moving to the next question.");
                    nextQuestion();
                }
            }, 20000); 

       
            int userAnswer = getUserAnswer(currentQuestion.getOptions().size());
            checkAnswer(currentQuestion, userAnswer);
        } else {
            endQuiz();
        }
    }

    private void displayQuestion(Question question) {
        System.out.println("Question: " + question.getQuestionText());
        List<String> options = question.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    private int getUserAnswer(int numOptions) {
        Scanner scanner = new Scanner(System.in);
        int userAnswer;
        do {
            System.out.print("Select an option (1-" + numOptions + "): ");
            userAnswer = scanner.nextInt();
        } while (userAnswer < 1 || userAnswer > numOptions);
        return userAnswer - 1;
    }

    private void checkAnswer(Question question, int userAnswer) {
        if (userAnswer == question.getCorrectOptionIndex()) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect!");
        }
        nextQuestion();
    }

    private void nextQuestion() {
        if (timer != null) {
            timer.cancel();
        }
        currentQuestionIndex++;
        start();
    }

    private void endQuiz() {
        System.out.println("Quiz Ended!");
        System.out.println("Your Score: " + score + " out of " + questions.size());
    }
}

public class Main2 {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();

       
        questions.add(new Question("What is the capital of France?",
                List.of("London", "Berlin", "Madrid", "Paris"), 3));

        questions.add(new Question("Which planet is known as the Red Planet?",
                List.of("Earth", "Mars", "Venus", "Jupiter"), 1));

        questions.add(new Question("What is 2 + 2?", List.of("3", "4", "5", "6"), 1));
        
        questions.add(new Question("Vitamin K is also known as?",
        		List.of("Riboflavin","Thiamine", "Ascorbic Acid", "Pentamine"), 2));

        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}
