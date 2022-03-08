package com.sinosoft.test.testA.bean;

/**
 * @Author TC
 * @Description TODO
 * @Date 2022/3/8 14:35
 */
public class Student implements Cloneable{
    private String name;
    private int age;
    private Address address;
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = new Address();
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String provices,String city) {
        address.setAddress(provices, city);
    }
}
