package com;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ConcurrentListExample {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
    	//List<String> list = new ArrayList<String>();
        list.add("CONFIG_1");
        list.add("CONFIG_2");

        for (String value : list) {
            list.add("NEW_CONFIG");
            System.out.println(value);
        }

        System.out.println("Final List: " + list);
    }
}

