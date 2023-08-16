package org.example.datastore;

import org.example.util.ValidateTypeUtil;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionDataStore<V,T extends Collection<V>> {
    private HashMap<String,T> dataStore;
    private Integer capacity;

    private T defaultCollection;


    public CollectionDataStore(Integer capacity,Class<T> classType) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        this.capacity = capacity;
        dataStore= new HashMap<>();
        defaultCollection= classType.getDeclaredConstructor().newInstance();
    }

    public void storeAll(String key, V... values) {
        if(!ValidateTypeUtil.isValidPrimitiveType(values[0]))
            throw new IllegalArgumentException("Not of valid primitive types");

        if(dataStore.containsKey(key))
       dataStore.get(key).addAll(Stream.of(values).collect(Collectors.toList()));


    }

}
