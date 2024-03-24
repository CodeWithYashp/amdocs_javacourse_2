import java.io.FileWriter;
import java.io.IOException;

public class FileHandling_FileWriter {
    public static void main(String[] args){
        try{
            FileWriter myWriter = new FileWriter("E:\\myFile.txt");
            myWriter.write("Hello my name is yash pandey....");
            myWriter.close();
            System.out.println("Successfully Written to file...");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
