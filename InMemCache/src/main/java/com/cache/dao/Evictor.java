package com.cache.dao;

import java.util.HashMap;
import java.util.LinkedList;

public interface Evictor {
    public Object get(Object key, LinkedList<Object> dataStore, HashMap<Object,Object> cacheStore);
    public Boolean put(Object key, Object value, LinkedList<Object> dataStore, HashMap<Object,Object> cacheStore, int cacheSize);
}