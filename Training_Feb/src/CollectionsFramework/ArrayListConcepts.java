package CollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConcepts {
    public static void main(String[] args) {

        //default class
        //dynamic array

       // List<Integer> list = new ArrayList<Integer>();

        ArrayList <Object> ar = new ArrayList<Object>();

        //add method
        ar.add(100);//0
        ar.add(200);//1
        ar.add("Testing");//2
        ar.add('A');//3
        ar.add(12.33);//4
        ar.add(true);//5

        System.out.println(ar);
//get method
        System.out.println(ar.get(2));
       // System.out.println(ar.get(-1)); no negative indexing
//size method
        System.out.println(ar.size());
        ar.add(400);
        ar.add(500);
        ar.add(false);
        System.out.println(ar.size());
//remove method
        ar.remove(3);
        System.out.println(ar);


        ArrayList<Integer> empSalary = new ArrayList<Integer>();
        empSalary.add(10000);
        empSalary.add(25000);
       // empSalary.add(5000.25);

        ArrayList<Double> empSalary1 = new ArrayList<Double>();

ArrayList<Integer> l1= new ArrayList<Integer>(Arrays.asList(10,20,30,40));
        System.out.println(l1);



    }
    
}
