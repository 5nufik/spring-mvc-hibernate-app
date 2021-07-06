package nikiforov.app.dao.impl;

import nikiforov.app.dao.GroupDAO;
import nikiforov.app.entity.Group;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
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

        session.saveOrUpdate(group);
    }

    @Override
    public Group getGroupByName(String groupName) {
        Session session = sessionFactory.getCurrentSession();

        try {
            Query<Group> query = session.createQuery("from Group where groupName = :groupName");
            query.setParameter("groupName", groupName);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public Group getGroupById(int groupId) {
        return sessionFactory.getCurrentSession().get(Group.class, groupId);
    }

    @Override
    public boolean deleteGroup(int groupId) {
        Query<Group> query = sessionFactory.getCurrentSession().createQuery("delete from Group where groupID = :groupId");
        query.setParameter("groupId", groupId);

        try {
            query.executeUpdate();
            return true;
        } catch (PersistenceException e) {
            return false;
        }
    }
}