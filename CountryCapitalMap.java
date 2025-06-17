import java.util.TreeMap;
import java.util.Map;

public class CountryCapitalMap {
    public static void main(String[] args) {
       
        TreeMap<String, String> countryCapitalMap = new TreeMap<>();
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("USA", "Washington");
        countryCapitalMap.put("Germany", "Berlin");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("India", "Delhi");  
        System.out.println("Country-Capital entries in sorted order:");
        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

       
        System.out.println("\nTreeMap Methods:");
        System.out.println("First Key: " + countryCapitalMap.firstKey());
        System.out.println("Last Key: " + countryCapitalMap.lastKey());
        System.out.println("Higher Key than 'Germany': " + countryCapitalMap.higherKey("Germany"));
        System.out.println("Lower Key than 'Germany': " + countryCapitalMap.lowerKey("Germany"));
    }
}