package nikiforov.app.service;

import nikiforov.app.entity.Group;

import java.util.List;
import java.util.Map;

/**
 * todo Document type GroupService
 */

public interface GroupService {
    List<Group> getAllGroups();

    void saveGroup(Group group);
}