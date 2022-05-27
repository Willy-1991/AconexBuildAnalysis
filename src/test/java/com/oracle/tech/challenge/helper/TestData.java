package com.oracle.tech.challenge.helper;

import com.oracle.tech.challenge.entity.BuildRecord;

public class TestData {

    public static BuildRecord getBuildRecord() {
        return new BuildRecord(1, 12,
                "us_east", "RedTeam",
                "Challenge", "1234s");
    }
}
