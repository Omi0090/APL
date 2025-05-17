import java.io.*;

public class BuffreadPrintWrite {
    public static void main(String[] args) {

        String fileName = args[0];
        File file = new File(fileName);

        try {
            if (file.exists()) {
                System.out.println("File exists. Contents:");
                BufferedReader fileReader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = fileReader.readLine()) != null) {
                    System.out.println(line);
                }
                fileReader.close();
            } else {
                System.out.println("File does not exist. Creating new file...");
                file.createNewFile();
            }

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\nDo you want to add data? (yes/no): ");
            String response = userInput.readLine();

            if (response.equalsIgnoreCase("yes")) {
                PrintWriter writer = new PrintWriter(new FileWriter(file, true));
                System.out.println("Enter data (type 'finish' to end):");
                String inputLine;
                while (!(inputLine = userInput.readLine()).equalsIgnoreCase("finish")) {
                    writer.println(inputLine);
                }
                writer.close();
                System.out.println("Data successfully written to file.");
            } else {
                System.out.println("No data added.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
