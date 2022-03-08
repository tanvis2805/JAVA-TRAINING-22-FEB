package CollectionsFramework.MapsConcepts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapComapare {
    //by key-value, by value, by keys

    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();

        map1.put(1,"Python");
        map1.put(2,"Java");
        map1.put(3,"Swift");

        HashMap<Integer, String> map2 = new HashMap<Integer, String>();

        map2.put(3,"Swift");
        map2.put(1,"Python");
        map2.put(2,"Java");

        HashMap<Integer, String> map3 = new HashMap<Integer, String>();
        map3.put(1,"Python");
        map3.put(2,"Java");
        map3.put(3,"Swift");
        map3.put(3,"JS");

        //1)on the basis of key -value: using equals

//        System.out.println(map1.equals(map2));
//        System.out.println(map1.equals(map3));

        //2) for the same keys- keyset()

        System.out.println(map1.keySet().equals(map2.keySet()));
        System.out.println(map1.keySet().equals(map3.keySet()));

        //3) find out the extra keys
        HashMap<Integer, String> map4 = new HashMap<Integer, String>();
        map4.put(1,"Python");
        map4.put(2,"Java");
        map4.put(3,"Swift");
        map4.put(4,"JS");


        HashSet <Integer> combineKeys =new HashSet<>(map1.keySet());

        combineKeys.addAll(map4.keySet());
        combineKeys.removeAll(map1.keySet());
        System.out.println(combineKeys);



        //4)compare maps by values
        HashMap<Integer,String> map5 = new HashMap<Integer,String>();
        map5.put(1,"A");
        map5.put(2,"B");
        map5.put(3,"C");

        HashMap<Integer,String> map6 = new HashMap<Integer,String>();
        map6.put(4,"A");
        map6.put(5,"B");
        map6.put(6,"C");

        HashMap<Integer,String> map7 = new HashMap<Integer,String>();
        map7.put(1,"A");
        map7.put(2,"B");
        map7.put(3,"C");
        map7.put(4,"C");

        //duplicates are not allowed

        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));//false

        System.out.println("-----------------------");

        // du[licates are allowed using hashsets
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));//true
    }

}
