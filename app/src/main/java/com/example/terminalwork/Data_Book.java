package com.example.terminalwork;

import org.litepal.crud.DataSupport;

import java.sql.Date;

public class Data_Book extends DataSupport {
    private int b_id;
    private String b_name;
    private String b_picture;
    private String b_actor;
    private Date b_date;
    private String b_content;
    private String b_type;

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getB_picture() {
        return b_picture;
    }

    public void setB_picture(String b_picture) {
        this.b_picture = b_picture;
    }

    public String getB_actor() {
        return b_actor;
    }

    public void setB_actor(String b_actor) {
        this.b_actor = b_actor;
    }

    public Date getB_date() {
        return b_date;
    }

    public void setB_date(Date b_date) {
        this.b_date = b_date;
    }

    public String getB_content() {
        return b_content;
    }

    public void setB_content(String b_content) {
        this.b_content = b_content;
    }

    public String getB_type() {
        return b_type;
    }

    public void setB_type(String b_type) {
        this.b_type = b_type;
    }

}
