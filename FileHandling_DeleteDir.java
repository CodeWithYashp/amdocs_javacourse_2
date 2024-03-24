import java.io.File;

public class FileHandling_DeleteDir {
    public static void main(String[] args){
        File myDir = new File("E:\\myJavaTest");
        if(myDir.delete()){
            System.out.println("Directory deleted successfully." + myDir.getName());
        }else {
            System.out.println("Directory not found...");
        }
    }
}
