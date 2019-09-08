package com.mashibing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author: 马士兵教育
 * @create: 2019-09-08 16:36
 */
/*
*   1、set中存放的是无序，唯一的数据
*   2、set不可以通过下标获取对应位置的元素的值，因为无序的特点
*
* */
public class SetDemo {
    public static void main(String[] args) {
//        Set set = new HashSet();
//        set.add("123");
//        set.add(1);
//        set.add(true);
//        set.add("123");
//        System.out.println(set);
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println("---------");
//        //将while循环改成for循环,推荐使用
//        for(Iterator iter = set.iterator(); iter.hasNext();){
//            System.out.println(iter.next());
//        }

        TreeSet treeSet = new TreeSet();
        treeSet.add(34);
        treeSet.add(1);
        treeSet.add(65);
        System.out.println(treeSet);


    }
}
