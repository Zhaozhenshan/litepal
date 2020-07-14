package com.example.litepal;

import org.litepal.crud.LitePalSupport;

public class Album extends LitePalSupport {


    private String name;

    private float price;

    public void setName(String s)
    {
        this.name=s;
    }

    public String getName()
    {
        return name;
    }

    public void setPrice(float p)
    {
        this.price=p;
    }

    public float getPrice()
    {
        return price;
    }

}
