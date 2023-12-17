package model;

import java.util.List;

public class Group {
    private String name;
    private List<Student> students;
    private Teacher teacher;

    public Group(String name, List<Student> students, Teacher teacher) {
        this.name = name;
        this.students = students;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
