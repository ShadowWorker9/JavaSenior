package com.yuanlin.java;

import org.junit.Test;

import java.util.*;

/**
 *
 *  * 一、集合框架的概述
 *  *
 *  * 1.集合、数组都是对多个数据进行存储操作的结构，简称Java容器。
 *  *  说明：此时的存储，主要指的是内存层面的存储，不涉及到持久化的存储（.txt,.jpg,.avi，数据库中）
 *  *
 *  * 2.1 数组在存储多个数据方面的特点：
 *  *      > 一旦初始化以后，其长度就确定了。
 *  *      > 数组一旦定义好，其元素的类型也就确定了。我们也就只能操作指定类型的数据了。
 *  *       比如：String[] arr;int[] arr1;Object[] arr2;
 *  * 2.2 数组在存储多个数据方面的缺点：
 *  *      > 一旦初始化以后，其长度就不可修改。
 *  *      > 数组中提供的方法非常有限，对于添加、删除、插入数据等操作，非常不便，同时效率不高。
 *  *      > 获取数组中实际元素的个数的需求，数组没有现成的属性或方法可用
 *  *      > 数组存储数据的特点：有序、可重复。对于无序、不可重复的需求，不能满足。
 *  *
 *  * 二、集合框架
 *  *      |----Collection接口：单列集合，用来存储一个一个的对象
 *  *          |----List接口：存储有序的、可重复的数据。  -->“动态”数组
 *  *              |----ArrayList、LinkedList、Vector
 *  *
 *  *          |----Set接口：存储无序的、不可重复的数据   -->高中讲的“集合”
 *  *              |----HashSet、LinkedHashSet、TreeSet
 *  *
 *  *      |----Map接口：双列集合，用来存储一对(key - value)一对的数据   -->高中函数：y = f(x)
 *  *              |----HashMap、LinkedHashMap、TreeMap、Hashtable、Properties
 *  *
 *  *
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


        //6.contains();
        System.out.println(coll.contains(123));

        coll.add(new String("Tom"));
        System.out.println(coll.contains(new String("Tom")));

        coll.add(new Person("Jerry",20));
        System.out.println(coll.contains(new Person("Jerry",20)));

        //7.containsAll();
        Collection coll2 = Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll2));

        //8.remove();
        System.out.println(coll.remove(123));
        System.out.println(coll);

        //9.removeAll();
        System.out.println(coll.removeAll(coll2));
        System.out.println(coll);

        //10.retainAll();求交集
        Collection coll3 = Arrays.asList(123,456);
        coll.retainAll(coll3);
        System.out.println(coll);
    }
    @Test
    //11.equals
    public void test2(){
        Collection coll4 = new ArrayList();
        coll4.add(123);
        coll4.add(456);
        coll4.add(false);
        coll4.add(new Person("danny",22));
        coll4.add(new Person("yuanlin",23));

        Collection coll5 = new ArrayList();
        coll5.add(456);
        coll4.add(123);
        coll5.add(false);
        coll5.add(new Person("danny",22));
        coll5.add(new Person("yuanlin",23));

        System.out.println(coll4.equals(coll5));
    }
    @Test
    public void test3() {
        Collection coll4 = new ArrayList();
        coll4.add(123);
        coll4.add(456);
        coll4.add(false);
        coll4.add(new Person("danny", 22));
        coll4.add(new Person("yuanlin", 23));

        //12.hashcode   返回当前对象的hash值
        System.out.println(coll4.hashCode());

        //13.集合--->数组 toArray
        Object[] arr = coll4.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //14.拓展 数组---->集合
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list);

        List<int[]> arr1 = Arrays.asList(new int[]{123, 456});
        System.out.println(arr1);

        //15.iterator();返回Iterator接口的实例，用于遍历集合的元素，放在IteratorTest.java中测试
    }


}
