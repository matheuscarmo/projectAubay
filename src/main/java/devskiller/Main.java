package devskiller;

public class Main {

    public static void main(String[] args)
    {
        Exercise task = new Exercise();

        String paragraph = "Hello: hello my fellow candidate.";

        task.findFirstRepeatedWords(paragraph);

        paragraph = "Hello, my fellow candidate. Hello again.";

        task.findFirstRepeatedWords(paragraph);
    }
}
