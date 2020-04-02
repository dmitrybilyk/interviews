package com.learn.web.gwt.shared;

import java.io.Serializable;

public class Employee implements Serializable {
   private int employeeId;
   private String employeeName;
   private double salary;
   private String deptName;

   public Employee() {
   }

   public int getEmployeeId() {
      return employeeId;
   }
   public void setEmployeeId(int employeeId) {
      this.employeeId = employeeId;
   }
   public String getEmployeeName() {
      return employeeName;
   }
   public void setEmployeeName(String employeeName) {
      this.employeeName = employeeName;
   }
   public double getSalary() {
      return salary;
   }
   public void setSalary(double salary) {
      this.salary = salary;
   }
   public String getDeptName() {
      return deptName;
   }
   public void setDeptName(String deptName) {
      this.deptName = deptName;
   }
}
