import java.io.*;
import java.util.Scanner;

class BufferedInOut {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a file name as a command-line argument.");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);
        Scanner sc = new Scanner(System.in);

        try {
            if (file.exists()) {
                System.out.println("File exists. Contents of the file:");
                BufferedInputStream bin = new BufferedInputStream(new FileInputStream(fileName));
                int i;
                while ((i = bin.read()) != -1) {
                    System.out.print((char) i);
                }
                bin.close();
            } else {
                System.out.println("File does not exist. Creating new file...");
                file.createNewFile();
            }

            System.out.print("\nDo you want to add data? (yes:no): ");
            String response = sc.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(fileName, true)); // append mode
                System.out.println("Enter text (type 'finish' on a new line to stop):");

                while (true) {
                    String line = sc.nextLine();
                    if (line.equalsIgnoreCase("finish")) {
                        break;
                    }
                    line += System.lineSeparator(); 
                    bout.write(line.getBytes());
                }

                bout.close();
                System.out.println("Data added successfully.");
            } else {
                System.out.println("No data added.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        sc.close();
    }
}
