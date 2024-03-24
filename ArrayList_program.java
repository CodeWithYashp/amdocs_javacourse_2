import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_program {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        // System.out.println(fruits);
        Collections.sort(fruits);
        // System.out.println(fruits.get(1));
        fruits.set(2, "Mango");
        for (String i:fruits){
            System.out.println(i);
        }
//        System.out.println(fruits);
    }
}
