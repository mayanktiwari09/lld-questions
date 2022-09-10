package com.cache.model;

import com.cache.constants.EvictionPolicies;
import com.cache.dao.Evictor;
import com.cache.dao.LRUEvictor;

import java.util.HashMap;
import java.util.LinkedList;

public class Cache {

    private int size;
    private EvictionPolicies evictionPolicies;
    private Evictor evictor;
    private LinkedList<Object> dataStore;
    private HashMap<Object,Object> cacheStore;

    public Cache(int size, EvictionPolicies evictionPolicy){
        this.size = size;
        this.evictionPolicies = evictionPolicy;
        this.dataStore = new LinkedList<Object>();
        this.cacheStore = new HashMap<Object,Object>();
        if(evictionPolicy == EvictionPolicies.LRU){
            this.evictor = new LRUEvictor();
        }
    }

    public int getSize(){
        return size;
    }

    public EvictionPolicies getEvictionPolicy(){
        return evictionPolicies;
    }

    public LinkedList<Object> getDataStore(){
        return dataStore;
    }

    public HashMap<Object,Object> getCacheStore(){
        return cacheStore;
    }

    public Evictor getEvictor(){
        return evictor;
    }

    public Boolean clear(){
        try{
            this.dataStore = new LinkedList<Object>();
            this.cacheStore = new HashMap<Object,Object>();
            return true;
        } catch(Exception e) {
            System.out.println("Something went wrong");
        }
        return false;
    }
}
