package nikiforov.app.service.impl;

import nikiforov.app.dao.GroupDAO;
import nikiforov.app.entity.Group;
import nikiforov.app.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * todo Document type GroupServiceImpl
 */

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupDAO groupDAO;

    @Override
    @Transactional
    public List<Group> getAllGroups() {
        return groupDAO.getAllGroups();
    }

    @Override
    @Transactional
    public void saveGroup(Group group) {
        groupDAO.saveGroup(group);
    }
}