package com.nest.courseapp_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;

    private String courseTitle;
    private String courseDescription;
    private String courseVenue;
    private int  duration;
    private String courseDate;

    public Course() {
    }

    public Course(int id, String courseTitle, String courseDescription, String courseVenue, int duration, String courseDate) {
        this.id = id;
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
        this.courseVenue = courseVenue;
        this.duration = duration;
        this.courseDate = courseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseVenue() {
        return courseVenue;
    }

    public void setCourseVenue(String courseVenue) {
        this.courseVenue = courseVenue;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(String courseDate) {
        this.courseDate = courseDate;
    }
}
