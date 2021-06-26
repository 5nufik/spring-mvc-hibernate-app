package nikiforov.app.entity;

import javax.persistence.*;

/**
 * todo Document type Group
 */

@Entity
@Table(
    name = "grups"
)
public class Group {

    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    private int groupID;

    private String groupName;

    public Group() {
    }

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Group{" +
            "groupID=" + groupID +
            ", groupName='" + groupName + '\'' +
            '}';
    }
}