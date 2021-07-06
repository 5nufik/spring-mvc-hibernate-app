package nikiforov.app.service;

import nikiforov.app.entity.Group;

import java.util.List;

public interface GroupService {
    List<Group> getAllGroups();

    void saveGroup(Group group);

    Group getGroupByName(String name);

    Group getGroupById(int id);
}