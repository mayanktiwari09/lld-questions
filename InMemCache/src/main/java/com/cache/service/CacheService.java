package com.cache.service;

import com.cache.constants.EvictionPolicies;
import com.cache.dao.CacheDao;
import com.cache.model.Cache;

public class CacheService {
    private static CacheService instance = null;
    private CacheService(){}

    public static synchronized CacheService getInstance(){
        if(instance == null){
            instance = new CacheService();
        }
        return instance;
    }

    private CacheDao cacheDao = CacheDao.getInstance();

    public void init(int size, EvictionPolicies evictionPolicies){
        cacheDao.createCache(size, evictionPolicies);
    }

    public Object get(Object key){
        return cacheDao.get(key);
    }

    public Boolean put(Object key, Object value){
        return cacheDao.put(key,value);
    }

    public Boolean delete(Object key){
        return cacheDao.delete(key);
    }

    public Boolean claer(){
        return cacheDao.clear();
    }

}
