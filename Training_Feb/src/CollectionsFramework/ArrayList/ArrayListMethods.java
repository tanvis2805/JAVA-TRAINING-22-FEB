package CollectionsFramework.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> ar1 = new ArrayList <String>();

        ar1.add("Python");
        ar1.add("Java");
        ar1.add("JavaScript");
        ar1.add("AWS");
        ar1.add("SQL");


        ArrayList<String> ar2 = new ArrayList <String>();

        ar2.add("NodeJS");
        ar2.add("DevOps");
        ar1.add(2, "QA");
        System.out.println(ar1);

        //addAll method (overloaded method)

//       ar1.addAll(ar2);
       System.out.println(ar1);

       ar1.addAll(3,ar2);
        System.out.println(ar1);

        //clear

//        ar1.clear();
        System.out.println(ar1);


        //clone
        ArrayList<String> clonedlist =  ( ArrayList <String>)ar1.clone();
        System.out.println(clonedlist);

        //contains - returns boolean
        System.out.println(ar1.contains("IOT"));
        System.out.println(ar1.contains("Python"));

        //indexOf
        System.out.println(ar1.indexOf("IOT")>=0);
        System.out.println(ar1.indexOf("QA"));

        //lastIndexOf

        ar1.add(3, "Python");
        ar1.add(5,"Python");
        ar1.add(6,"Python");
        System.out.println(ar1);

        int i = ar1.lastIndexOf("Python");
        System.out.println(i);

        //remove
        ar1.remove(5);
        System.out.println(ar1);

        ar1.remove("QA");
        System.out.println(ar1);

        ar1.remove("Python");
        System.out.println(ar1);

//removeIf
 ArrayList <Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

 num.removeIf(number -> number %2 !=0 );

        System.out.println(num);

        //retainAll
        //sublist
        //toArray
        //sort
        Collections.sort(num);
        //l1 and l2
        //System.out.println(l1.equals(l2));
        //equals





    }
}
