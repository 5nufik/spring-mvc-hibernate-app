package nikiforov.app.validation;

import nikiforov.app.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckGroupValidator implements ConstraintValidator<CheckGroup, String> {

    @Autowired
    private GroupService groupService;

    public void initialize(CheckGroup constraint) {
    }

    public boolean isValid(String enteredValue, ConstraintValidatorContext context) {
        if(groupService == null){
            return true;
        }
        return groupService.getGroupByName(enteredValue) == null;
    }
}