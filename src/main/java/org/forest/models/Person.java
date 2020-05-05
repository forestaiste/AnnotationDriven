package org.forest.models;


import org.springframework.beans.factory.annotation.Value;

public class Person {

    @Value("zhangsan")
    private String chineseName;
    @Value("#{20 - 2}")
    private Integer age;
    @Value("${nickName}")
    private String nickName;

    public Person() {
        super();
    }

    public Person(String name, Integer age, String nickName) {
        this.chineseName = name;
        this.age = age;
        this.nickName = nickName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + chineseName + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}

