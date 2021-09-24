package com.erivid.Employees_Organiser.models;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "Employee_Type")
public class EmployeeType {
    @Id
    @SequenceGenerator(name = "employeeType_sequence", sequenceName = "employeeType_sequence", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "employeeType_sequence")
    @Column(name = "Id", updatable = false)
    private Integer Id;

    @Column(name = "Type_Name", nullable = false)
    private String typeName;

    public EmployeeType() {
    }

    public EmployeeType(String typeName) {
        this.typeName = typeName;
    }

    public EmployeeType(Integer id, String typeName) {
        Id = id;
        this.typeName = typeName;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "EmployeeType{" +
                "Id=" + Id +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
