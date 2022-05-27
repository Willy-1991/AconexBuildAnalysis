package com.oracle.tech.challenge.application.service;

import com.oracle.tech.challenge.entity.BuildRecord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BuildRecordMapperTest {

    @Test
    void mapToBuildRecord_valid_shouldMapToBuildRecord() {

        String[] params = {"2343225","2345","us_east","RedTeam","ProjectApple","3445s"};

        BuildRecord buildRecord = BuildRecordMapper.mapToBuildRecord(params);
        assertNotNull(buildRecord);
        assertEquals(buildRecord.getCustomerId(), 2343225);
        assertEquals(buildRecord.getContractId(), 2345);
        assertEquals(buildRecord.getGeoZone(), "us_east");
        assertEquals(buildRecord.getTeamCode(), "RedTeam");
        assertEquals(buildRecord.getProjectCode(), "ProjectApple");
        assertEquals(buildRecord.getBuildDuration(), "3445s");

    }


    @Test
    void mapToBuildRecord_missingParam_shouldReturnNull() {

        String[] params = {"2343225","2345","us_east","RedTeam","ProjectApple"};

        BuildRecord buildRecord = BuildRecordMapper.mapToBuildRecord(params);
        assertNull(buildRecord);

    }

    @Test
    void mapToBuildRecord_invalidCustomerId_shouldReturnNull() {

        String[] params = {"2343225D","2345","us_east","RedTeam","ProjectApple","3445s"};

        BuildRecord buildRecord = BuildRecordMapper.mapToBuildRecord(params);
        assertNull(buildRecord);

    }
}
