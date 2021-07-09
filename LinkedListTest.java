package com.stackQueue;

//import java.util.LinkedList;

public class LinkedListTest {
    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args)
    {
        LinkedList sList = new LinkedList();

        //Adds data to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        //Printing original list
        System.out.println("Original List: ");
        sList.display();

        while(sList.head != null) {
            sList.deleteFromStart();
            //Printing updated list
            System.out.println("Updated List: ");
            sList.display();
        }
    }
}
