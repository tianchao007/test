package com.sinosoft.test.testA.bean;

/**
 * @Author TC
 * @Description TODO
 * @Date 2022/3/8 14:36
 */
public class Address {
    private String provices;
    private String city;

    public Address(String provices, String city) {
        this.provices = provices;
        this.city = city;
    }

    public Address() {
    }

    public String getProvices() {
        return provices;
    }

    public void setProvices(String provices) {
        this.provices = provices;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
