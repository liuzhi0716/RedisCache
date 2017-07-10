package com.ecnu.dao.domain;

import java.io.Serializable;

/**
 * Created by admin on 2017/7/10.
 */
public class Product implements Serializable{

    private long id;
    private  String name;
    private  long price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long prive) {
        this.price = prive;
    }
}
