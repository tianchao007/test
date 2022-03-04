package com.sinosoft.test.testA;

/**
 * @Author TC
 * @Description TODO
 * @Date 2022/3/2 11:02
 */
public class TestString {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String intern1 = s1.intern();
        String s2 = "hello";
        System.out.println(s1 == s2);
        System.out.println("s1:"+s1.hashCode());
        System.out.println("s2:"+s2.hashCode());
        System.out.println("s1:"+System.identityHashCode(s1));
        System.out.println("s2:"+System.identityHashCode(s2));

        String s3 = new String("hello") + new String("hello");
        String intern3 = s3.intern();
        String s4 = "hellohello";
        System.out.println(s3 == s4);
        System.out.println("s1:"+System.identityHashCode(s3));
        System.out.println("s2:"+System.identityHashCode(s4));
    }
    /**
     * 　　在jdk1.6下运行的结果为：
     * 　　false,false
     * 　　在jdk1.7,1.8下运行的结果为：
     * 　　false,true
     */

}
