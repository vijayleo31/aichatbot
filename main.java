import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chatbot chatbot = new Chatbot();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to AI Chatbot! Type 'exit' to quit.");
        
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();
            
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }
            
            String response = chatbot.getResponse(userInput);
            System.out.println("Chatbot: " + response);
        }
        
        scanner.close();
    }
}
