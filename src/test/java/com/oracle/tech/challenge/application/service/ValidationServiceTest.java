package com.oracle.tech.challenge.application.service;

import com.oracle.tech.challenge.entity.BuildRecord;
import com.oracle.tech.challenge.helper.TestData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidationServiceTest {

    private ValidationService validationService = new ValidationService();

    @Test
    void validateBuildRecord_valid_shouldReturnTrue() {

        BuildRecord buildRecord = TestData.getBuildRecord();
        Boolean isValid = validationService.validateBuildRecord(buildRecord);

        assertTrue(isValid);
    }

    @Test
    void validateBuildRecord_inValid_shouldReturnTrue() {

        BuildRecord buildRecord = TestData.getBuildRecord();
        buildRecord.setContractId(null);
        Boolean isValid = validationService.validateBuildRecord(buildRecord);

        assertFalse(isValid);
    }
}
