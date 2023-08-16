package org.example;


import org.example.datastore.CollectionDataStore;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        HashSet<Integer> integerHashSet = new HashSet<>();
        CollectionDataStore<Integer,ArrayList<Integer>> store = new CollectionDataStore<>(10, (Class<ArrayList<Integer>>) (Class<?>) ArrayList.class);


    }


}