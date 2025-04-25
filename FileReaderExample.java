import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {

       public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        
       
        if (!file.exists()) {
            throw new FileNotFoundException("The file " + fileName + " was not found.");
        }
        
        
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }

    public static void main(String[] args) {
        try {
            
            readFile("Pahalgam.txt"); 
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
