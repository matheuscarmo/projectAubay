package devskiller;

//public class RespotaQueMandei {


import java.util.HashMap;

    public class Exercise {
        public void findFirstRepeatedWords(String paragraph) {
            // TODO - Your code goes here, within this method.
            int n = paragraph.length();
            if (n == 0 ){
                return;
            }
            HashMap <String, Integer> record = new HashMap <String, Integer> ();

            String[] word = paragraph.split(" ");

            for (int i = 0; i < word.length; ++1)
            {
                if(record.containsKey(word[i]))
                {
                    record.put(word[i], record.get(word[i]) + 1);
                }else{
                    record.put(word[i], 1);
                }
            }
            System.out.println("Given Paragraph: " + paragraph);
            for (int i = 0; i < word.length; ++i)
            {
                if(record.get(word[i]) > 1)
                {
                    System.out.println(word[i]);
                    return;
                }
            }

            System.out.println("None");
        }
        public static void main(String[] args)
        {
            Exercise task = New Exercise();

            String paragraph = "Launch an app that runs faster and faster than other app";

            task.findFirstRepeatedWords(paragraph);

            paragraph = "App Data Code Error Cdoe Data Fill";

            task.findFirstRepeatedWords(paragraph);
        }
    }

}
