package org.example.datastore;

import org.example.util.ValidateTypeUtil;

import javax.naming.NameNotFoundException;
import java.util.HashMap;

public class PrimitiveHashMap<T> {
    private HashMap<String,T> dataStore;
    private Integer capacity;

    public PrimitiveHashMap(Integer capacity) {
        this.capacity = capacity;
        dataStore= new HashMap<>();
    }

    public void store(String key, T value) {
        if(!ValidateTypeUtil.isValidPrimitiveType(value))
            throw new IllegalArgumentException("Not of valid primitive types");

        dataStore.put(key,value);
    }

    public T getValue(String key) throws NameNotFoundException {
        if(!dataStore.containsKey(key))
            throw new NameNotFoundException("Key not present");

        return dataStore.get(key);
    }

    public T delete(String key) throws NameNotFoundException {
        if(!dataStore.containsKey(key))
            throw new NameNotFoundException("Key to delete not present");

        return dataStore.remove(key);
    }





}
