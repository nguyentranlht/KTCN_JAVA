package com.example.__TranThanhNguyen.validator;


import com.example.__TranThanhNguyen.entity.PHONGBAN;
import com.example.__TranThanhNguyen.validator.annotation.ValidatorPhongBanId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidPhongBanIdValidator implements ConstraintValidator<ValidatorPhongBanId, PHONGBAN> {
    @Override
    public boolean isValid(PHONGBAN phongban, ConstraintValidatorContext context) {
        return phongban != null && phongban.getId() != null;
    }
}
