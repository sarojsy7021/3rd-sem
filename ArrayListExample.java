package com.arrayDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    ArrayList<Integer> arrL = new ArrayList<Integer>();
    void printExample(){
        arrL.add(1);
        arrL.add(2);
        System.out.println(arrL);
        ArrayList<Integer> arrL1 = new ArrayList<Integer>();
        arrL1.add(3);
        arrL1.add(4);
        System.out.println(arrL1);
        arrL.addAll(arrL1);
        System.out.println(arrL);
        arrL.add(2,5);
        System.out.println(arrL);
        System.out.println(arrL.indexOf(3));
        System.out.println("arrL.get(1) = " + arrL.get(1));
        arrL.remove(2);
        System.out.println(arrL);
        arrL.set(2,5);
        System.out.println(arrL);
        System.out.println("arrL.size() = " + arrL.size());
    }

    void testIterator(){
        Iterator<Integer> iter = arrL.iterator();
        while (iter.hasNext()) {
            System.out.println("Elements are "+iter.next());
        }
    }

    void testIterator1(){
        arrL.forEach(number->
                System.out.println(number)
        );

        for (Integer i : arrL)
            System.out.println(i + " ");
    }
}
