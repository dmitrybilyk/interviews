package com.learn.hibernate.queries.hql.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 23.10.13
 * Time: 12:39
 * To change this template use File | Settings | File Templates.
 */

@Entity(name="com.learn.queries.hql.model.Group")
@Table(name="Groups")
public class Group {
    @Id
    @GeneratedValue
    private long id;

    private String groupName;

    @Column(nullable = true)
    private int studentsCount;

    public Group(String name) {
        this.groupName = name;
    }

    public Group() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }
}
