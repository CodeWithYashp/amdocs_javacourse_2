import java.io.File;
import java.io.IOException;

public class File_Handling {
    public static void main(String[] args){
        try{
            File myFile = new File("E:\\myFile.txt");
            if(myFile.createNewFile()){
                System.out.println("File Created " + myFile.getName());
            }else{
                System.out.println("File Already Exists..");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
