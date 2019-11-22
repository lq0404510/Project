package com.abcedu.ssm.user.service.bo;

/**
 * @program: Test01
 * @description:
 * @author: Every
 * @create: 2019-11-16 15:02
 **/
public class User {
    private int id;

    private String designation;

    private String detail;

    private String name;

    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}