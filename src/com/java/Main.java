package com.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("This is my First Git Project with Intellij");

        final List<Persion> list = new ArrayList();
        Persion p = new Persion("A",23,1234);
        Persion p1 = new Persion("B", 25, 12367);
        Persion p2 = new Persion("C", 26,23451);
        Persion p3 = new Persion("D", 32, 98272);
        Persion p4 = new Persion("E",34,123451);
        list.add(p);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

    }
}
class Persion{

    private String name;
    private int age;
    private  int id;

    public Persion(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
