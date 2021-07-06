package nikiforov.app.service.impl;

import nikiforov.app.dao.GroupDAO;
import nikiforov.app.entity.Group;
import nikiforov.app.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    @Transactional
    public Group getGroupByName(String name) {
        return groupDAO.getGroupByName(name);
    }

    @Override
    @Transactional
    public Group getGroupById(int id) {
        return groupDAO.getGroupById(id);
    }
}