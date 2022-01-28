package com.yuanlin.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @author yuanlin
 * @time 2022-01-28-5:59 PM
 */
public class CollectionTest {

    @Test
    public void test1(){
        //1.add();
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add("AA");
        coll.add(new Date());

        //2.size();
        System.out.println(coll.size());

        //3.addAll();
        Collection  coll1 = new ArrayList();
        coll1.add(456);
        coll.addAll(coll1);

        System.out.println(coll.size());
        System.out.println(coll);

        //4.clear();
//        coll.clear();

        //5.isEmpty;
        System.out.println(coll.isEmpty());

        coll.add(new Person("Jerry",20));
        //6.contains();
        System.out.println(coll.contains(123));

        coll.add(new String("Tom"));
        System.out.println(coll.contains(new String("Tom")));


    }


}
