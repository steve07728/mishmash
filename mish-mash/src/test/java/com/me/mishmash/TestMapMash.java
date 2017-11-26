package com.me.mishmash;

import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Test;

public class TestMapMash {

    public static final MapMash TEMPLATE = new MapMash(MapMash.convert(System.getenv()));
    public static final MapMash EMPTY = new MapMash(new HashMap<String,MishMash>());
    public static final MapMash NULL = new MapMash(null);
    
    @Test
    public void testEquals() {
        
        assertEquals(TEMPLATE, TEMPLATE);
        assertNotEquals(TEMPLATE, System.getenv());
    }
    
    @Test
    public void testType() {
        
        assertTrue(TEMPLATE.getType() == MishMash.Type.MAP);
    }
    
    @Test
    public void testIsMethods() {
        
        assertFalse(TEMPLATE.isString());
        assertFalse(TEMPLATE.isList());
        assertTrue(TEMPLATE.isMap());
        assertFalse(TEMPLATE.isEmpty());
        assertFalse(TEMPLATE.isNull());
        
        assertTrue(EMPTY.isEmpty());
        assertFalse(EMPTY.isNull());
       
        assertFalse(NULL.isEmpty());
        assertTrue(NULL.isNull());
    }
    
    @Test
    public void testHasContent() {
        
        assertTrue(TEMPLATE.hasContent());
        assertFalse(EMPTY.hasContent());
        assertFalse(NULL.hasContent());
    }
    
    @Test
    public void testAsMethods() {
        
        assertNull(TEMPLATE.asString());
        assertNull(TEMPLATE.asList());
        assertNotNull(TEMPLATE.asMap());
        
        assertNull(EMPTY.asString());
        assertNull(EMPTY.asList());
        assertNotNull(EMPTY.asMap());

        assertNull(NULL.asString());
        assertNull(NULL.asList());
        assertNull(NULL.asMap());
    }
}
