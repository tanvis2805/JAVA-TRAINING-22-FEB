package CollectionsFramework.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LLConcepts {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add("Kapil");
        names.add("Tanvi");
        names.addFirst("Aakash");
        names.addLast("Venkata");
        Collections.sort(names);
        System.out.println(names);

      Iterator<String> itr = names.descendingIterator();
      while(itr.hasNext()){
          System.out.println(itr.next());
      }
    }
}
