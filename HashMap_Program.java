import java.util.HashMap;
public class HashMap_Program {
    public static void main(String[] args){
        HashMap<String, String> capitalCities= new HashMap<String, String>();
        capitalCities.put("Rajasthan", "Jaipur");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("America", "Washington DC");
        capitalCities.remove("Rajasthan");
        // capitalCities.clear();
        // capitalCities.keySet();
        // capitalCities.values();
//        System.out.println(capitalCities.size());
        for (String i : capitalCities.keySet()){
            System.out.println("Key: " + i + ", Value: " + capitalCities.get(i));
        }
        for (String i : capitalCities.values()){
            System.out.println(i);
        }
        System.out.println(capitalCities.size());

    }
}
