package com.jwbdcustomermanagement.model;

import java.time.LocalDate;

public class Student {
    private int id;
    private String name;
    private Double point;
    private LocalDate date;

    public Student() {
    }

    public Student(int id, String name, Double point, int year, int month, int day) {
        this.id = id;
        this.name = name;
        this.point = point;
        this.date = LocalDate.of(year,month,day);
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

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
