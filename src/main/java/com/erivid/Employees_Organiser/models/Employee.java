package com.erivid.Employees_Organiser.models;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name="Employee")
public class Employee {

        @Id
        @SequenceGenerator(name = "employee_sequence", sequenceName = "employee_sequence", allocationSize = 1)
        @GeneratedValue(strategy = SEQUENCE, generator = "employee_sequence")
        @Column(name = "Id", updatable = false)
        private Integer Id;

        @Column(name = "First_Name", nullable = false)
        private String firstName;

        @Column(name = "Last_Name", nullable = false)
        private String lastName;

        public Employee() {
        }

        public Employee(Integer id, String firstName, String lastName) {
            this.Id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Employee(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Integer getId() {
            return Id;
        }

        public void setId(Integer id) {
            Id = id;
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

        @Override
        public String toString() {
            return "Employee{" +
                    "Id=" + Id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }

}
