package com.me.mishmash;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class MapMash implements MishMash {
    
    public static Map<String,MishMash> convert(Map<String,String> stringMap) {
        
        Map<String,MishMash> map = new HashMap<String,MishMash>();
        for ( Entry<String, String> entry : stringMap.entrySet() ) {
            
            map.put(entry.getKey(), new StringMash(entry.getValue()));
        }
        return map;
    }

    private Map<String,MishMash> map;
    
    public MapMash(Map<String,MishMash> map) {

        this.map = map;
    }

    public Type getType() {

        return MishMash.Type.MAP;
    }

    public boolean isString() {

        return false;
    }

    public boolean isMap() {

        return true;
    }

    public boolean isList() {

        return false;
    }

    public boolean isEmpty() {

        return map != null && map.isEmpty();
    }

    public boolean isNull() {

        return map == null;
    }

    public boolean hasContent() {

        return map != null && !map.isEmpty();
    }

    public String asString() {

        return null;
    }

    public Map<String, MishMash> asMap() {

        return map;
    }

    public List<MishMash> asList() {

        return null;
    }

    public MishMash get(int index) {

        return MishMash.NIL;
    }

    public MishMash get(String key) {

        return map.containsKey(key) ? map.get(key) : MishMash.NIL;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + ((map == null) ? 0 : map.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MapMash other = (MapMash) obj;
        if (map == null) {
            if (other.map != null)
                return false;
        } else if (!map.equals(other.map))
            return false;
        return true;
    }

}
