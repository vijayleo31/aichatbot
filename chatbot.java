public class Chatbot {
    private NLPProcessor nlpProcessor;

    public Chatbot() {
        nlpProcessor = new NLPProcessor();
    }

    public String getResponse(String input) {
        // Process input using NLP
        String intent = nlpProcessor.identifyIntent(input);
        
        switch (intent) {
            case "greeting":
                return "Hello! How can I assist you today?";
            case "farewell":
                return "Take care! Have a great day!";
            case "weather":
                return "Currently, I can't fetch real-time weather. Try asking about general topics.";
            default:
                return "I'm sorry, I don't understand. Could you rephrase?";
        }
    }
}
