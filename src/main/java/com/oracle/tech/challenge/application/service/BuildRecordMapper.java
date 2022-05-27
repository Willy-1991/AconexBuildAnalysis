package com.oracle.tech.challenge.application.service;

import com.oracle.tech.challenge.entity.BuildRecord;

public class BuildRecordMapper {

    public static BuildRecord mapToBuildRecord(String[] params) {
        try {
           return new BuildRecord(Integer.parseInt(params[0]),
                    Integer.parseInt(params[1]),
                    params[2],
                    params[3],
                    params[4],
                    params[5]);
        }
        catch (Exception e) {
           return null;
        }
    }
}
