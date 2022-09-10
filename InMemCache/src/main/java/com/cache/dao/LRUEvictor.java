package com.cache.dao;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUEvictor implements Evictor {
    @Override
    public Object get(Object key, LinkedList<Object> dataStore, HashMap<Object, Object> cacheStore) {
        Object result = cacheStore.get(key); // command + [ , command + ]
        if(result == null){
            return null;
        }
        dataStore.remove(key);
        dataStore.addFirst(key);
        return result;
    }

    @Override
    public Boolean put(Object key, Object value, LinkedList<Object> dataStore, HashMap<Object, Object> cacheStore, int cacheSize) {
        try{
            if(cacheSize == dataStore.size()){
                Object last = dataStore.removeLast();
                cacheStore.remove(last);
            }
            dataStore.remove(key);
            dataStore.addFirst(key);
            cacheStore.put(key,value);
            return true;
        } catch(Exception e){
            System.out.println("Something went wrong");
        }
        return false;
    }
}
