import java.util.Arrays;
import java.util.List;

public class NLPProcessor {
    private List<String> greetings = Arrays.asList("hello", "hi", "hey");
    private List<String> farewells = Arrays.asList("bye", "goodbye", "see you");
    private List<String> weatherKeywords = Arrays.asList("weather", "temperature", "forecast");

    public String identifyIntent(String input) {
        String lowerInput = input.toLowerCase();

        if (containsKeyword(lowerInput, greetings)) {
            return "greeting";
        } else if (containsKeyword(lowerInput, farewells)) {
            return "farewell";
        } else if (containsKeyword(lowerInput, weatherKeywords)) {
            return "weather";
        } else {
            return "unknown";
        }
    }

    private boolean containsKeyword(String input, List<String> keywords) {
        for (String keyword : keywords) {
            if (input.contains(keyword)) {
                return true;
            }
        }
        return false;
    }
}
