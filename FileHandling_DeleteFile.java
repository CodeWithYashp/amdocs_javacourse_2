import java.io.File;

public class FileHandling_DeleteFile {
    public static void main(String[] args){
        File myObj = new File("E:\\myFile.txt");
        myObj.delete();
        System.out.println("File deleted successfully!");
    }
}
