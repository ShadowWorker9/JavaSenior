package com.yuanlin.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author yuanlin
 * @time 2022-01-29-2:58 PM
 */
public class ForeachTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(false);
        coll.add("Tom");
        coll.add(new Person("danny", 22));
        coll.add(new Person("yuanlin", 23));

        for (Object obj : coll){
            System.out.println(obj);
        }
    }
    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5};
        for(int i : arr){
            System.out.println(i);
        }
    }
}
