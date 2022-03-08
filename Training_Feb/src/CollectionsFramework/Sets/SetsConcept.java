package CollectionsFramework.Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetsConcept {
    public static void main(String[] args) {

        Set <Object> kapil = new HashSet<Object>();
        kapil.add("Name - Kapil Singh");
        kapil.add("Age -27");
        kapil.add("desig- java developer");
        System.out.println(kapil);

        Set<Integer> num = new TreeSet<Integer>();
        num.add(10);
        num.add(5);
        num.add(20);
        num.add(15);
        num.add(100);
        System.out.println(num);



        Set<String> hs = new HashSet<String>();

        hs.add("Alpha Testing");
        hs.add("Beta Testing");
        hs.add("Junit");
        hs.add("PyTest");
        System.out.println(hs);
        hs.add("Junit");
        hs.add(null);
        System.out.println(hs);

        //contains
        System.out.println(hs.contains("selenium"));

        //iterate
        //for each method
        for(String e :hs){
            System.out.println(e);
        }


        //iterator
       Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //remove
        hs.remove("Beta Testing");
        System.out.println(hs);

    }

}
