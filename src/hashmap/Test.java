package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Test {
    private static Map<Integer , DriverLicense> allLicenses = new HashMap<>();

    public static void main(String[] args) {
        addLicenses();
        printAll();

    }
    private static void addLicenses(){
        addLicense(new DriverLicense(1 , "Vasilii"));
        addLicense(new DriverLicense(2, "Gennadii"));
        addLicense(new DriverLicense(3 , "Kirill"));
        addLicense(new DriverLicense(4, "Volodya"));
        addLicense(new DriverLicense(5 , "Ivan"));
    }
    private static void addLicense(DriverLicense license){
        allLicenses.put(license.getId() , license);
    }private static void printAll(){
        for(Map.Entry<Integer, DriverLicense> entry : allLicenses.entrySet()){
            System.out.println("id: " + entry.getKey() + "license: " + entry.getValue());
        }
    }
}
