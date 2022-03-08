package com.sinosoft.test.testA;

import com.sinosoft.test.testA.bean.Student;

/**
 * @Author TC
 * @Description TODO
 * @Date 2022/3/2 11:02
 */
public class TestString {
    public static void main(String[] args) throws CloneNotSupportedException {
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
        Student student = new Student("田超",30);
        student.setAddress("河北省","沧州市");
        Student student2 = (Student)student.clone();
        student2.setName("lllll");


        System.out.println("student:"+student);
        System.out.println("student.getPname:"+student.getAddress().hashCode());
        System.out.println("student.getPname:"+student.getName());

        System.out.println("student2:"+student2);
        System.out.println("student2.getPname:"+student2.getAddress().hashCode());
        System.out.println("student2.getPname:"+student2.getName());

        student2.setAddress("北京市","通州区");

        System.out.println("student->address:"+student.getAddress().getCity() +":"+student.getAddress().getProvices());
        System.out.println("student2->address:"+student2.getAddress().getCity() +":"+student2.getAddress().getProvices());
    }
}
