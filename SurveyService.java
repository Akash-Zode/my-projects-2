import java.util.*;

public class SurveyService {

    private List<User> users = new ArrayList<>();
    private Survey survey;
    private List<Response> responses = new ArrayList<>();

    public void registerUser(Scanner sc) {
        System.out.print("Enter username: ");
        String name = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        users.add(new User(name, email));
        System.out.println("User registered successfully!");
    }

    public void createSurvey(Scanner sc) {
        System.out.print("Enter survey title: ");
        String title = sc.nextLine();
        survey = new Survey(title);

        System.out.print("How many questions? ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter question " + i + ": ");
            String q = sc.nextLine();
            survey.addQuestion(new Question(q));
        }

        System.out.println("Survey created successfully!");
    }

    public void takeSurvey(Scanner sc) {
        if (survey == null) {
            System.out.println("No survey available!");
            return;
        }

        Response response = new Response();
        System.out.println("\nSurvey: " + survey.getTitle());

        for (Question q : survey.getQuestions()) {
            System.out.println(q.getQuestionText());
            String ans = sc.nextLine();
            response.addAnswer(q.getQuestionText(), ans);
        }

        responses.add(response);
        System.out.println("Thank you for your anonymous response!");
    }

    public void viewResults() {
        if (responses.isEmpty()) {
            System.out.println("No responses yet!");
            return;
        }

        System.out.println("\n=== SURVEY RESULTS ===");
        for (Response r : responses) {
            System.out.println(r.getAnswers());
        }
    }
}
