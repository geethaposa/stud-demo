package org.example.demo; // Declares that this class is part of the package 'org.example.demo'

public class Student { // Declares a public class named 'Student'

    private int id;          // Private field to store the student's ID
    private String name;     // Private field to store the student's name
    private String course;   // Private field to store the student's course

    public Student() {} // Default no-argument constructor (needed for frameworks like Spring or Jackson)

    // Parameterized constructor to initialize a new Student object with specific values
    public Student(int id, String name, String course) {
        this.id = id;           // Assigns the passed 'id' to the 'id' field
        this.name = name;       // Assigns the passed 'name' to the 'name' field
        this.course = course;   // Assigns the passed 'course' to the 'course' field
    }

    // Getter method for 'id' - allows external access to the private 'id' field
    public int getId() { return id; }

    // Setter method for 'id' - allows external code to set the value of 'id'
    public void setId(int id) { this.id = id; }

    // Getter method for 'name' - returns the student's name
    public String getName() { return name; }

    // Setter method for 'name' - sets the student's name
    public void setName(String name) { this.name = name; }

    // Getter method for 'course' - returns the student's course
    public String getCourse() { return course; }

    // Setter method for 'course' - sets the student's course
    public void setCourse(String course) { this.course = course; }
}
