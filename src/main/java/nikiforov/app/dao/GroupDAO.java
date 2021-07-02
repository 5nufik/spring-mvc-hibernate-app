package nikiforov.app.dao;

import nikiforov.app.entity.Group;

import java.util.List;

public interface GroupDAO {
    List<Group> getAllGroups();

    void saveGroup(Group group);

    Group getGroup(String name);
}