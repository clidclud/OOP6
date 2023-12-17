import controller.GroupController;
import model.Group;
import model.Student;
import model.Teacher;
import service.GroupService;
import view.GroupView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Никитин Вольдемар Онисимович", 20);
        Student student2 = new Student("Суворов Федор Серапионович", 20);
        Student student3 = new Student("Меркушев Рудольф Донатович", 20);
        Teacher teacher = new Teacher("Мишин Влас Валентинович", "Алгоритмы и анализ сложности");
        List<Student> students = new ArrayList<>(Arrays.asList(student1, student2,student3));
        Group group = new Group("ИТ3826", students, teacher);

        GroupView view = new GroupView();
        GroupService service = new GroupService();
        GroupController controller = new GroupController(group, view, service);

        controller.updateView();
    }
}