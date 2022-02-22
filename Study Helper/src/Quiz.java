import java.util.ArrayList;
import java.util.Scanner;

public class Quiz{
    private ArrayList<Question> questions = new ArrayList<>();
    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
    }

    private ArrayList<Question> shuffleList(ArrayList<Question> arrayIn){
        ArrayList<Question> newList = arrayIn;
        for (int i = 0; i < arrayIn.size(); i++) {
            int index =(int) (Math.random()* arrayIn.size());
            Question temp = newList.get(index);
            newList.set(index, arrayIn.get(i));
            newList.set(i, temp);
        }
        return newList;
    }

    public void beginQuiz(int numQs){
        ArrayList<Question> quizQuestions = shuffleList(questions);
        Scanner quizScanner = new Scanner(System.in);
        int numCorrect = 0;
        for (int i = 0; i < numQs; i++) {
            String quizQuestion = quizQuestions.get(i).getQuestion();
            System.out.println(quizQuestion);
            String userAns = quizScanner.nextLine();
            if(userAns.contains(quizQuestions.get(i).getAnswer())){
                System.out.println("Correct");
                numCorrect++;
            }
            else{
                System.out.println("Wrong");
            }
        }
        System.out.println("You got " + numCorrect + " question(s) right.");
    }
}

