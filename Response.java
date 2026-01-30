import java.util.HashMap;
import java.util.Map;

public class Response {
    private Map<String, String> answers = new HashMap<>();

    public void addAnswer(String question, String answer) {
        answers.put(question, answer);
    }

    public Map<String, String> getAnswers() {
        return answers;
    }
}
