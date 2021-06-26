package nikiforov.app.dao;

import nikiforov.app.entity.Group;

import java.util.List;

/**
 * todo Document type GroupDAO
 */
public interface GroupDAO {
    List<Group> getAllGroups();

    void saveGroup(Group group);
}