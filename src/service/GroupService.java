package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class GroupService {
    public List<String> getStudentNames(List<Student> students) {
        List<String> studentNames = new ArrayList<>();
        for (Student student : students) {
            studentNames.add(student.getName());
        }
        return studentNames;
    }
}
