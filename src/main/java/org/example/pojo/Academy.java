package org.example.pojo;

import java.util.List;

public class Academy {
    private int id;
    private String schoolname;
    List<Course> courselist;


    public Academy() {
    }

    public Academy(int id, String schoolname, List<Course> courselist) {
        this.id = id;
        this.schoolname = schoolname;
        this.courselist = courselist;
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
     * @return schoolname
     */
    public String getSchoolname() {
        return schoolname;
    }

    /**
     * 设置
     * @param schoolname
     */
    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    /**
     * 获取
     * @return courselist
     */
    public List<Course> getCourselist() {
        return courselist;
    }

    /**
     * 设置
     * @param courselist
     */
    public void setCourselist(List<Course> courselist) {
        this.courselist = courselist;
    }

    public String toString() {
        return "Academy{id = " + id + ", schoolname = " + schoolname + ", courselist = " + courselist + "}";
    }
}
