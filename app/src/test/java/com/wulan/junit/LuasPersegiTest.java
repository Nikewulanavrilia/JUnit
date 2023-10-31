package com.wulan.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LuasPersegiTest {
    private LuasPersegi luasPersegi = new LuasPersegi();
    @Test
    public void testAddSuccess(){
        //pemberian nilai sisi pada persegi
        int result = luasPersegi.add(20);
        //untuk mengetest jawaban dari hasil luas persegi
        assertEquals (400,result);
    }
}
