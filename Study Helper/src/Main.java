import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int qs;
        System.out.println("How many questions do you want to make?");
        qs = scanner.nextInt();
        while(qs == 0){
            scanner = new Scanner(System.in);
            System.out.println("You must create at least one question. Try again");
            qs = scanner.nextInt();
        }
        scanner.nextLine();
        for (int i = 0; i < qs; i++) {
            System.out.println(":What is the question");
            String question = scanner.nextLine();
            System.out.println("What is the answer");
            String answer = scanner.nextLine();
            questions.add(new Question(question, answer));
        }
        System.out.println("Do you want to start the quiz?");
        String whetherStart = scanner.nextLine();

        if (whetherStart.toUpperCase().equals("YES")){
            System.out.println("How many questions do you want to answer?");
            int numQuestions = scanner.nextInt();


            if(numQuestions > questions.size()){
                System.out.println("Questions stored are not enough. Pick number of questions that is less than or equal to " + questions.size());
                numQuestions = scanner.nextInt();
            }
            if(numQuestions <= questions.size()){
                Quiz newQuiz = new Quiz(questions);
                newQuiz.beginQuiz(numQuestions);

            }
        }
    }
}


