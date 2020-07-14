package com.example.litepal;

import org.litepal.crud.LitePalSupport;

public class Song extends LitePalSupport {

    private String name;

    private int duration;

    public void setName(String s)
    {
        this.name=s;
    }

    public String getName()
    {
        return name;
    }

    public void setDuration(int s)
    {
        this.duration=s;
    }

    public int getDuration()
    {
        return duration;
    }

}
