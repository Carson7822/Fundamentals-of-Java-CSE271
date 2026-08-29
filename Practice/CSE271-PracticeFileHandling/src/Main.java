import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args)  {
        
        String pathString = "TestFile.txt";
        
        File fileObject = new File(pathString);
        
        /*
        if(fileObject.exists()) {
            
            fileObject.delete();
        }
        */
        
        try {
            //FileReader fileReaderObject = new FileReader(fileObject);
            
            FileWriter fileWriterObject = new FileWriter(fileObject, true);
            
            //fileWriterObject.write("Hello!\n");
            //fileWriterObject.write("This is a test.\n");
            
            //fileWriterObject.close();
            
            BufferedWriter bufferedWriterObject = new BufferedWriter(fileWriterObject);
            
            bufferedWriterObject.write("Hello!\n");
            bufferedWriterObject.write("And Goodbye\n");
            
            bufferedWriterObject.close();
            
            FileReader fileReaderObject = new FileReader(fileObject);
            
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

}
