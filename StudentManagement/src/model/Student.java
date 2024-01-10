package model;

import java.io.Serializable;

public abstract class Student implements Rank, Evaluate, Serializable {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String major;
    public Student() {
    }
    public Student(int id, String name, int age, String sex, String major) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.major = major;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", major='" + major + '\'';
    }

    public abstract double averageOfSubject();

    @Override
    public void conduct() {}
}
