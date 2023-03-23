package org.example.pojo;

import java.util.List;

public class Course {
    private int id;
    private String name;
    private int hours;
    private int sid;


    public Course() {
    }

    public Course(int id, String name, int hours, int sid) {
        this.id = id;
        this.name = name;
        this.hours = hours;
        this.sid = sid;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * 设置
     * @param hours
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * 获取
     * @return sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * 设置
     * @param sid
     */
    public void setSid(int sid) {
        this.sid = sid;
    }

    public String toString() {
        return "Course{id = " + id + ", name = " + name + ", hours = " + hours + ", sid = " + sid + "}";
    }
}
