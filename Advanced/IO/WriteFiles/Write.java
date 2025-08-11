package Advanced.IO.WriteFiles;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        //4 options on how to write a file using Java

        //FileWriter = Good for small or medium-sized text files
        //BufferedWriter = Better performance for large amounts of text
        //PrintWriter = Best for structured data, like reports or logs
        //FileOutputStream = Best of binary files (e.g., images, audio files)

        try(FileWriter writer = new FileWriter("FAT.txt");) {
            writer.write("I love SHIT");
            System.out.println("File written");
        }
        catch (IOException e) {
            System.out.println("Encountered error: " + e.getMessage());
        }
    }
}
