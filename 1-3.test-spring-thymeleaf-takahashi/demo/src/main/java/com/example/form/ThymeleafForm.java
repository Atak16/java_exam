package com.example.form;

import java.util.List;

public class ThymeleafForm {
    private String name;
    private String age;
    private List<String> hobbyList;

    public int getAgeInt() {
        return Integer.parseInt(age);
    }
    public int setAgeInt() {
        return Integer.parseInt(age);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public List<String> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }
    @Override
    public String toString() {
        return "ThymeleafForm [name=" + name + ", age=" + age + ", hobbyList=" + hobbyList + "]";
    }


}
