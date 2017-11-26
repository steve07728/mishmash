package com.me.mishmash;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringMash {

    public static final StringMash TEMPLATE = new StringMash("TEMPLATE");
    public static final StringMash EMPTY = new StringMash("");
    public static final StringMash NULL = new StringMash(null);
    
    @Test
    public void testEquals() {
        
        assertEquals(TEMPLATE, "TEMPLATE");
        assertNotEquals("TEMPLATE", TEMPLATE);
    }
    
    @Test
    public void testType() {
        
        assertTrue(TEMPLATE.getType() == MishMash.Type.STRING);
    }
    
    @Test
    public void testIsMethods() {
        
        assertTrue(TEMPLATE.isString());
        assertFalse(TEMPLATE.isList());
        assertFalse(TEMPLATE.isMap());
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
        
        assertNotNull(TEMPLATE.asString());
        assertNull(TEMPLATE.asList());
        assertNull(TEMPLATE.asMap());
        
        assertNotNull(EMPTY.asString());
        assertNull(EMPTY.asList());
        assertNull(EMPTY.asMap());

        assertNull(NULL.asString());
        assertNull(NULL.asList());
        assertNull(NULL.asMap());
    }
}
