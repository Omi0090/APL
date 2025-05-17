import java.io.*;

public class DataInpOut {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Case2FileHandler <filename>");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);

        try {
            if (file.exists()) {
                System.out.println("File exists. Contents:");
                DataInputStream dis = new DataInputStream(new FileInputStream(file));
                while (dis.available() > 0) {
                    System.out.print((char) dis.readByte());
                }
                dis.close();
            } else {
                System.out.println("File does not exist. Creating new file...");
                file.createNewFile();
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\nDo you want to add data? (yes/no): ");
            String response = br.readLine();

            if (response.equalsIgnoreCase("yes")) {
                OutputStream os = new FileOutputStream(file, true);
                DataOutputStream dos = new DataOutputStream(os);
                System.out.println("Enter data (type 'finish' to end):");
                String line;
                while (!(line = br.readLine()).equalsIgnoreCase("finish")) {
                    dos.writeBytes(line + "\n");
                }
                dos.close();
                System.out.println("Data written to file.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
