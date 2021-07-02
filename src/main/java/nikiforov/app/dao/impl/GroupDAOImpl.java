package nikiforov.app.dao.impl;

import nikiforov.app.dao.GroupDAO;
import nikiforov.app.entity.Group;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GroupDAOImpl implements GroupDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Group> getAllGroups() {
        Session session = sessionFactory.getCurrentSession();

        List<Group> groupList = session.createQuery("from Group", Group.class).getResultList();

        return groupList;
    }

    @Override
    public void saveGroup(Group group) {
        Session session = sessionFactory.getCurrentSession();

        session.save(group);
    }

    @Override
    public Group getGroup(String name) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Group.class, name);
    }
}