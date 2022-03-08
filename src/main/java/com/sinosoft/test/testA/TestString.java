package com.sinosoft.test.testA;

import com.sinosoft.test.testA.bean.Address;
import com.sinosoft.test.testA.bean.Student;

/**
 * @Author TC
 * @Description TODO
 * @Date 2022/3/2 11:02
 */
public class TestString {
    public static void main(String[] args) {
//        String s1 = new String("hello");
//        String intern1 = s1.intern();
//        String s2 = "hello";
//        System.out.println(s1 == s2);
//        System.out.println("s1:"+s1.hashCode());
//        System.out.println("s2:"+s2.hashCode());
//        System.out.println("s1:"+System.identityHashCode(s1));
//        System.out.println("s2:"+System.identityHashCode(s2));
//
//        String s3 = new String("hello") + new String("hello");
//        String intern3 = s3.intern();
//        String s4 = "hellohello";
//        System.out.println(s3 == s4);
//        System.out.println("s1:"+System.identityHashCode(s3));
//        System.out.println("s2:"+System.identityHashCode(s4));

//        ThreadLocal<String> threadLocal = new ThreadLocal<>();
//        ThreadLocal<String> threadLocal2 = new ThreadLocal<>();
//        threadLocal.set("aaa");
//        System.out.println("threadLocal1:"+threadLocal.get());
//        threadLocal2.set("bbb");
//        System.out.println("threadLocal2:"+threadLocal2.get());
        Student student = new Student();
        student.setName("田超");
        student.setAge(30);
        Address address = new Address();
        address.setCity("河北省");
        address.setProvices("沧州市");
        student.setAddress(address);
        System.out.println("student:"+student);

        Student student1 = student;
        System.out.println("student1:"+student1);
    }
}
