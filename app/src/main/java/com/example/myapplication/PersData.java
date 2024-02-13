package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class PersData {
    public PersData(int id, String name, String num) {
        this.id = id;
        this.name = name;
        this.num = num;

        data = new ArrayList<>();
        data.add(new PetData("abobus", "pitonoves"));
        data.add(new PetData("iosif", "komunist"));
        data.add(new PetData("rusicka", "sobaka"));

    }
    public int id;
    public String name;

    public String num;
    public List<PetData> data;
}
