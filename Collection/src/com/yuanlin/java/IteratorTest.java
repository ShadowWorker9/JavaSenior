package com.yuanlin.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author yuanlin
 * @time 2022-01-29-10:36 AM
 */
public class IteratorTest {
    @Test
    public void test(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(false);
        coll.add("Tom");
        coll.add(new Person("danny", 22));
        coll.add(new Person("yuanlin", 23));

        Iterator iterator = coll.iterator();
        //方式一
//        System.out.println(iterator.next());

        //方式二
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }

        //方式三（推荐）
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if (("Tom").equals(obj)){
                iterator.remove();
            }
        }

        iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
