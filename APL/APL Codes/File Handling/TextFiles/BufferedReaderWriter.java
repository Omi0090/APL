import java.io.*;

public class BufferedReaderWriter {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Case1FileHandler <filename>");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);

        try {
            if (file.exists()) {
                System.out.println("File exists. Contents:");
                BufferedReader brFile = new BufferedReader(new FileReader(file));
                String line;
                while ((line = brFile.readLine()) != null) {
                    System.out.println(line);
                }
                brFile.close();
            } else {
                System.out.println("File does not exist. Creating new file...");
                file.createNewFile();
            }

            BufferedReader brUser = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\nDo you want to add data? (yes/no): ");
            String response = brUser.readLine();

            if (response.equalsIgnoreCase("yes")) {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
                System.out.println("Enter data (type 'finish' to end):");
                String input;
                while (!(input = brUser.readLine()).equalsIgnoreCase("finish")) {
                    bw.write(input);
                    bw.newLine();
                }
                bw.close();
                System.out.println("Data written to file.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
