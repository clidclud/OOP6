package view;

import java.util.List;

public class GroupView {
    public void printGroupDetails(String groupName, String teacherName, List<String> studentNames) {
        System.out.println("Группа: " + groupName);
        System.out.println("Преподаватель: " + teacherName);
        System.out.println("Студенты: " + String.join(", ", studentNames));
    }
}
