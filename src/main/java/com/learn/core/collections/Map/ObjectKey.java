package com.learn.core.collections.Map;

import com.google.common.collect.ComparisonChain;

/**
 * Created by dik81 on 07.01.19.
 */
public class ObjectKey implements Comparable<ObjectKey> {
    private String name;
    private String lastName;
    private int age;

    public ObjectKey(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObjectKey objectKey = (ObjectKey) o;

        if (age != objectKey.age) return false;
        if (name != null ? !name.equals(objectKey.name) : objectKey.name != null) return false;
        return !(lastName != null ? !lastName.equals(objectKey.lastName) : objectKey.lastName != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(ObjectKey o) {
        return ComparisonChain.start()
                .compare(this.getLastName(), o.getLastName())
                .compare(this.getName(), o.getName())
                .compare(this.getAge(), o.getAge())
                .result();
    }
}
