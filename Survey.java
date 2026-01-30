import java.util.ArrayList;
import java.util.List;

public class Survey {
    private String title;
    private List<Question> questions = new ArrayList<>();

    public Survey(String title) {
        this.title = title;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public String getTitle() {
        return title;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
