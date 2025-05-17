import java.io.*;

public class Count {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("example.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line;
        int lineCount = 0;

        while ((line = br.readLine()) != null) {
            lineCount++;
            System.out.println(line);

            int wordCount = 0;
            boolean inWord = false;

            for (char c : line.toCharArray()) {
                if (Character.isWhitespace(c)) {
                    inWord = false;
                } else if (!inWord) {
                    inWord = true;
                    wordCount++;
                }
            }

            System.out.println("Line " + lineCount + " Words: " + wordCount);
        }

        System.out.println("Total Lines: " + lineCount);
        br.close();
    }
}
