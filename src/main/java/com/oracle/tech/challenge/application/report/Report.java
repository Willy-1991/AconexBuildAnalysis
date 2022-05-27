package com.oracle.tech.challenge.application.report;

import com.oracle.tech.challenge.entity.BuildRecord;

import java.util.List;

public interface Report {

    void run(List<BuildRecord> buildRecords);

}
