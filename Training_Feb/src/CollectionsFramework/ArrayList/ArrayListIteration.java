package CollectionsFramework.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String[] args) {

        ArrayList<String> techName = new ArrayList <String>();

        techName.add("Python");
        techName.add("Java");
        techName.add("JavaScript");
        techName.add("AWS");
        techName.add("SQL");

        //1.for loop
        System.out.println("Iterating using for loop");
        for(int i=0;i<techName.size();i++) {
            System.out.println(techName.get(i));
        }
        System.out.println("*******************************");

        //2. for each
        System.out.println("Iterating using for each loop");
        for(String t :techName){
            System.out.println(t);
        }
        System.out.println("*******************************");

        //3. jdk 8 streams
        System.out.println("Iterating using for each with jdk 8 stream");
        techName.stream().forEach(ele -> System.out.println(ele));
        System.out.println("*******************************");

        //4.iterator class
        System.out.println("Iterating using for iterator");
Iterator<String> it = techName.iterator();

while(it.hasNext()){
    System.out.println(it.next());
}
        System.out.println("*******************************");

        ArrayList<String> names = new ArrayList<String>(techName);
        System.out.println(names);
    }



}
