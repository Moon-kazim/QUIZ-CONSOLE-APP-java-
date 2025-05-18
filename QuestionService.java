import java.util.Arrays;
import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5]; 

    public QuestionService()
    {
        String[] options1 = {"class", "new", "public", "static"};
        questions[0] = new Question(1, "Which of the following keywords is used to create an object in Java?", options1 ,  "new");
        
        String[] options2 = {"int", "float", "String", "boolean" };
        questions[1] = new Question(2, "Which of the following data types is NOT a primitive data type in Java?", options2, "String");
        
        String[] options3 = {};
        questions[2] = new Question(3, "What is the default value of an int variable?", options3, "0");

        String[] options4 ={"1", "2", "0", "2.5"};
        questions[3] = new Question(4, "int a = 5;\n" + //
                        "int b = 2;\n" + //
                        "System.out.println(a % b);", options4, "1");

        String[] options5 = {"4", "5", "6", "7"};
        questions[4] =new Question(5, "String str = \"Hello\";\n" + //
                        "System.out.println(str.length())", options5, "5");
        
    }
    public void playQuiz()
    {
        // using enhance for loop to print all questions at once
        int i=0;
        for (Question allQuestions:questions)
        {
            System.out.println("Question Number: " + allQuestions.getId());
            System.out.println(allQuestions.getQuestion());
            // System.out.println(allQuestions.getOption());
            System.out.println(Arrays.toString(allQuestions.getOption()));
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;

            System.out.println();
        }
        for (String s :selection)
            System.out.println(s);

        // int i = 0;
        // if(i<5)
        //     System.out.println(questions[i]);
        //     i++;
        
    }
    public void printScore()
    {
        int score = 0;
        for (int i = 0; i < questions.length; i++)
        {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];
            
            // if (actualAnswer == userAnswer) 
            if(actualAnswer.equals(userAnswer))
            {
                score++;
            }
        }
        System.out.println("Your score is : "+ score);
    }
}
