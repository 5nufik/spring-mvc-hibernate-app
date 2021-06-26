package nikiforov.app.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(
    validatedBy = CheckGroupValidator.class
)
public @interface CheckGroup {

    String message() default "Данная группа уже существует";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}