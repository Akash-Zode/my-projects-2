import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SurveyService service = new SurveyService();

        while (true) {
            System.out.println("\n=== ONLINE SURVEY SYSTEM ===");
            System.out.println("1. Register User");
            System.out.println("2. Create Survey");
            System.out.println("3. Participate in Survey (Anonymous)");
            System.out.println("4. View Survey Results");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    service.registerUser(sc);
                    break;
                case 2:
                    service.createSurvey(sc);
                    break;
                case 3:
                    service.takeSurvey(sc);
                    break;
                case 4:
                    service.viewResults();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
