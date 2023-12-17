package controller;

import model.Group;
import service.GroupService;
import view.GroupView;

public class GroupController {
    private Group model;
    private GroupView view;
    private GroupService service;

    public GroupController(Group model, GroupView view, GroupService service) {
        this.model = model;
        this.view = view;
        this.service = service;
    }

    public void updateView() {
        view.printGroupDetails(model.getName(), model.getTeacher().getName(), service.getStudentNames(model.getStudents()));
    }
}
