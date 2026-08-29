import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String sourcePathString = "Source.txt";
        File sourceFileObject = new File(sourcePathString);
        
        String destinationPathString = "Destination.txt";
        File destinationFileObject = new File(destinationPathString);
        
        
        if(destinationFileObject.exists()) {
            
            destinationFileObject.delete();
        }
        
        
        readFromAFileWriteToAnother(sourceFileObject, destinationFileObject);
        
        String fileText = "Hello! \n\nThis is test.";
        
        writeToFile(sourceFileObject, fileText);
        

    }
    
    
    public static void readFromAFileWriteToAnother(File passedSourceFile, File passedDestinationFile) {
        try {
            FileReader fileReaderObject = new FileReader(passedSourceFile);
            BufferedReader bufferedReaderObject = new BufferedReader(fileReaderObject);
            String readLine;
            
            while((readLine = bufferedReaderObject.readLine()) != null) {
                System.out.println(readLine);
            }
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("File Not Found Exception");
        } catch (IOException ioe) {
            System.out.println("IO Exception");
        }
    }
    
    
    public static void writeToFile(File passedFile, String passedString) {
        try {
            FileWriter fileWriterObject = new FileWriter(passedFile, true);
            
            BufferedWriter bufferedWriterObject = new BufferedWriter(fileWriterObject);
            
            bufferedWriterObject.write(passedString);
            bufferedWriterObject.close();
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("File Not Found Exception");
        } catch (IOException ioe) {
            System.out.println("IO Exception");
        }
    }

}
