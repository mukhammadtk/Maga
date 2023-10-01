package HashM;

import java.util.HashMap;
import java.util.Map;

public class Z2 {
    public static void main(String[] args) {
        Map<String, String> country = new HashMap<>();
        country.put("Kazakhstan" , "Astana");
        country.put("Russia" , "Moscow");
        country.put("USA" , "Vashington");
        System.out.println(country.values());
    }
}
