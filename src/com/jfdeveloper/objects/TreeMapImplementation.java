package com.jfdeveloper.objects;

import java.util.*;

public class TreeMapImplementation {
    // Declaring a TreeMap
    static TreeMap<Integer, Integer> tree_map;
    static List <Integer> dice=new ArrayList<>(Arrays.asList(5,2,1,2,5,5));
    // Function to create TreeMap
   public static void create() {
        // Creating an empty TreeMap
        tree_map
                = new TreeMap<>();

        System.out.println(
                "TreeMap successfully"
                        + " created");
    }

    // Function to Insert values in
    // the TreeMap
    public static void insert() {

        for(int die : dice) {
            if (!tree_map.containsKey(die))
                tree_map.put(die, 0);

            tree_map.put(die,tree_map.get(die)+1);
        }
        // Mapping string values to int keys
//        tree_map.put(10, "Geeks");
//        tree_map.put(15, "4");
//        tree_map.put(20, "Geeks");
//        tree_map.put(25, "Welcomes");
//        tree_map.put(5, "You");


        System.out.println(
                "\nElements successfully"
                        + " inserted in the TreeMap");
    }

    // Function to search a key in TreeMap
    public static void search(int key) {

        // Checking for the key
        System.out.println(
                "\nIs key \""
                        + key + "\" present? "
                        + tree_map.containsKey(key));
    }

    // Function to search a value in TreeMap
//    public static void search(String value) {
//
//        // Checking for the value
//        System.out.println(
//                "\nIs value \""
//                        + value + "\" present? "
//                        + tree_map.containsValue(value));
//    }

    // Function to display the elements in TreeMap
    public static void display() {
        // Displaying the TreeMap
        System.out.println(
                "\nDisplaying the TreeMap:");

        System.out.println(
                "TreeMap: " + tree_map);
    }

    // Function to traverse TreeMap
    public static void traverse() {
        System.out.println("\nTraversing the TreeMap:");
        for (Map.Entry<Integer, Integer> e : tree_map.entrySet())
            System.out.println(e.getKey()
                    + " "
                    + e.getValue());
    }
}
