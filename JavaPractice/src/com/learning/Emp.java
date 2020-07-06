package com.learning;

import java.util.Objects;

public class Emp {
    private String name;
    private int empId;

    public Emp(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return empId == emp.empId &&
                name.equals( emp.name );
    }

   @Override
    public int hashCode() {
        return Objects.hash( name, empId );
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                '}';
    }
}

