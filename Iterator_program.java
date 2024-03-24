import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_program {
    public static void main(String[] args){
        // Make a collection
        // Make a arraylist
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Kiwi");

        // Getting an iterator
        Iterator<String> it = fruits.iterator();

        // Loopthrough of iterator
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        while ((it.hasNext())){
            String i = it.next();
            if(i == "Kiwi"){
                it.remove();
            }
        }

        System.out.println(fruits);
    }
}
