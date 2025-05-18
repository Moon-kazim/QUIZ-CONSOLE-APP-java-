import java.util.Arrays;

public class Question {
    private int id;
    private String Question;
    private String option[] = {"opt1","opt2","opt3","opt4"};
    private String answer;

    public Question(int id, String question, String[] option, String answer) {
        this.id = id;
        Question = question;
        this.option = option;
        this.answer = answer;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return Question;
    }
    public void setQuestion(String question) {
        Question = question;
    }

    public String[] getOption() {
        return option;
    }
    public void setOption(String[] option) {
        this.option = option;
    }
    
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
    return "Question [id=" + id + ", Question=" + Question + ", option=" + Arrays.toString(option) + ", answer="
            + answer + ", getId()=" + getId() + ", getQuestion()=" + getQuestion() + ", getOption()="
            + Arrays.toString(getOption()) + ", getAnswer()=" + getAnswer() + ", getClass()=" + getClass()
            + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
