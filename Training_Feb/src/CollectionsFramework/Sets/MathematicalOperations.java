package CollectionsFramework.Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MathematicalOperations {

    public static void main(String[] args) {

        Set<Integer> first = new HashSet<Integer>();
        first.addAll(Arrays.asList(new Integer[]{1,3,4,5,6,8,9,10}));

        Set<Integer> second = new HashSet<Integer>();
        second.addAll(Arrays.asList(new Integer[]{1,2,3,5,6,7,9}));

        System.out.println(first);
        System.out.println(second);
        //get the union
        System.out.println("UNION");
        Set<Integer> union = new HashSet<Integer>(first);
        union.addAll(second);
        System.out.println(union);
        System.out.println("---------------------------");

        //get the INTERSECTION

        System.out.println("INTERSECTION");
        Set<Integer> intersection = new HashSet<Integer>(first);
        intersection.retainAll(second);
        System.out.println(intersection);

        System.out.println("---------------------------");

        //get the Diff

        System.out.println("DIFF");
        Set<Integer> diff = new HashSet<Integer>(first);
        second.removeAll(diff);
        System.out.println(diff);

        System.out.println("---------------------------");



    }
}
