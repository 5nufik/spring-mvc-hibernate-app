package nikiforov.app.entity;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Table(
    name = "grups"
)
public class Group {

    @Id
    @Pattern(
        regexp = "^\\S{3,30}$",
        message = "Название может содержать от 3 до 30 символов без пробелов"
    )
    private String groupName;

    public Group() {
    }

    public Group(String groupName) {
        this.groupName = groupName;
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
            ", groupName='" + groupName + '\'' +
            '}';
    }
}