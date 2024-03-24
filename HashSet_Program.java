import java.util.HashSet;

public class HashSet_Program {
    public static void main(String[] args){
        HashSet<String> sports= new HashSet<String>();
        sports.add("Cricket");
        sports.add("Football");
        sports.add("Tennis");
        sports.add("Hockey");
        sports.contains("Football"); //false
        sports.remove("Cricket");
        // sports.clear(); // clear all items

        for (String i: sports){
            System.out.println(i);
        }

    }
}
