package com.me.mishmash;

import java.util.List;
import java.util.Map;

public interface MishMash {
    
    enum Type {
        
        STRING, MAP, LIST, NULL
    }

    MishMash NIL = NullMash.NIL;
    
    Type getType();
    
    boolean isString();
    boolean isMap();
    boolean isList();
    boolean isEmpty();
    boolean isNull();
    boolean hasContent();
    
    String asString();
    Map<String, MishMash> asMap();
    List<MishMash> asList();
    
    MishMash get(int index);
    MishMash get(String key);
    
    enum NullMash implements MishMash {
        
        NIL
        ;

        public Type getType() {

            return MishMash.Type.NULL;
        }

        public boolean isString() {

            return false;
        }

        public boolean isMap() {

            return false;
        }

        public boolean isList() {

            return false;
        }

        public boolean isEmpty() {

            return true;
        }

        public boolean isNull() {

            return true;
        }

        public boolean hasContent() {

            return false;
        }

        public String asString() {

            return null;
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
    }
}
