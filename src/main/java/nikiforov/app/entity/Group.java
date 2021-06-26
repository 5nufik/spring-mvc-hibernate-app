package nikiforov.app.entity;

import nikiforov.app.validation.CheckGroup;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(
    name = "grups"
)
public class Group {
    @Id
    @NotBlank (
        message = "Название не должно быть пустым"
    )
    @Size(
        min = 3,
        max = 30,
        message = "Название может содержать от 3 до 30 символов"
    )
    @CheckGroup
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