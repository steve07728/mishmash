package com.me.mishmash;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class TestListMash {

    private static final String array[] = { "one",  "two", "three",};
    public static final ListMash TEMPLATE = new ListMash(new ArrayList<MishMash>(ListMash.convert(Arrays.asList(array))));
    public static final ListMash EMPTY = new ListMash(new ArrayList<MishMash>());
    public static final ListMash NULL = new ListMash(null);
    
    @Test
    public void testEquals() {
        
        assertEquals(TEMPLATE, TEMPLATE);
        assertNotEquals(TEMPLATE, Arrays.asList(array));
    }
    
    @Test
    public void testType() {
        
        assertTrue(TEMPLATE.getType() == MishMash.Type.LIST);
    }
    
    @Test
    public void testIsMethods() {
        
        assertFalse(TEMPLATE.isString());
        assertTrue(TEMPLATE.isList());
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
        
        assertNull(TEMPLATE.asString());
        assertNotNull(TEMPLATE.asList());
        assertNull(TEMPLATE.asMap());
        
        assertNull(EMPTY.asString());
        assertNotNull(EMPTY.asList());
        assertNull(EMPTY.asMap());

        assertNull(NULL.asString());
        assertNull(NULL.asList());
        assertNull(NULL.asMap());
    }
}
