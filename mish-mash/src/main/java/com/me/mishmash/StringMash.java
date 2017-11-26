package com.me.mishmash;

import java.util.List;
import java.util.Map;

public class StringMash implements MishMash {
    
    private final String string;
    
    public StringMash(String string) {
        
        this.string = string;
    }

    public Type getType() {

        return MishMash.Type.STRING;
    }

    public boolean isString() {

        return true;
    }

    public boolean isMap() {

        return false;
    }

    public boolean isList() {

        return false;
    }

    public boolean isEmpty() {

        return string != null && string.isEmpty();
    }

    public boolean isNull() {

        return string == null;
    }

    public boolean hasContent() {

        return string != null && !string.isEmpty();
    }

    public String asString() {

        return string;
    }

    public Map<String, MishMash> asMap() {

        return null;
    }

    public List<MishMash> asList() {

        return null;
    }

    public MishMash get(int index) {

        return this;
    }

    public MishMash get(String key) {

        return this;
    }

   @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + ((string == null) ? 0 : string.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if ( String.class == obj.getClass() ) 
            return obj.equals(string);
        if (getClass() != obj.getClass())
            return false;
        StringMash other = (StringMash) obj;
        if (string == null) {
            if (other.string != null)
                return false;
        } else if (!string.equals(other.string))
            return false;
        return true;
    }

}
