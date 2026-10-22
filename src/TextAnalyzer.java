import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TextAnalyzer {

    private final String[] words;

    public TextAnalyzer(String text) {
        // Extra: remove commas and full stops before splitting
        String clean = text.toLowerCase().replace(",", "").replace(".", "");
        words = clean.split(" ");
    }

    public int countWords() {
        return words.length;
    }

    // TreeSet: no repeated words, in alphabetical order
    public Set<String> getUniqueWords() {
        return new TreeSet<>(Arrays.asList(words));
    }

    // add() returns false when the word was already in the set
    public Set<String> getRepeatedWords() {
        Set<String> seen = new TreeSet<>();
        Set<String> repeated = new TreeSet<>();
        for (String w : words) {
            if (!seen.add(w)) {
                repeated.add(w);
            }
        }
        return repeated;
    }
}
