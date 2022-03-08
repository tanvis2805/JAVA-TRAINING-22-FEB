package CollectionsFramework.MapsConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapsConcepts {
    //each key and value pair-> entry

    public static void main(String[] args) {
        //no order, no indexing
        //stores values as key value pair -> <k,v>
        //key cannot be duplicate(unique)

        HashMap <String,String> designations = new HashMap<String,String>();

        designations.put("Kapil","Java Developer");
        designations.put("Venkata","Devops Engineer");
        designations.put("Mitanshi","Java Trainer");

        System.out.println(designations.get("Venkata"));
        designations.put("Mitanshi","Support Engineer");
        System.out.println(designations.get("Mitanshi"));//updated value


        //can store n no. of null values but onLY one null key

        designations.put(null,"Engineer");
        System.out.println(designations.get(null));
        designations.put(null,"HR");
        System.out.println(designations.get(null));

        designations.put("Kushal",null);
        designations.put("Divya",null);
        System.out.println(designations.get("Divya"));
        System.out.println(designations.get("Kushal"));

        //1 null key and multiple null values
        //hashmap is not thread safe i.e. it is not synchronized
        //hash tables -> synchronized

        //to iterate / traverse
        //iterator-> over the keys -> by using key set()

        Iterator<String> it = designations.keySet().iterator();
        while(it.hasNext()){
            String key =it.next();
            String value =designations.get(key);
            System.out.println("Key = " + key + " Value = " + value);
        }

        //iterator :  over the st(pair) : by using entry set()

        Iterator <Map.Entry<String, String>> it1 =  designations.entrySet().iterator();
        while(it1.hasNext()){
            Map.Entry<String,String> entry = it1.next();
            System.out.println("Key = " + entry.getKey() + " & Value = " + entry.getValue());
        }

        //iterate using java 8 for each and lambda
        designations.forEach((k,v) -> System.out.println("Key = " + k + " and value = " +v));

        //remove
        designations.remove("Divya");
        System.out.println(designations);

    }
}
