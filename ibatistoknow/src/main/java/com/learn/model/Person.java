package com.learn.model;

import java.util.Date;

public class Person {
 private int id;
 private String firstName;
 private String lastName;
 private Date birthDate;
 private double weightInKilograms;
 private double heightInMeters;

 public int getId () {
 return id;
 }
 public void setId (int id) {
 this.id = id;
 }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public double getWeightInKilograms() {
    return weightInKilograms;
  }

  public void setWeightInKilograms(double weightInKilograms) {
    this.weightInKilograms = weightInKilograms;
  }

  public double getHeightInMeters() {
    return heightInMeters;
  }

  public void setHeightInMeters(double heightInMeters) {
    this.heightInMeters = heightInMeters;
  }
}