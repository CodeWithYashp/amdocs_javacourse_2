import java.util.LinkedList;
public class LinkedList_Program {
    public static void main(String[] args){
        LinkedList<String> countries = new LinkedList<String>();
        countries.add("India");
        countries.add("America");
        countries.add("Egypt");
        countries.add("Russia");
        countries.add("Germany");

        countries.addFirst("Iran");
//        countries.removeFirst();
        countries.getFirst();
        countries.addLast("Dubai");
//        countries.removeLast();
        System.out.println(countries.getLast());
    }
}
