import java.io.*;

public class week9d2 {

    public static void readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);

    
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filename);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("Reading file: " + file);
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        String filePath = "example.txt";

        try {
            readFile(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
