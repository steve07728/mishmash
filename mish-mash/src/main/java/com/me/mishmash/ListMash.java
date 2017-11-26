package com.me.mishmash;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class ListMash implements MishMash {
    
    public static List<MishMash> convert(List<String> stringList) {
        
        List<MishMash> list = new ArrayList<MishMash>(stringList.size());
        for ( String string : stringList ) {
            
            list.add(new StringMash(string));
        }
        return list;
    }
    
    private final List<MishMash> list;

    public ListMash(List<MishMash> list) {

        this.list = list;
    }
    
    public Type getType() {

        return MishMash.Type.LIST;
    }

    public boolean isString() {

        return false;
    }

    public boolean isMap() {

        return false;
    }

    public boolean isList() {

        return true;
    }

    public boolean isEmpty() {

        return list != null && list.isEmpty();
    }

    public boolean isNull() {

        return list == null;
    }

    public boolean hasContent() {

        return list != null && !list.isEmpty();
    }

    public String asString() {

        return null;
    }

    public Map<String, MishMash> asMap() {

        return null;
    }

    public List<MishMash> asList() {

        return list;
    }

    public MishMash get(int index) {

        try {
            return list.get(index);
        } catch (IndexOutOfBoundsException e) {
            return MishMash.NIL;
        }
    }

    public MishMash get(String key) {

        return MishMash.NIL;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + ((list == null) ? 0 : list.hashCode());
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
        ListMash other = (ListMash) obj;
        if (list == null) {
            if (other.list != null)
                return false;
        } else if (!list.equals(other.list))
            return false;
        return true;
    }

}
