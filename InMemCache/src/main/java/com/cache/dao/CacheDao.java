package com.cache.dao;

import com.cache.constants.EvictionPolicies;
import com.cache.model.Cache;

public class CacheDao {
    private static CacheDao cacheDao = null;
    private Cache cache = null;
    private CacheDao(){}

    public static CacheDao getInstance(){
        if(cacheDao == null){
            cacheDao = new CacheDao();
        }
        return cacheDao;
    }

    public Cache createCache(int size, EvictionPolicies evictionPolicies){
        cache = new Cache(size, evictionPolicies);
        return cache;
    }

    public Object get(Object key){
        return cache.getEvictor().get(key,cache.getDataStore(),cache.getCacheStore());
    }

    public Boolean put(Object key, Object value){
        return cache.getEvictor().put(key, value,cache.getDataStore(),cache.getCacheStore(),cache.getSize());
    }

    public Boolean delete(Object key){
        if(cache.getDataStore().size() == 0){
            return true;
        }
        try{
            cache.getDataStore().remove(key);
            cache.getCacheStore().remove(key);
            return true;
        } catch(Exception e){
            System.out.println("Something went wrong");
        }
        return false;
    }

    public Boolean clear(){
        return cache.clear();
    }
}
