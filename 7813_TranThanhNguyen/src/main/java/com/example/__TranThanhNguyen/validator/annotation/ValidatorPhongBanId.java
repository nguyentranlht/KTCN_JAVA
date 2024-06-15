package com.example.__TranThanhNguyen.validator.annotation;

import com.example.__TranThanhNguyen.validator.ValidPhongBanIdValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({TYPE, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidPhongBanIdValidator.class)
@Documented
public @interface ValidatorPhongBanId {
    String message() default "Invalid phong ban id";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
