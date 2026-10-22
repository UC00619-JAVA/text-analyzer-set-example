public class Main {

    public static void main(String[] args) {

        TextAnalyzer analyzer = new TextAnalyzer("The cat and the dog and the bird");

        System.out.println("Words: " + analyzer.countWords());
        System.out.println("Unique words: " + analyzer.getUniqueWords().size());
        System.out.println("Alphabetical: " + analyzer.getUniqueWords());
        System.out.println("Repeated: " + analyzer.getRepeatedWords());

        // Extra: punctuation is ignored
        TextAnalyzer extra = new TextAnalyzer("Java is fun. Java is easy, java is cool.");
        System.out.println("Unique words: " + extra.getUniqueWords());
    }

}
