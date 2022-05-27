package com.oracle.tech.challenge.application.service;

import com.oracle.tech.challenge.entity.BuildRecord;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class ValidationService {

    private Validator validator;

    public ValidationService() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    public Boolean validateBuildRecord(BuildRecord buildRecord) {
        Set<ConstraintViolation<BuildRecord>> violations = validator.validate(buildRecord);
        return violations.isEmpty() ? Boolean.TRUE : Boolean.FALSE;

    }
}
