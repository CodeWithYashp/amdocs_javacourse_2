import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda_Expression {
    public static void main(String[] args){
        // (parameters1, parameters2) -> {Block of code}
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(23);
        numbers.add(34);
        numbers.add(67);
        numbers.add(48);
        numbers.add(52);
        numbers.add(87);
        Consumer<Integer> myMethod = (n)->{System.out.println(n);};
        numbers.forEach(myMethod);
    }
}
