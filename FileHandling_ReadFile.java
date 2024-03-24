import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling_ReadFile {
    public static void main(String[] args){
        try{
            File myObj = new File("E:\\myFile.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNext()){
                String data = myReader.nextLine();
                System.out.println(data);
            }

            System.out.println(myObj.getAbsolutePath());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
