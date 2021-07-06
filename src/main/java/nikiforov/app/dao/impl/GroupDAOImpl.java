package nikiforov.app.dao.impl;

import nikiforov.app.dao.GroupDAO;
import nikiforov.app.entity.Group;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import javax.persistence.Query;
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
    public Group getGroupByName(String name) {
        Session session = sessionFactory.getCurrentSession();

        try {
            Query query = session.createQuery("from Group where groupName = :name", Group.class);
            query.setParameter("name", name);
            return (Group) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}